class Vegetable extends FoodItem {
    private String texture;
    private String color;


    public Vegetable(String name, int calories, double price, String texture, String color) {
        super(name, calories, price);
        this.texture = texture;
        this.color = color;
    }


    public String getTexture() {
        return texture;
    }

    public String getColor() {
        return color;
    }

    public void setType(String texture) {
        this.texture = texture;
    }


    public void setColor(String color) {
        this.color = color;
    }
}