/**
 * Vegetables.java
 *
 * To show the description of the vegetables
 *
 * @author Mahmmod Dhalai
 * Date: March 21, 2025
 * Section: CSC-331-002
 *
 * Purpose: Describe a vegetables
 */

class Vegetables extends FoodItem {
    private String texture;
    private String color;

    /**
     * Vegetables Class Constructor
     * @param name
     * @param color
     * @param price
     * @param size
     * @param material
     * @param quantity
     * @param brand
     * @param calories
     * @param texture
     */
    public Vegetables(String name, String color, double price, String size, String material, int quantity, String brand, int calories, String texture) {
        super(name, color, price, size, material, quantity, brand, calories);
        this.texture = texture;
    }


    /**
     * Texture Getter
     * @return String
     */
    public String getTexture() {
        return texture;
    }

    /**
     * Color getter
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Texture Setter
     * @param texture
     */
    public void setTexture(String texture) {
        this.texture = texture;
    }

    /**
     * Color Setter
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Displays Vegetable Class Information
     */
    public void displaysVegetableInfo() {
        super.displayDetails();
        System.out.println("Texture: " + texture);
        System.out.println("Color: " + color);
    }
}