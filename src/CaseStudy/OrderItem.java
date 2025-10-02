package CaseStudy;

/**
 * A helper class to store a selected menu item along with the restaurant it came from.
 * Team Member 1 - Foundational Data Models & Data Provider
 */
public class OrderItem {
    private MenuItem menuItem;
    private Restaurant restaurant;

    public OrderItem(MenuItem menuItem, Restaurant restaurant) {
        this.menuItem = menuItem;
        this.restaurant = restaurant;
    }

    public MenuItem getMenuItem() { 
        return menuItem; 
    }

    public Restaurant getRestaurant() { 
        return restaurant; 
    }
}
