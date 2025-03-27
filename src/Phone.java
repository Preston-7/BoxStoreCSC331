/**
 * Class: CSC-331-002
 * @author Gabriel Strickland
 * Date: 3/27/2025
 * Purpose: Electronics Item Class
 */

public class Phone {
    //Attributes
    private String PhoneBrand;
    private String PhoneModel;
    private double PhoneCost;
    private int PhoneWidth;
    private int PhoneLength;

    //Constructor
    /**
     * Constructor For the Phone Class
     * @param PhoneBrand
     * @param PhoneModel
     * @param PhoneCost
     * @param PhoneWidth
     * @param PhoneLength
     */
    Phone(String PhoneBrand, String PhoneModel, double PhoneCost, int PhoneWidth, int PhoneLength){
        this.PhoneBrand = PhoneBrand;
        this.PhoneModel = PhoneModel;
        this.PhoneCost = PhoneCost;
        this.PhoneWidth = PhoneWidth;
        this.PhoneLength = PhoneLength;
    }

    //Getters
    /**
     * Gets the Phone Brand
     * @return String PhoneBrand
     */
    public String getPhoneBrand() {
        return PhoneBrand;
    }

    /**
     * Gets the Phone Model
     * @return String Phone Model
     */
    public String getPhoneModel() {
        return PhoneModel;
    }

    /**
     * Gets the Phone Cost
     * @return double PhoneCost
     */
    public double getPhoneCost() {
        return PhoneCost;
    }

    /**
     * Gets the Phone Width
     * @return int Phone Width
     */
    public int getPhoneWidth() {
        return PhoneWidth;
    }

    /**
     * gets the Phone Length
     * @return int PhoneLength
     */
    public int getPhoneLength() {
        return PhoneLength;
    }

    //Setters

    /**
     * Sets the Phone Brand to new value
     * @param phoneBrand
     */
    public void setPhoneBrand(String phoneBrand) {
        PhoneBrand = phoneBrand;
    }

    /**
     * Sets the Phone Model to a new Value
     * @param phoneModel
     */
    public void setPhoneModel(String phoneModel) {
        PhoneModel = phoneModel;
    }

    /**
     * Sets the Phone Cost to a new Value
     * @param phoneCost
     */
    public void setPhoneCost(double phoneCost) {
        PhoneCost = phoneCost;
    }

    /**
     * Sets the Phone Width to a new value
     * @param phoneWidth
     */
    public void setPhoneWidth(int phoneWidth) {
        PhoneWidth = phoneWidth;
    }

    /**
     * Sets the Phone Length to a new value
     * @param phoneLength
     */
    public void setPhoneLength(int phoneLength) {
        PhoneLength = phoneLength;
    }
}
