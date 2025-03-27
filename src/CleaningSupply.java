/**
 * CleaningSupply.java
 *
 * To show the description of the cleaning supply items
 *
 * @author Preston Beachum
 * Date: March 27, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe cleaning supply items
 */


import java.time.LocalDate;


public class CleaningSupply extends HouseholdItem {
    // Attributes
    private LocalDate expirationDate;
    private String packagingType;
    private String recommendedSurfaces;

    /**
     * Constructs a new cleaning supply item with specified attributes.
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
     * @param expirationDate
     * @param packagingType
     * @param recommendedSurfaces
     */
    public CleaningSupply(String name, String color, double price, String size, String material, int quantity, String brand, int category, double weight, double dimensions, LocalDate expirationDate, String packagingType, String recommendedSurfaces) {
        super(name, color, price, size, material, quantity, brand, category, weight, dimensions);
        this.expirationDate = expirationDate;
        this.packagingType = packagingType;
        this.recommendedSurfaces = recommendedSurfaces;
    }


    /**
     *
     * @return expirationDate
     */
    // Getters and Setters
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     *
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     *
     * @return packagingType
     */
    public String getPackagingType() {
        return packagingType;
    }

    /**
     *
     * @param packagingType
     */
    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    /**
     *
     * @return recommendedSurfaces
     */
    public String getRecommendedSurfaces() {
        return recommendedSurfaces;
    }

    /**
     *
     * @param recommendedSurfaces
     */
    public void setRecommendedSurfaces(String recommendedSurfaces) {
        this.recommendedSurfaces = recommendedSurfaces;
    }

    /**
     *
     * @return true if the item is available
     */
    // Method to check availability
    public boolean checkAvailability() {
        return getQuantity() > 0;
    }


    /**
     * Displays detailed information about the cleaning supply item.
     */
    // Method to display cleaning supply information
    public void displayCleaningSupplyInfo() {
        super.displayDetails();
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Recommended Surfaces: " + recommendedSurfaces);
        System.out.println("Expired: " + (isExpired() ? "Yes" : "No"));
    }

    /**
     * Method which determines if the cleaning supply is expired
     * @return true if the cleaning supply is expired
     */
    public boolean isExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }


}
