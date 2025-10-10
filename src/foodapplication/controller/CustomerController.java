package foodApplication.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import foodApplication.model.MenuItem;
import foodApplication.model.OrderItem;
import foodApplication.model.Restaurant;
import foodApplication.util.RestaurantSegmentTree;

public class CustomerController {

    public static void runCustomerLoop(List<Restaurant> restaurants, Scanner scanner) {
        Restaurant[] restaurantArray = restaurants.toArray(new Restaurant[0]);
        RestaurantSegmentTree segTree = new RestaurantSegmentTree(restaurantArray);
        List<OrderItem> currentOrder = new ArrayList<>();

        System.out.println("\nWelcome, Customer! Let's find you something to eat.");
        System.out.print("To get started, please enter your current location (e.g., 10): ");
        int userLocation = scanner.nextInt();

        boolean stayInMenu = true;
        while (stayInMenu) {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. Search for Food to Add to Order");
            System.out.println("2. View Current Order");
            System.out.println("3. Finish Order & Checkout");
            System.out.println("4. Back to Main Menu");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performSearchAndAddItem(scanner, segTree, userLocation, currentOrder);
                    break;
                case 2:
                    viewOrder(currentOrder, false);
                    break;
                case 3:
                    viewOrder(currentOrder, true);
                    System.out.println("Order placed successfully!");
                    stayInMenu = false;
                    break;
                case 4:
                    stayInMenu = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void performSearchAndAddItem(Scanner scanner, RestaurantSegmentTree segTree, int userLocation, List<OrderItem> order) {
        System.out.println("\nSearching from your fixed location: " + userLocation + "km");
        System.out.print("How far are you willing to search? (Enter a radius, e.g., 5): ");
        int searchRadius = scanner.nextInt();

        int minLocation = Math.max(0, userLocation - searchRadius);
        int maxLocation = userLocation + searchRadius;
        System.out.println("\nSearching for restaurants between " + minLocation + "km and " + maxLocation + "km...");

        List<Restaurant> availableRestaurants = segTree.queryRange(minLocation, maxLocation);

        if (availableRestaurants.isEmpty()) {
            System.out.println("\nSorry, we couldn't find any restaurants in that range.");
            return;
        }

        System.out.println("\nSuccess! We found " + availableRestaurants.size() + " restaurant(s) for you:");
        for (int i = 0; i < availableRestaurants.size(); i++) {
            System.out.println((i + 1) + ". " + availableRestaurants.get(i).getName());
        }

        System.out.print("\nPlease select a restaurant by number: ");
        int restaurantChoice = scanner.nextInt();

        if (restaurantChoice > 0 && restaurantChoice <= availableRestaurants.size()) {
            Restaurant selectedRestaurant = availableRestaurants.get(restaurantChoice - 1);
            addFoodItemToOrder(scanner, selectedRestaurant, order);
        } else {
            System.out.println("Invalid restaurant choice.");
        }
    }

    private static void addFoodItemToOrder(Scanner scanner, Restaurant restaurant, List<OrderItem> order) {
        System.out.println("\n--- Menu for " + restaurant.getName() + " ---");
        List<MenuItem> menu = restaurant.getMenu();
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }

        System.out.print("\nPlease select a food item by number to add to your order: ");
        int foodChoice = scanner.nextInt();

        if (foodChoice > 0 && foodChoice <= menu.size()) {
            MenuItem selectedFood = menu.get(foodChoice - 1);
            order.add(new OrderItem(selectedFood, restaurant));
            System.out.println("Success '" + selectedFood.getName() + "' has been added to your order.");
        } else {
            System.out.println("Invalid food choice.");
        }
    }

    public static void viewOrder(List<OrderItem> order, boolean isFinalBill) {
        String title = isFinalBill ? "--- Final Bill ---" : "--- Current Order ---";
        System.out.println("\n" + title);

        if (order.isEmpty()) {
            System.out.println("Your order is currently empty.");
            return;
        }

        double total = 0.0;
        for (OrderItem orderItem : order) {
            System.out.printf("Item: %-25s From: %-15s Price: $%.2f\n",
                orderItem.getMenuItem().getName(), orderItem.getRestaurant().getName(), orderItem.getMenuItem().getPrice());
            total += orderItem.getMenuItem().getPrice();
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Grand Total: $%.2f\n", total);
        System.out.println("---------------------------------------------------------------");
    }
}