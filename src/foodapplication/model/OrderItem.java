package foodApplication.model;

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