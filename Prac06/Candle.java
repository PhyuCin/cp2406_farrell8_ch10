public class Candle {

    private String color;
    private int height;
    public double price;

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
        this.price = 2 *height;

    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getHeight() {
        return height;
    }
}
