/**
 * Class: CSC-331-002
 * @author Preston Beachum, Gabriel Strickland
 * Date: 3/27/2025
 * Purpose: Box Store Driver File to run the Classes
 */

import java.util.*;

public class BoxStoreBeachumStricklandDhalai {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<StoreItem> inventory = new ArrayList<>();
    private static final double FOOD_TAX = 0.02;
    private static final double GENERAL_TAX = 0.07;
    private static final List<StoreItem> foodInventory = new ArrayList<>();
    private static final List<StoreItem> electronicsInventory = new ArrayList<>();
    private static final List<StoreItem> clothingInventory = new ArrayList<>();
    private static final List<StoreItem> householdInventory = new ArrayList<>();

    /**
     * Main Method for running
     * @param args
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to Wilmington Quick Shop!");
            System.out.println("1. Add an item to inventory");
            System.out.println("2. Sell an item");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addItemToInventory();
                    break;
                case 2:
                    sellItem();
                    break;
                case 3:
                    System.out.println("Thank you for using Wilmington Quick Shop!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Adds Items to Box Store Inventory for later use
     * @return NULL
     */
    private static void addItemToInventory() {
        System.out.println("Select category: 1. Food 2. Electronics 3. Clothing 4. Household");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            return;
        }

        int category = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter size: ");
        String size = scanner.nextLine();

