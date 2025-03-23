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

    @Override
    public String toString() {
        return "HouseholdItem{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price + '\'' +
                ", quantity=" + quantity + +'\'' +
                ", weight=" + weight +
                '}';
    }
}
