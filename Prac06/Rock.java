public class Rock {

    private int sampleNum;
    private String description;
    private double weightInGrams;

    public Rock(int sampleNum, double weightInGrams) {
        this.sampleNum = sampleNum;
        this.weightInGrams = weightInGrams;
        this.description = "Unclassified";
    }

    public int getSampleNum() {
        return sampleNum;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public String getDescription() {
        return description;
    }


    public void setSampleNum(int sampleNum) {
        this.sampleNum = sampleNum;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public void setDescription(String description){
        this.description = description;

}



}
