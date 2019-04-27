public class DemoItemsAndPets {

    public static void main(String[] args){

        ItemSold fleaSpray = new ItemSold(24, "Flea Spray", 5.90);
        ItemSold catShampoo = new ItemSold(56, "Cat Shampoo", 21.90);

        PetSold kitten = new PetSold(10, "Turkish Angora", 247.50, false, false, false);
        PetSold dog = new PetSold(12, "Golden Retriever", 523.90, true, true, true);


        System.out.println("Invoid Number: " + fleaSpray.getInvoiceNum() +
                "\nDescription: " + fleaSpray.getDescription() +
                "\nPrice: $" + fleaSpray.getPrice());

        System.out.println("\nInvoid Number: " + catShampoo.getInvoiceNum() +
                "\nDescription: " + catShampoo.getDescription() +
                "\nPrice: $" + catShampoo.getPrice());

        System.out.println("\nInvoid Number: " + kitten.getInvoiceNum() +
                "\nDescription: " + kitten.getDescription() +
                "\nPrice: $" + kitten.getPrice() +
                "\nVaccinated: " + kitten.getVaccinated() +
                "\nNeutered: " + kitten.getNeutered()+
                "\nHousebroken: " + kitten.getHousebroken());

        System.out.println("\nInvoid Number: " + dog.getInvoiceNum() +
                "\nDescription: " + dog.getDescription() +
                "\nPrice: $" + dog.getPrice() +
                "\nVaccinated: " + dog.getVaccinated() +
                "\nNeutered: " + dog.getNeutered()+
                "\nHousebroken: " + dog.getHousebroken());

        fleaSpray.setInvoiceNum(43);
        fleaSpray.setDescription("Flea spray, for cats.");
        fleaSpray.setPrice(6.70);

        catShampoo.setInvoiceNum(76);
        catShampoo.setDescription("Cat shampoo, only for cats");
        catShampoo.setPrice(23.34);

        kitten.setInvoiceNum(173);
        kitten.setDescription("Turkish Angora, 2 weeks old");
        kitten.setPrice(123.78);
        kitten.setVaccinated(true);
        kitten.setNeutered(true);
        kitten.setHousebroken(true);

        dog.setInvoiceNum(290);
        dog.setDescription("Golden Retriever, 3 years old");
        dog.setPrice(623.23);
        dog.setVaccinated(false);
        dog.setNeutered(false);
        dog.setHousebroken(false);


        System.out.println("\nInvoid Number: " + fleaSpray.getInvoiceNum() +
                "\nDescription: " + fleaSpray.getDescription() +
                "\nPrice: $" + fleaSpray.getPrice());

        System.out.println("\nInvoid Number: " + catShampoo.getInvoiceNum() +
                "\nDescription: " + catShampoo.getDescription() +
                "\nPrice: $" + catShampoo.getPrice());

        System.out.println("\nInvoid Number: " + kitten.getInvoiceNum() +
                "\nDescription: " + kitten.getDescription() +
                "\nPrice: $" + kitten.getPrice() +
                "\nVaccinated: " + kitten.getVaccinated() +
                "\nNeutered: " + kitten.getNeutered()+
                "\nHousebroken: " + kitten.getHousebroken());

        System.out.println("\nInvoid Number: " + dog.getInvoiceNum() +
                "\nDescription: " + dog.getDescription() +
                "\nPrice: $" + dog.getPrice() +
                "\nVaccinated: " + dog.getVaccinated() +
                "\nNeutered: " + dog.getNeutered()+
                "\nHousebroken: " + dog.getHousebroken());
    }
}
