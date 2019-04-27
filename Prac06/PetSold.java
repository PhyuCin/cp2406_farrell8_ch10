public class PetSold extends ItemSold {

    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;

    public PetSold(int invoiceNum, String description, double price, boolean vaccinated,
                   boolean neutered, boolean housebroken){
        super(invoiceNum, description, price);
        this.vaccinated = vaccinated;
        this.neutered = neutered;
        this.housebroken = housebroken;

    }

    public boolean getVaccinated(){
        return vaccinated;
    }

    public boolean getNeutered(){
        return neutered;
    }

    public boolean getHousebroken(){
        return housebroken;
    }


    public void setVaccinated(boolean vaccinated){
        this.vaccinated = vaccinated;
    }

    public void setNeutered(boolean neutered){
        this.neutered = neutered;
    }

    public void setHousebroken(boolean housebroken){
        this.housebroken = housebroken;
    }
}
