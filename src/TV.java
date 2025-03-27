/**
 * Class: CSC-331-002
 * @author Gabriel Strickland
 * Date: 3/27/2025
 * Purpose: TV subclass of the ElectronicsItem class
 */

public class TV extends ElectronicsItem {
    //Attributes
    private String TVDefinition;
    private int TVLength;
    private int TVHeight;

    //Constructor

    public TV(String name, String color, double price, String OS, String model, String plugType, String brand, int quantity, String type, int TVLength, int TVHeight, String TVDefinition){
        super(name, color, price, OS, model, plugType,  brand, quantity, type);
        this.TVDefinition = TVDefinition;
        this.TVHeight = TVHeight;
        this.TVLength = TVLength;

    }

    //Getters
    /**
     * Gets the TV Definition
     * @return String TVDefinition
     */
    public String getTVDefinition() {
        return TVDefinition;
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
     * Sets the TV Definition to a new Value
     * @param TVDefinition
     */
    public void setTVDefinition(String TVDefinition) {
        this.TVDefinition = TVDefinition;
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

    //Behaviors

    /**
     * Displays TV Information
     * Prints Name, color, price, OS, model, plugType, brand, quantity, type, TVLength, TvHeight, TVDefinition
     */
    public void displayTVInfo(){
        super.displayDetails();
        System.out.println("TV Length: " + TVLength);
        System.out.println("TV Height: " + TVHeight);
        System.out.println("TV Definition: " + TVDefinition);

    }
}
