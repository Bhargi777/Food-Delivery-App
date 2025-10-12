# Food Delivery Application 

A console-based food delivery application built in Java with advanced data structures for efficient restaurant search and order management.

##  Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Classes Overview](#classes-overview)
- [Contributing](#contributing)
- [License](#license)

##  Features

### Customer Features
- **Location-based Restaurant Search**: Find restaurants within a specified radius using segment tree algorithm
- **Menu Browsing**: View detailed menus with prices for each restaurant
- **Order Management**: Add items to cart, view current order, and checkout
- **Multiple Cuisine Types**: Italian, Mexican, American, Japanese, Indian, Vietnamese, and more

### Admin Features
- **Restaurant Management**: Add new restaurants with details (name, location, rating, cuisine)
- **Menu Management**: Add new dishes to existing restaurants
- **Restaurant Overview**: View all registered restaurants

### Technical Features
- **Efficient Search Algorithm**: Segment tree implementation for O(log n) restaurant location queries
- **Modular Architecture**: Clean separation of concerns with proper package structure
- **Input Validation**: Robust error handling for user inputs
- **Memory Efficient**: Optimized data structures for performance

##  Project Structure

```
foodApplication/
├── src/
│   └── foodApplication/
│       ├── model/                    # Data models
│       │   ├── MenuItem.java         # Food item representation
│       │   ├── OrderItem.java        # Order line item
│       │   └── Restaurant.java       # Restaurant data model
│       ├── data/                     # Data layer
│       │   └── DataProvider.java     # Sample data and utilities
│       ├── util/                     # Utility classes
│       │   └── RestaurantSegmentTree.java  # Efficient search algorithm
│       ├── controller/               # Business logic
│       │   ├── ApplicationController.java  # Main app flow & admin
│       │   └── CustomerController.java     # Customer operations
│       └── FoodDeliveryApp.java      # Application entry point
├── README.md
└── .gitignore
```

##  Technologies Used

- **Java 8+**: Core programming language
- **Data Structures**: Segment Tree for efficient range queries
- **Design Patterns**: MVC (Model-View-Controller) architecture
- **Java Collections**: ArrayList, List interfaces for data management

##  Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line terminal or Java IDE (Eclipse, IntelliJ IDEA, VS Code)
- Git (for version control)

##  Installation

### Option 1: Command Line

```bash
# Clone the repository
git clone https://github.com/yourusername/food-delivery-app.git

# Navigate to project directory
cd food-delivery-app

# Create the package structure
mkdir -p src/foodApplication/{model,data,util,controller}

# Compile the application
javac -d . src/foodApplication/*.java src/foodApplication/*/*.java

# Run the application
java foodApplication.FoodDeliveryApp
```

### Option 2: IDE Setup

1. Clone or download the project
2. Import as a Java project in your IDE
3. Ensure the package structure matches the directory layout
4. Build and run `FoodDeliveryApp.java`

##  Usage

### Starting the Application

```bash
java foodApplication.FoodDeliveryApp
```

### Customer Workflow

1. **Select Role**: Choose "I'm a Customer" from the main menu
2. **Set Location**: Enter your current location (in km)
3. **Search Restaurants**: Specify search radius to find nearby restaurants
4. **Browse & Order**: Select restaurants, view menus, and add items to your order
5. **Checkout**: Review your order and complete the purchase

### Admin Workflow

1. **Select Role**: Choose "I'm an Admin" from the main menu
2. **Manage Restaurants**: Add new restaurants with location, rating, and cuisine details
3. **Manage Menus**: Add new dishes to existing restaurant menus
4. **View Overview**: Check all registered restaurants

### Sample Interaction

```
-- Welcome to the Food Delivery App --
1. I'm a Customer
2. I'm an Admin
3. Exit Application
Please select your role: 1

Welcome, Customer! Let's find you something to eat.
To get started, please enter your current location (e.g., 10): 10

--- Customer Menu ---
1. Search for Food to Add to Order
2. View Current Order
3. Finish Order & Checkout
4. Back to Main Menu
Please choose an option: 1

Searching from your fixed location: 10km
How far are you willing to search? (Enter a radius, e.g., 5): 5

Success! We found 3 restaurant(s) for you:
1. Pizza Palace
2. Burger Barn
3. The Salad Bar
```

##  Classes Overview

### Model Layer
- **MenuItem**: Represents individual food items with name and price
- **OrderItem**: Links menu items with their source restaurants
- **Restaurant**: Contains restaurant information and menu items

### Data Layer
- **DataProvider**: Provides sample restaurant data and display utilities

### Utility Layer
- **RestaurantSegmentTree**: Implements segment tree for efficient location-based searches

### Controller Layer
- **ApplicationController**: Manages main application flow and admin operations
- **CustomerController**: Handles all customer-facing functionality

##  Key Algorithms

### Segment Tree Implementation
The application uses a segment tree data structure to efficiently query restaurants within a location range:

- **Time Complexity**: O(log n) for range queries
- **Space Complexity**: O(n) for tree storage
- **Use Case**: Finding restaurants within a specified distance radius

### Features of the Search Algorithm
- Sorts restaurants by location for optimal tree construction
- Supports range queries for location-based filtering
- Efficiently handles overlapping search ranges

##  Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

##  License

This project is licensed under the MIT License - see the LICENSE file for details.

##  Team Members & Contributions

This project was developed with a team-based approach:

- **Team Member 1**: Foundational Data Models & Data Provider
- **Team Member 2**: Segment Tree & Search Algorithm Implementation  
- **Team Member 3**: Main Application Flow & Admin Panel
- **Team Member 4**: Customer-Facing Experience & UI
