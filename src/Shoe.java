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
    private String shoeType;
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
     * @param shoeType
     * @param brand
     */
    public Shoe(String name, String color, double price, String size, String material, int quantity, String shoeType, String shoeCondition, String brand) {
        super(name, color, price, size, material, quantity, brand);
        this.shoeType = shoeType;
        this.shoeCondition = shoeCondition;
    }

    /**
     * @return shoeType
     */
    public String getShoeType() {
        return shoeType;
    }

    /**
     * @return shoeCondition
     */
    public String getShoeCondition() {
        return shoeCondition;
    }

    /**
     *
     * @param shoeType
     */
    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
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
        System.out.println("Shoe Name: " + this.getName());
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Size: " + this.getSize());
        System.out.println("Color: " + this.getColor());
        System.out.println("Material: " + this.getMaterial());
        System.out.println("Type: " + this.getShoeType());
        System.out.println("Condition: " + this.getShoeCondition());
        System.out.println("Price: " + this.getPrice());
    }

    /**
     * Overrides the toString method to include additional information about the shoe.
     *
     * @return a string representation of the Shoe object.
     */
    @Override
    public String toString() {
        return super.toString() + ", ShoeType='" + shoeType + '\'' + ", ShoeCondition='" + shoeCondition + '\'';
    }
}
