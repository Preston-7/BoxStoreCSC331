class Fruit extends FoodItem {
    private String taste;
    private String size;

    public Fruit(String name, int calories, double price, String taste, String size) {
        super(name, calories, price);
        this.taste = taste;
        this.size = size;
    }

    public String getTaste() {
        return taste;
    }

    public String getSize() {
        return size;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setSize(String size) {
        this.size = size;
    }
}