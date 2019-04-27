public class ItemSold {
    private int invoiceNum;
    private String description;
    private double price;

    public ItemSold(int invoiceNum, String description, double price){
        this.invoiceNum = invoiceNum;
        this.description = description;
        this.price = price;
    }

    public int getInvoiceNum(){
        return invoiceNum;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public void setInvoiceNum(int invoiceNum){
        this.invoiceNum = invoiceNum;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
