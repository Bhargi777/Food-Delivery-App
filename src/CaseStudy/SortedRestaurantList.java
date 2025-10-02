package CaseStudy;

/**
 * A simple container for the sorted list of restaurants.
 * Team Member 2 - Core Algorithms (Sorting & Searching)
 */
public class SortedRestaurantList {
    Restaurant[] restaurants;
    int n;

    public SortedRestaurantList(Restaurant[] restaurants) {
        this.restaurants = restaurants; 
        this.n = restaurants.length;
    }
}
