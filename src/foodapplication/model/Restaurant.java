package foodApplication.model;

import java.util.List;

public class Restaurant {
    private String name;
    private int location;
    private double rating;
    private String cuisine;
    private List<MenuItem> menu;

    public Restaurant(String name, int location, double rating, String cuisine, List<MenuItem> menu) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.cuisine = cuisine;
        this.menu = menu;
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
    
    public String getCuisine() { 
        return cuisine; 
    }
    
    public List<MenuItem> getMenu() { 
        return menu; 
    }

    @Override
    public String toString() {
        return "Restaurant{name='" + name + "', location=" + location + "km, rating=" + rating + ", cuisine='" + cuisine + "'}";
    }
}