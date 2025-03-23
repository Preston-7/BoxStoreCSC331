/**
 * HouseholdItem.java
 *
 * To show the description of the household items
 *
 * @author Preston Beachum
 * Date: March 27, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe household items
 */

public class HouseholdItem {
    private String name;
    private String color;
    private double price;
    private String material;
    private int quantity;
    private int weight;

    /**
     * Constructs a new ClothingItem with the specified attributes.
     *
     * @param name     the name of the clothing item
     * @param color    the color of the clothing item
     * @param price    the price of the clothing item
     * @param material the material of the clothing item
     * @param quantity the quantity of the clothing item in stock
     * @param weight the weight of the household item
     */

    public HouseholdItem(String name, String color, double price, String material, int quantity, int weight) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.material = material;
        this.quantity = quantity;
        this.weight = weight;
    }

    // Getters
    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @return material
     */
    public String getMaterial() {
        return material;
    }

    /**
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @return weight
     */
    public int getWeight() {
        return weight;
    }


    // Setters
    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * @param material
     *
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    /**
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /**
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Displays detailed information about household items.
     * This includes the items name, price, quantity, weight, material, color.
     */
    // Method to display item details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
    }

    // Method to apply a discount
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            price -= price * (percent / 100);
            System.out.println("Discount applied! New price: $" + price);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Method to update quantity
    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            quantity = newQuantity;
            System.out.println("Quantity updated to: " + quantity);
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }
}
