public class DemoHorses {

    public static void main(String[] args){
        Horse ricky = new Horse("Ricky", "White", 2014);
        RaceHorse kate = new RaceHorse("Kate", "Brown", 2016, 5);

        System.out.println("Name: " + ricky.getName() + "\nColor: " + ricky.getColor() +
                "\nBirth year: " + ricky.getBirthYear());

        System.out.println("Name: " + kate.getName() + "\nColor: " + kate.getColor() +
                "\nBirth year: " + kate.getBirthYear());

        ricky.setBirthYear(2015);
        ricky.setColor("Black");
        ricky.setName("Rick");

        kate.setBirthYear(2015);
        kate.setColor("Blue");
        kate.setName("Katy");
        kate.setRaces(6);

        System.out.println("Name: " + ricky.getName() + "\nColor: " + ricky.getColor() +
                "\nBirth year: " + ricky.getBirthYear());

        System.out.println("Name: " + kate.getName() + "\nColor: " + kate.getColor() +
                "\nBirth year: " + kate.getBirthYear());
    }


}
