/**
 * HouseholdItem.java
 *
 * To show the description of the household items
 *
 * @author Preston Beachum
 * Date: March 27, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe household items
 */
public class HouseholdItem extends StoreItem {
    private String category;
    private double weight;
    private String dimensions;

    /**
     * Constructs a new HouseholdItem with specified attributes.
     *
     * @param name
     * @param color
     * @param price
     * @param size
     * @param material
     * @param quantity
     * @param brand
     * @param category
     * @param weight
     * @param dimensions
     */
    public HouseholdItem(String name, String color, double price, String size, String material, int quantity, String brand, String category, double weight, String dimensions) {
        super(name, color, price, size, material, quantity, brand);
        this.category = category;
        this.weight = weight;
        this.dimensions = dimensions;
    }

    /**
     *
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @return dimensions
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
     *
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     *
     * @param dimensions
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Displays detailed information about the household item.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: " + category);
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Dimensions: " + dimensions);
    }
}