/**
 * Shirt.java
 *
 * To show the description of shirts
 *
 * @author Preston Beachum
 * Date: March 27, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe shirts
 */

class Shirt extends ClothingItem {
    private String shirtPattern;
    private String shirtFit;
    /**
     * Constructs a new ClothingItem with the specified attributes.
     *
     * @param name
     * @param color
     * @param price
     * @param size
     * @param material
     * @param quantity
     * @param brand
     * @param shirtPattern
     * @param shirtFit
     */
    public Shirt(String name, String color, double price, String type, String size, int quantity, String brand, String material, String season, String gender, String shirtPattern, String shirtFit) {
        super(name, color, price, size, material, quantity, brand, type, season, gender);
        this.shirtPattern = shirtPattern;
        this.shirtFit = shirtFit;
    }


    /**
     *
     * @return shirtPattern
     *
     */
    public String getPattern() {
        return shirtPattern;
    }
    /**
     *
     * @return shirtFit
     */
    public String getFit() {
        return shirtFit;
    }

    /**
     *
     * @param shirtPattern
     */
    public void setPattern(String shirtPattern) {
        this.shirtPattern = shirtPattern;
    }
    /**
     *
     * @param shirtFit
     */
    public void setFit(String shirtFit) {
        this.shirtFit = shirtFit;
    }
    /**
     * Checks the availability of a specific shirt size.
     *
     * @param requestedSize the size of the shirt being requested.
     * @return true if the requested size is available and the quantity is greater than zero; false otherwise.
     */
    public boolean checkShirtSizeAvailability(String requestedSize) {
        return this.getSize().equals(requestedSize) && this.getQuantity() > 0;
    }

    /**
     * Changes the material of the shirt.
     *
     * @param newMaterial the new material for the shirt.
     */
    public void changeShirtMaterial(String newMaterial) {
        this.setMaterial(newMaterial);
    }


    /**
     * Displays detailed information about the shirt.
     * This includes the shirt's name, brand, size, color, material, type, pattern, fit, and price.
     */
    public void displayShirtInfo() {
        super.displayDetails();
        System.out.println("Shirt fit: " + shirtFit);
        System.out.println("Shirt pattern: " + shirtPattern);
    }


}
