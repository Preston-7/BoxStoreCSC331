/**
 * Outerwear.java
 *
 * To show the description of outerwear
 *
 * @author Preston Beachum
 * Date: March 27, 2025
 * Section: CSC-331-002
 *
 * Purpose: To describe outerwear
 */
class Outerwear extends ClothingItem{
    private String insulation;
    private String style;
    private String weatherResistance;

    /**
     * Constructs a new Outerwear with the specified attributes.
     *
     * @param name
     * @param color
     * @param price
     * @param size
     * @param material
     * @param quantity
     * @param brand
     * @param season
     * @param insulation
     * @param material
     * @param style
     */
    public Outerwear(String name, String color, double price, String type, String size, int quantity, String brand, String material, String season, String gender, String insulation, String style, String weatherResistance) {
        super(name, color, price, size, material, quantity, brand, type, season, gender);
        this.insulation = insulation;
        this.style = style;
        this.weatherResistance = weatherResistance;
    }

    /**
     *
     * @return insulation
     */
    public String getInsulation() {
        return insulation;
    }

    /**
     *
     * @return style
     */
    public String getStyle() {
        return style;
    }
    /**
     *
     * @return weatherResistance
     */
    public String getWeatherResistance() {
        return weatherResistance;
    }
    /**
     *
     * @param insulation
     */
    public void setInsulation(String insulation) {
        this.insulation = insulation;
    }

    /**
     *
     * @param style
     */
    public void setStyle(String style) {
        this.style = style;
    }
    /**
     *
     * @param weatherResistance
     */
    public void setWeatherResistance(String weatherResistance) {
        this.weatherResistance = weatherResistance;
    }

    /**
     * Checks if the outerwear is suitable for specific weather conditions
     * @param condition
     * @return weatherCondition
     */
    public boolean checkWeatherResistance(String condition) {
        return this.weatherResistance.equalsIgnoreCase(condition);
    }

    /**
     * Displays information about the outerwear
     * This includes, name, brand, size, color, material, style, insulation, weather resistance, price
     */
    public void displayOuterwearInfo() {
        super.displayDetails();
        System.out.println("Insulation: " + insulation);
        System.out.println("Style: " + style);
        System.out.println("Weather Resistance: " + weatherResistance);
    }
}
