package foodApplication.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import foodApplication.model.Restaurant;

public class RestaurantSegmentTree {
    private class Node {
        int left, right;
        List<Restaurant> restaurants;
        Node leftChild, rightChild;

        Node(int l, int r) {
            left = l;
            right = r;
            restaurants = new ArrayList<>();
        }
    }

    private Node root;
    private Restaurant[] sortedRestaurants;

    public RestaurantSegmentTree(Restaurant[] restaurants) {
        Arrays.sort(restaurants, (a, b) -> Integer.compare(a.getLocation(), b.getLocation()));
        sortedRestaurants = restaurants;
        root = build(0, sortedRestaurants.length - 1);
    }

    private Node build(int l, int r) {
        Node node = new Node(l, r);
        if (l == r) {
            node.restaurants.add(sortedRestaurants[l]);
            return node;
        }
        int mid = (l + r) / 2;
        node.leftChild = build(l, mid);
        node.rightChild = build(mid + 1, r);
        node.restaurants.addAll(node.leftChild.restaurants);
        node.restaurants.addAll(node.rightChild.restaurants);
        return node;
    }

    public List<Restaurant> queryRange(int locLeft, int locRight) {
        return query(root, locLeft, locRight);
    }

    private List<Restaurant> query(Node node, int l, int r) {
        if (node == null || sortedRestaurants[node.left].getLocation() > r || sortedRestaurants[node.right].getLocation() < l) {
            return new ArrayList<>();
        }
        if (sortedRestaurants[node.left].getLocation() >= l && sortedRestaurants[node.right].getLocation() <= r) {
            return node.restaurants;
        }
        List<Restaurant> res = new ArrayList<>();
        res.addAll(query(node.leftChild, l, r));
        res.addAll(query(node.rightChild, l, r));
        return res;
    }
}