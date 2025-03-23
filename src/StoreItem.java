/**
 * StoreItem.java
 *
 * To show the description of the store items
 *
 * @author Preston Beachum
 * Date: March 27, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe store items
 */

public class StoreItem {
    private String name;
    private String color;
    private double price;
    private String size;
    private String material;
    private int quantity;
    private String brand;

    /**
     * Constructs a new StoreItem with the specified attributes.
     *
     * @param name
     * @param color
     * @param price
     * @param size
     * @param material
     * @param quantity
     * @param brand
     */
    public StoreItem(String name, String color, double price, String size, String material, int quantity, String brand) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.size = size;
        this.material = material;
        this.quantity = quantity;
        this.brand = brand;
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
     * @return size
     */
    public String getSize() {
        return size;
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
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    // Setters

    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Displays detailed information about household items.
     * This includes the items name, price, quantity, weight, material, color.
     */
    // Method to display item details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Size (inches): " + size);
        System.out.println("Material: " + material);
        System.out.println("Quantity: " + quantity);
        System.out.println("Brand: " + brand);
    }

    // Method to apply a discount
    /**
     * Applies a discount to the item's price based on the given percentage.
     * 
     * @param percent the discount percentage to apply. 
     *                Must be greater than 0 and less than or equal to 100.
     */
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            price -= price * (percent / 100);
            System.out.println("Discount applied! New price: $" + price);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Method to update quantity
    /**
     * Updates the quantity of the store item.
     * 
     * @param newQuantity the new quantity to set for the item. 
     *                    Must be a non-negative integer.
     */
    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            quantity = newQuantity;
            System.out.println("Quantity updated to: " + quantity);
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }
}
