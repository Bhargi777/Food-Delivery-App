package CaseStudy;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements an efficient binary search algorithm to find restaurants in a given range.
 * Team Member 2 - Core Algorithms (Sorting & Searching)
 */
public class RestaurantFinder {
    public static List<Restaurant> findRestaurantsInRange(SortedRestaurantList sortedList, int locLeft, int locRight) {
        Restaurant[] restaurants = sortedList.restaurants;
        int leftIndex = findFirstLocationIndex(restaurants, locLeft);
        int rightIndex = findLastLocationIndex(restaurants, locRight);
        List<Restaurant> results = new ArrayList<>();

        if (leftIndex == -1 || rightIndex == -1 || leftIndex > rightIndex) {
            return results;
        }

        for (int i = leftIndex; i <= rightIndex; i++) {
            results.add(restaurants[i]);
        }
        return results;
    }

    private static int findFirstLocationIndex(Restaurant[] restaurants, int loc) {
        int low = 0, high = restaurants.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (restaurants[mid].getLocation() >= loc) { 
                ans = mid; 
                high = mid - 1; 
            } else { 
                low = mid + 1; 
            }
        }
        return ans;
    }

    private static int findLastLocationIndex(Restaurant[] restaurants, int loc) {
        int low = 0, high = restaurants.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (restaurants[mid].getLocation() <= loc) { 
                ans = mid; 
                low = mid + 1; 
            } else { 
                high = mid - 1; 
            }
        }
        return ans;
    }
}
