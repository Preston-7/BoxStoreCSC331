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

    @Override
    public String toString() {
        return "ClothingItem{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
