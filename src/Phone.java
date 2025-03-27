/**
 * Class: CSC-331-002
 * @author Gabriel Strickland
 * Date: 3/27/2025
 * Purpose: Phone subclass of the ElectronicsItem Class
 */

public class Phone extends ElectronicsItem {
    //Attributes
    private int PhoneLength;
    private int PhoneWidth;
    private int BatteryPercent;

    //Constructor
    public Phone(String name, String color, double price, String OS, String model, String plugType, String brand, int quantity, String type, int PhoneLength, int PhoneWidth, int BatteryPercent){
        super(name, color, price, OS, model, plugType,  brand, quantity, type);
        this.PhoneLength = PhoneLength;
        this.PhoneWidth = PhoneWidth;
        this.BatteryPercent = BatteryPercent;
    }

    //Getters
    public int getPhoneWidth() {
        return PhoneWidth;
    }

    public int getPhoneLength() {
        return PhoneLength;
    }

    public int getBatteryPercent() {
        return BatteryPercent;
    }

    //Setters
    public void setPhoneLength(int phoneLength) {
        PhoneLength = phoneLength;
    }

    public void setPhoneWidth(int phoneWidth) {
        PhoneWidth = phoneWidth;
    }

    public void setBatteryPercent(int batteryPercent) {
        BatteryPercent = batteryPercent;
    }

    //Behaviors
    /**
     * Displays information about the Phone
     * Prints Name, color, price, OS, model, plugType, brand, quantity, type, PhoneLength, PhoneWidth, BatteryPercent
     */
    public void displayPhoneInfo(){
        super.displayDetails();
        System.out.println("Phone Length: " + PhoneLength);
        System.out.println("Phone Width: " + PhoneWidth);
        System.out.println("BatteryPercent: " + BatteryPercent);

    }
}
