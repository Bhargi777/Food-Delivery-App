package foodApplication.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import foodApplication.model.MenuItem;
import foodApplication.model.Restaurant;

public class DataProvider {
    public static List<Restaurant> createRestaurantData() {
        List<MenuItem> italianMenu = new ArrayList<>(List.of(
            new MenuItem("Margherita Pizza", 12.50),
            new MenuItem("Spaghetti Carbonara", 15.00),
            new MenuItem("Lasagna", 14.00)
        ));
        
        List<MenuItem> mexicanMenu = new ArrayList<>(List.of(
            new MenuItem("Chicken Tacos", 10.00),
            new MenuItem("Beef Burrito", 11.50),
            new MenuItem("Quesadillas", 9.00)
        ));
        
        List<MenuItem> americanMenu = new ArrayList<>(List.of(
            new MenuItem("Cheeseburger", 13.00),
            new MenuItem("BBQ Ribs", 18.50),
            new MenuItem("Fries", 4.50)
        ));
        
        List<MenuItem> japaneseMenu = new ArrayList<>(List.of(
            new MenuItem("Sushi Platter", 25.00),
            new MenuItem("Ramen", 16.00),
            new MenuItem("Tempura", 12.00)
        ));
        
        List<MenuItem> indianMenu = new ArrayList<>(List.of(
            new MenuItem("Butter Chicken", 17.00),
            new MenuItem("Palak Paneer", 15.00),
            new MenuItem("Naan Bread", 3.50)
        ));
        
        List<MenuItem> vietnameseMenu = new ArrayList<>(List.of(
            new MenuItem("Pho Bo (Beef)", 14.00),
            new MenuItem("Banh Mi Sandwich", 9.50),
            new MenuItem("Spring Rolls", 7.00)
        ));

        Restaurant[] initialRestaurants = new Restaurant[]{
            new Restaurant("Pizza Palace", 5, 4.5, "Italian", italianMenu),
            new Restaurant("Taco Town", 2, 4.2, "Mexican", mexicanMenu),
            new Restaurant("Burger Barn", 8, 4.8, "American", americanMenu),
            new Restaurant("Sushi Spot", 15, 4.9, "Japanese", japaneseMenu),
            new Restaurant("Curry Corner", 12, 4.6, "Indian", indianMenu),
            new Restaurant("Pho Phanatic", 20, 4.7, "Vietnamese", vietnameseMenu),
            new Restaurant("Pasta Place", 1, 4.0, "Italian", italianMenu),
            new Restaurant("Steak House", 18, 4.8, "Steakhouse", americanMenu),
            new Restaurant("The Salad Bar", 9, 4.4, "Healthy", new ArrayList<>(List.of(
                new MenuItem("Caesar Salad", 10.0),
                new MenuItem("Greek Salad", 11.0)
            ))),
            new Restaurant("Dosa Den", 13, 4.5, "South Indian", new ArrayList<>(List.of(
                new MenuItem("Masala Dosa", 8.0),
                new MenuItem("Idli Sambar", 7.5)
            )))
        };
        
        return new ArrayList<>(Arrays.asList(initialRestaurants));
    }

    public static void displayAllRestaurants(List<Restaurant> restaurants) {
        System.out.println("\n--- All Available Restaurants ---");
        if (restaurants.isEmpty()) {
            System.out.println("No restaurants available at the moment.");
        } else {
            for (Restaurant r : restaurants) {
                System.out.println(" - " + r.getName() + " (Location: " + r.getLocation() + "km, Rating: " + r.getRating() + ")");
            }
        }
        System.out.println("---------------------------------");
    }
}