        System.out.print("Enter material: ");
        String material = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter price: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid price. Please enter a valid number.");
            scanner.next(); // Consume the invalid input
            System.out.print("Enter price: "); // Reprompt the user
        }
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline


        System.out.print("Enter quantity: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid quantity. Please enter a valid number.");
            scanner.next(); // Consume the invalid input
            System.out.print("Enter quantity: "); // Reprompt the user
        }

        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        StoreItem item = null;

        switch (category) {
            case 1: // Food
                System.out.print("Enter calories: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid calories. Please enter a valid number.");
                    scanner.next(); // Consume the invalid input
                    System.out.print("Enter calories: "); // Reprompt the user
                }
                int calories = scanner.nextInt();
                scanner.nextLine(); // Consume newline


                item = new FoodItem(name, color, price, size, material, quantity, brand, calories);
                foodInventory.add(item);
                break;

            case 2: // Electronics
                System.out.print("Enter Electronic Type (Laptop, Phone, TV): ");
                String etype = scanner.nextLine();

                System.out.print("Enter Operating System: ");
                String OS = scanner.nextLine();

                System.out.print("Enter model: ");
                String model = scanner.nextLine();

                System.out.print("Enter Plug Type (USBa, USB, USBc): ");
                String plugtype = scanner.nextLine();

                System.out.print("Enter warranty period (years): ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid warranty period. Please enter a number.");
                    scanner.next();
                    return;
                }
                int warranty = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                item = new ElectronicsItem(name, color, price, quantity, brand, OS, model, plugtype, etype, warranty);
                electronicsInventory.add(item);
                break;

            case 3: // Clothing
                System.out.print("Enter type: ");
                String type = scanner.nextLine();

                System.out.print("Enter season: ");
                String season = scanner.nextLine();

                System.out.print("Enter gender (Male, Female, Unisex): ");
                String gender = scanner.nextLine();

                item = new ClothingItem(name, color, price, type, size, quantity, brand, material, season, gender);
                clothingInventory.add(item);
                break;

            case 4: // Household
                System.out.print("Enter weight (lbs): ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid weight. Please enter a number.");
                    scanner.next();
                    return;
                }
                double weight = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter dimensions (length x width x height): ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid dimensions. Please enter a number.");
                    scanner.next();
                    return;
                }
                double dimensions = scanner.nextDouble();

                item = new HouseholdItem(name, color, price, size, material, quantity, brand, category, weight, dimensions);
                householdInventory.add(item);
                break;

            default:
                System.out.println("Invalid category.");
                return;
        }

        inventory.add(item);
        System.out.println("Item added successfully.");
    }

    /**
     * Method used to display the inventory By category
     * @param category
     */
    private static void displayInventoryByCategory(int category) {
        System.out.println("\nCurrent Inventory for Selected Category:");
        boolean found = false;
        switch (category) {
            case 1: // Food
                for (StoreItem item : foodInventory) {
                    System.out.println(item.toString());
                    found = true;
                }
                break;
            case 2: // Electronics
                for (StoreItem item : electronicsInventory) {
                    System.out.println(item.toString());
                    found = true;
                }
                break;
            case 3: // Clothing
                for (StoreItem item : clothingInventory) {
                    System.out.println(item.toString());
                    found = true;
                }
                break;
            case 4: // Household
                for (StoreItem item : householdInventory) {
                    System.out.println(item.toString());
                    found = true;
                }
                break;
            default:
                System.out.println("Invalid category.");
                return;
        }

        if (!found) {
            System.out.println("No items in this category yet.");
        }
    }

    /**
     * Method used for Creating a New Store Item
     * @param category
     */
    private static void createNewItem(int category) {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid price.");
            scanner.next();
            return;
        }
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter quantity: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid quantity.");
            scanner.next();
            return;
        }
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter size: ");
        String size = scanner.nextLine();

        System.out.print("Enter material: ");
        String material = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        StoreItem item = new StoreItem(name, color, price, size, material, quantity, brand);
        inventory.add(item);
        System.out.println("Item added successfully.");
    }

    /**
     * Method used for Updating Items that are inside the Inventory
     * @param category
     */
    private static void updateExistingItem(int category) {
        System.out.print("Enter the name of the item to update: ");
        String itemName = scanner.nextLine();

        List<StoreItem> selectedInventory = null;

        // Determine the selected inventory based on the category
        switch (category) {
            case 1: // Food
                selectedInventory = foodInventory;
                break;
            case 2: // Electronics
                selectedInventory = electronicsInventory;
                break;
            case 3: // Clothing
                selectedInventory = clothingInventory;
                break;
            case 4: // Household
                selectedInventory = householdInventory;
                break;
            default:
                System.out.println("Invalid category.");
                return;
        }

        for (StoreItem item : selectedInventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                System.out.print("Enter additional quantity: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid quantity. Please enter a valid number.");
                    scanner.next();
                    return;
                }
                int additionalQty = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                item.setQuantity(item.getQuantity() + additionalQty);
                System.out.println("Updated quantity: " + item.getQuantity());
                return;
            }
        }

        System.out.println("Item not found. Adding as a new item.");
        createNewItem(category);
    }

    /**
     * Method for Selling items in the Inventory, Displays the Order After Checkout
     */
    private static void sellItem() {
        double grandTotal = 0; // Variable to accumulate the total price for all items
        double grandTax = 0;   // Variable to accumulate the tax for all items
        double grandTotalWithTax = 0; // Variable to accumulate the total price with tax for all items

        List<String> soldItems = new ArrayList<>(); //List of Sold Items for Later Display

        while (true) {  // Keep asking for items until the user decides to stop
            System.out.println("\nSelect category to shop: 1. Food 2. Electronics 3. Clothing 4. Household");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input.");
                scanner.next();
                return;
            }
            int category = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            List<StoreItem> availableItems = new ArrayList<>();
            List<String> PrivacyPolicies = new ArrayList<>();

            //Privacy Policy Saver
            //Food
            if (category == 1){
                PrivacyPolicies.add("\nFood bought from this Store cannot be returned and are for Solo Use.");
            }
            //Electronics
            if (category == 2){
                PrivacyPolicies.add("\nElectronics are subject to a small time  protection Warranty.");
            }
            //Clothing
            if (category == 3){
                PrivacyPolicies.add("\nClothes are subject to fit and return policies.");
            }
            //Household
            if (category == 4){
                PrivacyPolicies.add("\nHousehold Items bought from this store are subject to a small return window of 30 days.");
            }

            // Check the corresponding list for items based on selected category
            switch (category) {
                case 1: // Food
                    availableItems.addAll(foodInventory);
                    break;

                case 2: // Electronics
                    availableItems.addAll(electronicsInventory);
                    break;

                case 3: // Clothing
                    availableItems.addAll(clothingInventory);
                    break;

                case 4: // Household
                    availableItems.addAll(householdInventory);
                    break;

                default:
                    System.out.println("Invalid category.");
                    return;
            }

            if (availableItems.isEmpty()) {
                System.out.println("No items available in this category.");
                continue;  // If no items available, reprompt the category selection
            }

            // Display available items in the selected category
            System.out.println("\nAvailable Items:");
            for (int i = 0; i < availableItems.size(); i++) {
                StoreItem item = availableItems.get(i);
                System.out.printf("%d. %s - $%.2f (Qty: %d)\n", (i + 1), item.getName(), item.getPrice(), item.getQuantity());
            }

            // Ask for item selection
            System.out.print("Enter the number of the item you want to buy: ");
            int itemIndex = scanner.nextInt() - 1; // Subtract 1 to get correct index
            scanner.nextLine(); // Consume newline

            if (itemIndex < 0 || itemIndex >= availableItems.size()) {
                System.out.println("Invalid item selection.");
                continue; // Reprompt if invalid selection
            }

            StoreItem selectedItem = availableItems.get(itemIndex);

            // Ask for quantity
            System.out.print("Enter quantity: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid quantity. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
                System.out.print("Enter quantity: "); // Reprompt the user
            }
            int quantityToPurchase = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Check if enough stock is available
            if (quantityToPurchase > selectedItem.getQuantity()) {
                System.out.println("Sorry, insufficient stock available.");
                continue;  // Reprompt if not enough stock
            }

            // Calculate price and tax
            double price = selectedItem.getPrice();
            double total = price * quantityToPurchase;
            double taxRate = (category == 1) ? FOOD_TAX : GENERAL_TAX;
            double taxAmount = total * taxRate;
            double totalWithTax = total + taxAmount;

            // Accumulate the totals
            grandTotal += total;
            grandTax += taxAmount;
            grandTotalWithTax += totalWithTax;

            //Add Item to Sold Items List
            String soldItemDetails = String.format("\n%s: $%.2f x %d - $%.2f || Tax: $%.2f, Total With Tax: $%.2f ||", selectedItem.getName(), price, quantityToPurchase, total, taxAmount, totalWithTax);
            soldItems.add(soldItemDetails);

            // Ask if user wants to buy another item
            System.out.print("Would you like to buy another item? (Y/N): ");
            String anotherItem = scanner.nextLine().toUpperCase();

            if (!anotherItem.equals("Y")) {
                System.out.println("Proceeding to checkout.");
                System.out.printf("Total (before tax): $%.2f\n", grandTotal);
                System.out.printf("Tax: $%.2f\n", grandTax);
                System.out.printf("Total (with tax): $%.2f\n", grandTotalWithTax);

                //Prints Sold Items
                System.out.println("\nSold Items: ");
                for(String soldItem : soldItems){
                    System.out.println(soldItem);
                }

                System.out.println("\nPrivacy Policies for Bought Items: ");
                for(String policy : PrivacyPolicies){
                    System.out.println(policy);
                }


                break;  // Exit the loop to checkout
            }
            // If the user wants to buy another item, the loop continues and the category selection is prompted again
        }

        //Displays each category one by one after Items are sold
        System.out.println("\nItems Left in Inventory by Category: ");
        System.out.println("\nFood Items ");
        displayInventoryByCategory(1);
        System.out.println("\nElectronic Items ");
        displayInventoryByCategory(2);
        System.out.println("\nClothing Items ");
        displayInventoryByCategory(3);
        System.out.println("\nHousehold Items ");
        displayInventoryByCategory(4);

    }
}

