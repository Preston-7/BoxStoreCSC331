/**
 * ClothingItem.java
 *
 * To show the description of the clothing items
 *
 * @author Preston Beachum
 * Date: March 27, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe clothing items
 */

public class ClothingItem {
    private String name;
    private String color;
    private double price;
    private String size;
    private String material;
    private int quantity;
    private String brand;

    /**
     * Constructs a new ClothingItem with the specified attributes.
     *
     * @param name the name of the clothing item
     * @param color the color of the clothing item
     * @param price the price of the clothing item
     * @param size the size of the clothing item
     * @param material the material of the clothing item
     * @param quantity the quantity of the clothing item in stock
     */

    public ClothingItem(String name, String color, double price, String size, String material, int quantity, String brand) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.size = size;
        this.material = material;
        this.quantity = quantity;
        this.brand = brand;
    }

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
     *
     */
    public String getBrand() {
        return brand;
    }

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
     * Displays detailed information about clothing items.
     * This includes the items name, price, quantity, material, color, size, brand.
     */
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Brand: " + brand);
    }
    /**
     * Applies a discount to the clothing items price based on the given discount percentage.
     *
     * @param percent the percentage of the discount to apply to the shoe's price.
     *                           This should be a positive value representing the discount rate.
     */
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            price -= price * (percent / 100);
            System.out.println("Discount applied! New price: $" + price);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    /**
     * A method that is able to update quantity of clothing items
     * and checks to make sure there is the correct quantity to update
     *
     * @param newQuantity
     *
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
