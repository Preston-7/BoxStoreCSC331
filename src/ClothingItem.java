/**
 * ClothingItem.java
 *
 * To show the description of the clothing items
 *
 * @author Preston Beachum
 * Date: March 21, 2025
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

    public ClothingItem(String name, String color, double price, String size, String material, int quantity) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.size = size;
        this.material = material;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
