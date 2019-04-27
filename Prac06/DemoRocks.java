public class DemoRocks {

    public static void main(String[] args){
        Rock rock1 = new Rock(23, 2.16);

        IgneousRock rock2 = new IgneousRock(26, 1.99);

        MetamorphicRock rock3 = new MetamorphicRock(16, 3.46);

        SedimentaryRock rock4 = new SedimentaryRock(3, 6.12);


        System.out.println("Sample number: " + rock1.getSampleNum() +
                "\nWeight: " + rock1.getWeightInGrams() +
                "\nDescription: " + rock1.getDescription());

        System.out.println("\nSample number: " + rock2.getSampleNum() +
                "\nWeight: " + rock2.getWeightInGrams() +
                "\nDescription: " + rock2.getDescription());
        System.out.println("\nSample number: " + rock3.getSampleNum() +
                "\nWeight: " + rock3.getWeightInGrams() +
                "\nDescription: " + rock3.getDescription());
        System.out.println("\nSample number: " + rock4.getSampleNum() +
                "\nWeight: " + rock4.getWeightInGrams() +
                "\nDescription: " + rock4.getDescription());


        rock1.setSampleNum(10);
        rock1.setWeightInGrams(1.5);
        rock1.setDescription("abc");

        rock2.setSampleNum(43);
        rock2.setWeightInGrams(2.78);
        rock2.setDescription("whgfd");

        rock3.setSampleNum(73);
        rock3.setWeightInGrams(4.6);
        rock3.setDescription("5ewre");

        rock4.setSampleNum(32);
        rock4.setWeightInGrams(5.3);
        rock4.setDescription("wrefe");

        System.out.println("\nSample number: " + rock1.getSampleNum() +
                "\nWeight: " + rock1.getWeightInGrams() +
                "\nDescription: " + rock1.getDescription());

        System.out.println("\nSample number: " + rock2.getSampleNum() +
                "\nWeight: " + rock2.getWeightInGrams() +
                "\nDescription: " + rock2.getDescription());

        System.out.println("\nSample number: " + rock3.getSampleNum() +
                "\nWeight: " + rock3.getWeightInGrams() +
                "\nDescription: " + rock3.getDescription());
        System.out.println("\nSample number: " + rock4.getSampleNum() +
                "\nWeight: " + rock4.getWeightInGrams() +
                "\nDescription: " + rock4.getDescription());

    }
}
