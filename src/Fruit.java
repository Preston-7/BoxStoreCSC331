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

    /**
     * Fruit Class Constructor
     * @param name
     * @param color
     * @param price
     * @param size
     * @param material
     * @param quantity
     * @param brand
     * @param calories
     * @param taste
     * @param fruitSize
     */
    public Fruit(String name, String color, double price, String size, String material, int quantity, String brand, int calories, String taste, String fruitSize) {
        super(name, color, price, size, material, quantity, brand, calories);
        this.taste = taste;
        this.size = fruitSize;
    }

    /**
     * Taste Getter
     * @return String
     */
    public String getTaste() {
        return taste;
    }

    /**
     * Size Getter
     * @return String
     */
    public String getSize() {
        return size;
    }

    /**
     * Taste Setter
     * @param taste
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    /**
     * Size Setter
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Displays Fruit Class Information
     */
    public void displaysFruitInfo() {
        super.displayDetails();
        System.out.println("Taste: " + taste);
        System.out.println("Size: " + size);
    }
}