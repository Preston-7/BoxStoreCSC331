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
    private String season;
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
    public Outerwear(String name, String color, double price, String size, String material, int quantity, String brand, String season, String insulation, String style, String weatherResistance) {
        super(name, color, price, size, material, quantity, brand);
        this.season = season;
        this.insulation = insulation;
        this.style = style;
        this.weatherResistance = weatherResistance;
    }

    /**
     *
     * @return season
     */
    public String getSeason() {
        return season;
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
     * @param season
     */
    public void setSeason(String season) {
        this.season = season;
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
        System.out.println("Outerwear Name: " + this.getName());
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Size: " + this.getSize());
        System.out.println("Color: " + this.getColor());
        System.out.println("Material: " + this.getMaterial());
        System.out.println("Style: " + this.getStyle());
        System.out.println("Insulation: " + this.getInsulation());
        System.out.println("Weather Resistance: " + this.getWeatherResistance());
        System.out.println("Price: " + this.getPrice());
    }


    /**
     * Overrides the toString method to include additional information about the outerwear.
     *
     * @return a string representation of the outerwear object.
     */

    @Override
    public String toString() {
        return "Outerwear{" +
                "season='" + season + '\'' +
                ", insulation='" + insulation + '\'' +
                ", style='" + style + '\'' +
                ", weatherResistance='" + weatherResistance + '\'' +
                '}';
    }

}
