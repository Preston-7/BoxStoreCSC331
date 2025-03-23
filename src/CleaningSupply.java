import java.time.LocalDate;

public class CleaningSupply extends HouseholdItem {
    // Attributes
    private LocalDate expirationDate;
    private String packagingType;
    private String recommendedSurfaces;

    // Constructor
    public CleaningSupply(String name, String category, double price, String brand, int quantity, int weight,LocalDate expirationDate, String packagingType, String recommendedSurfaces) {
        super(name, category, price, brand, quantity, weight);
        this.expirationDate = expirationDate;
        this.packagingType = packagingType;
        this.recommendedSurfaces = recommendedSurfaces;
    }

    // Method to check availability
    public boolean checkAvailability() {
        return getQuantity() > 0;
    }

    // Method to apply a discount
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            setPrice(getPrice() - getPrice() * (percent / 100));
            System.out.println("Discount applied! New price: $" + getPrice());
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Method to update stock
    public void updateStock(int newQuantity) {
        if (newQuantity >= 0) {
            setQuantity(newQuantity);
            System.out.println("Stock updated to: " + getQuantity());
        } else {
            System.out.println("Stock quantity cannot be negative.");
        }
    }

    // Method to display cleaning supply information
    public void displayCleaningSupplyInfo() {
        displayDetails();
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Recommended Surfaces: " + recommendedSurfaces);
        System.out.println("Expired: " + (isExpired() ? "Yes" : "No"));
    }

    // Method to check if the cleaning supply is expired
    public boolean isExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    // Getters and Setters
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public String getRecommendedSurfaces() {
        return recommendedSurfaces;
    }

    public void setRecommendedSurfaces(String recommendedSurfaces) {
        this.recommendedSurfaces = recommendedSurfaces;
    }
}
