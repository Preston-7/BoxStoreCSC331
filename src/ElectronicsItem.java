/**
 * Class: CSC-331-002
 * @author Gabriel Strickland
 * Date: 3/27/2025
 * Purpose: Electronics Item Class for the Electronic Based Items
 */

public class ElectronicsItem extends StoreItem{
    private String type;
    private String OS;
    private String model;
    private String plugType;
    private int WarrantyPeriod;

    /**
     * Electronics Item Constructor
     * @param name
     * @param color
     * @param price
     * @param OS
     * @param model
     * @param plugType
     * @param brand
     * @param quantity
     */
    public ElectronicsItem(String name, String color, double price, int quantity, String brand, String OS, String model, String plugType, String type, int WarrantyPeriod){
        super(name, color, price, brand, quantity);
        this.model = model;
        this.OS = OS;
        this.plugType = plugType;
        this.type = type;
        this.WarrantyPeriod = WarrantyPeriod;

    }

    //Accessors

    /**
     * Model Type Getter
     * @return String model
     */
    public String getModel() {
        return model;
    }

    /**
     * OS getter
     * @return String OS
     */
    public String getOS(){
        return OS;
    }

    /**
     * PlugType Getter
     * @return String plugType
     */
    public String getPlugType() {
        return plugType;
    }

    /**
     * Electronic Type getter
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * Warranty Period Getter
     * @return
     */
    public int getWarrantyPeriod() {
        return WarrantyPeriod;
    }

    //Mutators

    /**
     * Model Type Setter
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * OS Type Setter
     * @param OS
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Plug Type Setter
     * @param plugType
     */
    public void setPlugType(String plugType) {
        this.plugType = plugType;
    }

    /**
     * Type Setter
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Warranty Period Setter
     * @param warrantyPeriod
     */
    public void setWarrantyPeriod(int warrantyPeriod) {
        WarrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
        System.out.println("Operating System: " + OS);
        System.out.println("PlugType: " + plugType);
        System.out.println("Warranty Period: " + WarrantyPeriod);
    }
}
