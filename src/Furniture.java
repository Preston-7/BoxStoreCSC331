/**
 * Class: CSC-331-002
 * @author Gabriel Strickland
 * Date: 3/27/2025
 * Purpose: Funiture subclass for the HouseholdItem Class
 */
public class Furniture extends HouseholdItem {
    private int LegNumber;
    private int NumParts;

    //Constructor
    /**
     * Constructor For the Futniture Class
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
     * @param LegNumber
     */
    public Furniture(String name, String color, double price, String size, String material, int quantity, String brand, String category, double weight, String dimensions, int LegNumber, int NumParts){
        super(name, color, price, size, material, quantity, brand, category, weight, dimensions);
        this.LegNumber = LegNumber;
        this.NumParts = NumParts;

    }

    //Getters

    /**
     * Leg Number Getter
     * @return
     */
    public int getLegNumber() {
        return LegNumber;
    }

    /**
     * Number of Parts Getter
     * @return
     */
    public int getNumParts() {
        return NumParts;
    }

    //Setters

    /**
     * Leg Number Setter
     * @param legNumber
     */
    public void setLegNumber(int legNumber) {
        LegNumber = legNumber;
    }

    /**
     * Number of Parts Setter
     * @param numParts
     */
    public void setNumParts(int numParts) {
        NumParts = numParts;
    }

    //Behaviors
    public void displayFurnitureInfo() {
        super.displayDetails();
        System.out.println("Number of Legs: " + LegNumber);
        System.out.println("Number of Parts: " + NumParts);
    }

}
