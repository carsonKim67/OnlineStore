public class Movie extends ItemForSale
{
    private double duration;
    private String directorName;

    public Movie(String name, double price, String datePlacedOnSale, double duration2, String directorName2){
        super(name,price,datePlacedOnSale);
        duration2=duration;
        directorName=directorName2;
    }

    public double getDuration(){
        return duration;
    }

    public String getDirectorName(){
        return directorName;
    }

    public void displayCreator(){
        System.out.println("Director: " + directorName);
    }
}
