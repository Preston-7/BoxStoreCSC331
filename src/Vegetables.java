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


    public Vegetables(String name, int calories, double price, String texture, String color) {
        super(name, calories, price);
        this.texture = texture;
        this.color = color;
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