/**
 * Class: CSC-331-002
 * @author Gabriel Strickland
 * Date: 3/27/2025
 * Purpose: Laptop subclass of the ElectronicsItem Class
 */

public class Laptop extends ElectronicsItem {
    //Attributes
    private int LaptopPixelCount;

    //Constructor
    public Laptop(String name, String color, double price, String OS, String model, String plugType, String brand, int quantity, String type, int LaptopPixelCount){
        super(name, color, price, OS, model, plugType,  brand, quantity, type);
        this.LaptopPixelCount = LaptopPixelCount;

    }

    //Getters
    /**
     * Laptop Pixel Count Getter
     * @return
     */
    public int getLaptopPixelCount() {
        return LaptopPixelCount;
    }

    //Setters

    /**
     * Laptop Pixel Count Setter
     * @param laptopPixelCount
     */
    public void setLaptopPixelCount(int laptopPixelCount) {
        LaptopPixelCount = laptopPixelCount;
    }

    //Behaviors

    /**
     * Displays Laptop Information
     * Prints Name, color, price, OS, model, plugType, brand, quantity, type, LaptopPixelCount
     */
    public void displayLaptopInfo(){
        super.displayDetails();
        System.out.println("Phone Length: " + LaptopPixelCount);

    }
}
