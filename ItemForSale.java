public class ItemForSale
{
    private String name; 
    private double price;
    private String datePlacedOnSale;

    public ItemForSale(String name2, double price2, String datePlacedOnSale2){
        name=name2;
        price=price2;
        datePlacedOnSale=datePlacedOnSale2;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getDatePlacedOnSale(){
        return datePlacedOnSale;
    }
    public void displayCreator(){
        System.out.println("");
    }
}
