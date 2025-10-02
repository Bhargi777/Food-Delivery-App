# Food Delivery Application - Team Project

## Team Members and Responsibilities

**Team Member 1: Foundational Data Models & Data Provider**
- MenuItem.java
- OrderItem.java  
- Restaurant.java
- DataProvider.java

**Team Member 2: Core Algorithms (Sorting & Searching)**
- SortedRestaurantList.java
- RestaurantSorter.java
- RestaurantFinder.java

**Team Member 3: Main Application Flow & Admin Panel**
- ApplicationController.java
- FoodDeliveryApp.java (Main class)

**Team Member 4: Customer-Facing Experience**
- CustomerController.java

## How to Run

1. Compile all Java files:
   ```bash
   javac -d bin src/Sample/*.java
   ```

2. Run the application:
   ```bash
   java -cp bin Sample.FoodDeliveryApp
   ```

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
├── bin/ (created after compilation)
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
