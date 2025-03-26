/**
 * Class: CSC-331-002
 * @author Gabriel Strickland
 * Date: 3/27/2025
 * Purpose: Electronics Item Class
 */

public class Laptop {
    //Attributes
    private String LaptopBrand;
    private double LaptopCost;
    private String LaptopModel;
    private int LaptopPixelCount;

    //Constructor

    /**
     * Constuctor For the Laptop Class
     * @param LaptopBrand
     * @param LaptopCost
     * @param LaptopModel
     * @param LaptopPixelCount
     */
    Laptop(String LaptopBrand, double LaptopCost, String LaptopModel, int LaptopPixelCount){
        this.LaptopBrand = LaptopBrand;
        this.LaptopCost = LaptopCost;
        this.LaptopModel = LaptopModel;
        this.LaptopPixelCount = LaptopPixelCount;
    }

    //Getters

    /**
     * Gets Laptop Brand
     * @return String LaptopBrand
     */
    public String getLaptopBrand() {
        return LaptopBrand;
    }

    /**
     * Gets Laptop Cost
     * @return double LaptopCost
     */
    public double getLaptopCost() {
        return LaptopCost;
    }

    /**
     * Gets Laptop Model
     * @return String LaptopModel
     */
    public String getLaptopModel() {
        return LaptopModel;
    }

    /**
     * Gets Laptop Pixel Count
     * @return int LaptopPixelCount
     */
    public int getLaptopPixelCount() {
        return LaptopPixelCount;
    }

    //Setters

    /**
     * Sets Laptop Brand to new value
     * @param laptopBrand
     */
    public void setLaptopBrand(String laptopBrand) {
        LaptopBrand = laptopBrand;
    }

    /**
     * Sets Laptop Cost to new Value
     * @param laptopCost
     */
    public void setLaptopCost(double laptopCost) {
        LaptopCost = laptopCost;
    }

    /**
     * Sets Laptop Model to new Value
     * @param laptopModel
     */
    public void setLaptopModel(String laptopModel) {
        LaptopModel = laptopModel;
    }

    /**
     * Sets Laptop Pixel Count to New Value
     * @param laptopPixelCount
     */
    public void setLaptopPixelCount(int laptopPixelCount) {
        LaptopPixelCount = laptopPixelCount;
    }
}
