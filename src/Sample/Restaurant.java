package Sample;

import java.util.List;

/**
 * Data Model for a Restaurant.
 * Team Member 1 - Foundational Data Models & Data Provider
 */
public class Restaurant {
    private String name;
    private int location;
    private double rating;
    private String cuisine;
    private List<MenuItem> menu;

    public Restaurant(String n, int l, double r, String c, List<MenuItem> m) {
        name = n; 
        location = l; 
        rating = r; 
        cuisine = c; 
        menu = m;
    }

    public String getName() { 
        return name; 
    }

    public int getLocation() { 
        return location; 
    }

    public double getRating() { 
        return rating; 
    }

    public List<MenuItem> getMenu() { 
        return menu; 
    }

    @Override
    public String toString() {
        return "Restaurant{name='" + name + "', location=" + location + "km, rating=" + rating + ", cuisine='" + cuisine + "'}";
    }
}
