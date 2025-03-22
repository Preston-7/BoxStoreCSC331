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
    private String shirtType;
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
     * @param shirtType
     * @param shirtPattern
     * @param shirtFit
     */
    public Shirt(String name, String color, double price, String size, String material, int quantity, String brand, String shirtType, String shirtPattern, String shirtFit) {
        super(name, color, price, size, material, quantity, brand);
        this.shirtType = shirtType;
        this.shirtPattern = shirtPattern;
        this.shirtFit = shirtFit;
    }

    /**
     *
     * @return shirtType
     */
    public String getType() {
        return shirtType;
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
     * @param shirtType
     */
    public void setType(String shirtType) {
        this.shirtType = shirtType;
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
     * Applies a discount to the shirt's price based on the given discount percentage.
     *
     * @param discountPercentage the percentage of the discount to apply to the shirt's price.
     *                           This should be a positive value representing the discount rate.
     */
    public void applyShirtDiscount(double discountPercentage) {
        double discountedPrice = this.getPrice() * (1 - discountPercentage / 100);
        this.setPrice(discountedPrice);
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
     * Updates the stock of the shirt by the specified quantity sold.
     *
     * @param quantitySold the quantity of the shirt sold.
     */
    public void updateShirtStock(int quantitySold) {
        if (this.getQuantity() >= quantitySold) {
            this.setQuantity(this.getQuantity() - quantitySold);
        } else {
            System.out.println("Not enough stock available.");
        }
    }
    /**
     * Displays detailed information about the shirt.
     * This includes the shirt's name, brand, size, color, material, type, pattern, fit, and price.
     */
    public void displayShirtInfo() {
        System.out.println("Shirt Name: " + this.getName());
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Size: " + this.getSize());
        System.out.println("Color: " + this.getColor());
        System.out.println("Material: " + this.getMaterial());
        System.out.println("Type: " + this.getType());
        System.out.println("Pattern: " + this.getPattern());
        System.out.println("Fit: " + this.getFit());
        System.out.println("Price: $" + this.getPrice());
    }

    /**
     * Overrides the toString method to include additional information about the shoe.
     *
     * @return a string representation of the Shoe object.
     */
    @Override
    public String toString() {
        return super.toString() + ", ShirtPattern='" + shirtPattern + '\'' + ", ShirtFit='" + shirtFit + '\'' + ", ShirtType" + shirtType + '\'';
    }

}
