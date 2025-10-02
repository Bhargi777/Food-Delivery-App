package CaseStudy;

/**
 * Handles sorting the restaurant data using a custom-implemented Insertion Sort.
 * Team Member 2 - Core Algorithms (Sorting & Searching)
 */
public class RestaurantSorter {

    public static SortedRestaurantList buildSortedRestaurantList(Restaurant[] restaurants) {
        insertionSortByLocation(restaurants);
        return new SortedRestaurantList(restaurants);
    }

    private static void insertionSortByLocation(Restaurant[] restaurants) {
        int n = restaurants.length;
        for (int i = 1; i < n; ++i) {
            Restaurant key = restaurants[i];
            int j = i - 1;
            while (j >= 0 && restaurants[j].getLocation() > key.getLocation()) {
                restaurants[j + 1] = restaurants[j];
                j = j - 1;
            }
            restaurants[j + 1] = key;
        }
    }
}
