# Food Delivery Application - Team Project

## Team Members and Responsibilities

**R Srija : Foundational Data Models & Data Provider**
- MenuItem.java
- OrderItem.java  
- Restaurant.java
- DataProvider.java

**A Ravi Teja Reddy : Core Algorithms (Sorting & Searching)**
- SortedRestaurantList.java
- RestaurantSorter.java
- RestaurantFinder.java

**M K Bhargava Sri Sai : Main Application Flow & Admin Panel**
- ApplicationController.java
- FoodDeliveryApp.java (Main class)

**K B Kali Priya : Customer-Facing Experience**
- CustomerController.java

## How to Run

Run the main class (FoodDeliveryApp.java). 

## Project Structure
```
FoodDeliveryApp/
├── src/
│   └── Sample/
│       ├── MenuItem.java
│       ├── OrderItem.java
│       ├── Restaurant.java
│       ├── DataProvider.java
│       ├── SortedRestaurantList.java
│       ├── RestaurantSorter.java
│       ├── RestaurantFinder.java
│       ├── ApplicationController.java
│       ├── CustomerController.java
│       └── FoodDeliveryApp.java
├── bin/ 
└── README.md
```

## Features

### Admin Features:
- Add new restaurants
- Add dishes to existing restaurants
- View all restaurants

### Customer Features:
- Search for restaurants within a radius
- Browse menus
- Add items to order
- View current order
- Checkout and place order

## Data Structures Used:
- **Arrays**: For sorted restaurant storage
- **ArrayList**: For dynamic menu items and orders
- **Insertion Sort**: For sorting restaurants by location
- **Binary Search**: For efficient range-based restaurant searching
