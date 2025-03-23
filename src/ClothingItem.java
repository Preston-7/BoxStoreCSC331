/**
 * ClothingItem.java
 *
 * To show the description of the clothing items
 *
 * @author Preston Beachum
 * Date: March 27, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe clothing items
 */
public class ClothingItem extends StoreItem {
    private String type;
    private String season;
    private String gender;
    

    /**
     * Constructs a new ClothingItem with the specified attributes.
     *
     * @param name     the name of the clothing item
     * @param color    the color of the clothing item
     * @param price    the price of the clothing item
     * @param type     the type of the clothing item
     * @param quantity the quantity of the clothing item in stock
     * @param brand    the brand of the clothing item
     * @param season   the season of the clothing item
     * @param gender   the gender of the clothing
     */
    public ClothingItem(String name, String color, double price, String type, String size, int quantity, String brand, String material, String season, String gender) {
        super(name, color, price, size, material, quantity, brand);
        this.type = type;
        this.season = season;
        this.gender = gender;
    }

    /**
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return the season
     */
    public String getSeason() {
        return season;
    }

    /**
     *
     * @param season the new season
     */
    public void setSeason(String season) {
        this.season = season;
    }

    /**
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender the new gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Displays detailed information about the clothing item.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: " + type);
        System.out.println("Season: " + season);
        System.out.println("Gender: " + gender);
    }
}
