class ShelfStable extends FoodItem {
    private String storageCondition;
    private String expirationDate;
    private String brand;

    public ShelfStable(String name, int calories, double price, String storageCondition, String expirationDate, String brand) {
        super(name, calories, price);
        this.storageCondition = storageCondition;
        this.expirationDate = expirationDate;
        this.brand = brand;
    }

    public String getStorageCondition() {
        return storageCondition;
    }

    public String getBrand() {
        return brand;
    }

    public String getExpirationDate() {
        return expirationDate;
    }


    public void setStorageCondition(String storageCondition) {
        this.storageCondition = storageCondition;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}