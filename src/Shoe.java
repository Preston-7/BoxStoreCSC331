/**
 * Shoe.java
 *
 * To show the description of shoes
 *
 * @author Preston Beachum
 * Date: March 27, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe shoes
 */

class Shoe extends ClothingItem {
    private String shoeCondition;

    /**
     * Constructs a new ClothingItem with the specified attributes.
     *
     * @param name
     * @param color
     * @param price
     * @param size
     * @param material
     * @param quantity
     * @param shoeCondition
     * @param brand
     */
    public Shoe(String name, String color, double price, String type, String size, int quantity, String brand, String material, String season, String gender, String shoeCondition) {
        super(name, color, price, size, material, quantity, brand, type, season, gender);
        this.shoeCondition = shoeCondition;
    }



    /**
     * @return shoeCondition
     */
    public String getShoeCondition() {
        return shoeCondition;
    }



    /**
     * @param shoeCondition
     */
    public void setShoeCondition(String shoeCondition) {
        this.shoeCondition = shoeCondition;
    }


    /**
     * Checks the availability of a specific shoe size.
     *
     * @param requestedSize the size of the shoe being requested.
     * @return true if the requested size is available and the quantity is greater than zero; false otherwise.
     */
    public boolean checkShoeSizeAvailability(String requestedSize) {
        return this.getSize().equals(requestedSize) && this.getQuantity() > 0;
    }


    /**
     * Changes the condition of the shoe to the specified new condition.
     *
     * @param newCondition the new condition to set for the shoe, such as "New" or "Used".
     */
    public void changeShoeCondition(String newCondition) {
        this.setShoeCondition(newCondition);
    }


    /**
     * Displays detailed information about the shoe.
     * This includes the shoe's name, brand, size, color, material, type, condition, and price.
     */
    public void displayShoeInfo() {
        super.displayDetails();
        System.out.println("Shoe condition: " + shoeCondition);
    }


}
