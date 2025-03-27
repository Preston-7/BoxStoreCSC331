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


    public Vegetables(String name, String color, double price, String size, String material, int quantity, String brand, int calories, String texture) {
        super(name, color, price, size, material, quantity, brand, calories);
        this.texture = texture;
    }



    public String getTexture() {
        return texture;
    }

    public String getColor() {
        return color;
    }

    public void setType(String texture) {
        this.texture = texture;
    }


    public void setColor(String color) {
        this.color = color;
    }
}