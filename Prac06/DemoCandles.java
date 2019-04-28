public class DemoCandles {

    public static void main(String[] args){

        Candle candle1 = new Candle();
        ScentedCandle candle2 = new ScentedCandle();


        candle1.setColor("Red");
        candle1.setHeight(2);

        candle2.setColor("Purple");
        candle2.setHeight(3);
        candle2.setScent("Lavender");

        System.out.println("Color: " + candle1.getColor() +
                "\nHeight: " + candle1.getHeight() +
                "\nPrice: $" + candle1.getPrice());

        System.out.println("\nColor: " + candle2.getColor() +
                "\nHeight: " + candle2.getHeight() +
                "\nScent: " + candle2.getScent() +
                "\nPrice: $" + candle2.getPrice());
    }
}
