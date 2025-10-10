package foodApplication.model;

public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { 
        return price; 
    }
    
    public String getName() { 
        return name; 
    }

    @Override
    public String toString() {
        return String.format("%-25s - $%.2f", name, price);
    }
}