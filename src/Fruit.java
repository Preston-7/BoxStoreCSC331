/**
 * Fruit.java
 *
 * To show the description of the fruit
 *
 * @author Mahmmod Dhalai
 * Date: March 21, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe a fruit
 */

class Fruit extends FoodItem {
    private String taste;
    private String size;

    public Fruit(String name, String color, double price, String size, String material, int quantity, String brand, int calories, String taste, String fruitSize) {
        super(name, color, price, size, material, quantity, brand, calories);
        this.taste = taste;
        this.size = fruitSize;
    }


    public String getTaste() {
        return taste;
    }

    public String getSize() {
        return size;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setSize(String size) {
        this.size = size;
    }
}