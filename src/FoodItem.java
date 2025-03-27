/**
 * FoodItem.java
 *
 * To show the description of the food item
 *
 * @author Mahmmod Dhalai
 * Date: March 21, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe a food item
 */

class FoodItem extends StoreItem {
    private int calories;

    public FoodItem(String name, String color, double price, String size, String material, int quantity, String brand, int calories) {
        super(name, color, price, size, material, quantity, brand);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

}
