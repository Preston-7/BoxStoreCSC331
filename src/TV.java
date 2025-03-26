/**
 * Class: CSC-331-002
 * @author Gabriel Strickland
 * Date: 3/27/2025
 * Purpose: Electronics Item Class
 */

public class TV {
    //Attributes
    private String TVBrand;
    private String TVDefinition;
    private double TVCost;
    private int TVLength;
    private int TVHeight;

    //Constructor

    /**
     * Constructor For the TV Class
     * @param TVBrand
     * @param TVDefinition
     * @param TVCost
     * @param TVLength
     * @param TVHeight
     */
    TV(String TVBrand, String TVDefinition, double TVCost, int TVLength, int TVHeight){
        this.TVBrand = TVBrand;
        this.TVDefinition = TVDefinition;
        this.TVCost = TVCost;
        this.TVLength = TVLength;
        this.TVHeight = TVHeight;
    }

    //Getters

    /**
     * Gets the TV Brand
     * @return String TVBrand
     */
    public String getTVBrand() {
        return TVBrand;
    }

    /**
     * Gets the TV Definition
     * @return String TVDefinition
     */
    public String getTVDefinition() {
        return TVDefinition;
    }

    /**
     * Gets the TV Cost
     * @return double TV Cost
     */
    public double getTVCost() {
        return TVCost;
    }

    /**
     * Gets the TVLength
     * @return int TVLength
     */
    public int getTVLength() {
        return TVLength;
    }

    /**
     * Gets the TV Height
     * @return int TVHeight
     */
    public int getTVHeight() {
        return TVHeight;
    }
    //Setters

    /**
     * Sets the TV Brand to a new Value
     * @param TVBrand
     */
    public void setTVBrand(String TVBrand) {
        this.TVBrand = TVBrand;
    }

    /**
     * Sets the TV Definition to a new Value
     * @param TVDefinition
     */
    public void setTVDefinition(String TVDefinition) {
        this.TVDefinition = TVDefinition;
    }

    /**
     * Sets the TV Cost to a new Value
     * @param TVCost
     */
    public void setTVCost(double TVCost) {
        this.TVCost = TVCost;
    }

    /**
     * Sets the TV Height to a new Value
     * @param TVHeight
     */
    public void setTVHeight(int TVHeight) {
        this.TVHeight = TVHeight;
    }

    /**
     * Sets the TV Length To a new Value
     * @param TVLength
     */
    public void setTVLength(int TVLength) {
        this.TVLength = TVLength;
    }
}
