/**
 * ShelfStable.java
 *
 * To show the description of the shelf stables
 *
 * @author Mahmmod Dhalai
 * Date: March 21, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe shelf stables
 */

class ShelfStable extends FoodItem {
    private String storageCondition;
    private String expirationDate;

    public ShelfStable(String name, String color, double price, String size, String material, int quantity, String brand, int calories, String storageCondition, String expirationDate) {
        super(name, color, price, size, material, quantity, brand, calories);
        this.storageCondition = storageCondition;
        this.expirationDate = expirationDate;
    }


    public String getStorageCondition() {
        return storageCondition;
    }


    public String getExpirationDate() {
        return expirationDate;
    }


    public void setStorageCondition(String storageCondition) {
        this.storageCondition = storageCondition;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

}