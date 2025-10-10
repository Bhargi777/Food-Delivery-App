package foodApplication.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import foodApplication.data.DataProvider;
import foodApplication.model.MenuItem;
import foodApplication.model.Restaurant;

public class ApplicationController {
    public static void startApplication() {
        System.out.println("Initializing Food Delivery App...");
        List<Restaurant> restaurants = DataProvider.createRestaurantData();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-- Welcome to the Food Delivery App --");
            System.out.println("1. I'm a Customer");
            System.out.println("2. I'm an Admin");
            System.out.println("3. Exit Application");
            System.out.print("Please select your role: ");
            int roleChoice;
            try {
                roleChoice = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            switch(roleChoice) {
                case 1:
                    CustomerController.runCustomerLoop(restaurants, scanner);
                    break;
                case 2:
                    runAdminLoop(restaurants, scanner);
                    break;
                case 3:
                    System.out.println("\nThank you for using the app! Goodbye.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void runAdminLoop(List<Restaurant> restaurants, Scanner scanner) {
        boolean stayInMenu = true;
        while(stayInMenu) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add New Restaurant");
            System.out.println("2. Add Dish to Existing Restaurant");
            System.out.println("3. View All Restaurants");
            System.out.println("4. Back to Main Menu");
            System.out.print("Please choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch(choice) {
                case 1:
                    addNewRestaurant(restaurants, scanner);
                    break;
                case 2:
                    addDishToRestaurant(restaurants, scanner);
                    break;
                case 3:
                    DataProvider.displayAllRestaurants(restaurants);
                    break;
                case 4:
                    stayInMenu = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addNewRestaurant(List<Restaurant> restaurants, Scanner scanner) {
        try {
            System.out.println("\n-- Adding New Restaurant --");
            System.out.print("Enter restaurant name: ");
            String name = scanner.nextLine();
            System.out.print("Enter cuisine type: ");
            String cuisine = scanner.nextLine();
            System.out.print("Enter location (distance in km): ");
            int location = scanner.nextInt();
            System.out.print("Enter rating (e.g., 4.5): ");
            double rating = scanner.nextDouble();
            scanner.nextLine(); 

            Restaurant newRestaurant = new Restaurant(name, location, rating, cuisine, new ArrayList<>());
            restaurants.add(newRestaurant);
            System.out.println("Success '" + name + "' has been added.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type. Please try again.");
            scanner.nextLine(); 
        }
    }

    private static void addDishToRestaurant(List<Restaurant> restaurants, Scanner scanner) {
        System.out.println("\n-- Add Dish to a Restaurant --");
        if (restaurants.isEmpty()) {
            System.out.println("No restaurants exist. Please add a restaurant first.");
            return;
        }

        System.out.println("Select a restaurant to add a dish to:");
        for(int i = 0; i < restaurants.size(); i++) {
            System.out.println((i + 1) + ". " + restaurants.get(i).getName());
        }
        System.out.print("Enter your choice: ");
        
        try {
            int restChoice = scanner.nextInt();
            scanner.nextLine();

            if (restChoice > 0 && restChoice <= restaurants.size()) {
                Restaurant selectedRestaurant = restaurants.get(restChoice - 1);

                System.out.print("Enter the name of the new dish: ");
                String dishName = scanner.nextLine();
                System.out.print("Enter the price of the dish: ");
                double dishPrice = scanner.nextDouble();
                scanner.nextLine(); 

                selectedRestaurant.getMenu().add(new MenuItem(dishName, dishPrice));
                System.out.println("Success '" + dishName + "' has been added to the menu of '" + selectedRestaurant.getName() + "'.");

            } else {
                System.out.println("Invalid restaurant choice.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type. Please try again.");
            scanner.nextLine(); 
        }
    }
}