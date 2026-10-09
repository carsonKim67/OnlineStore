
public class Book extends ItemForSale
{
    private String publisher;
    private Author author;

    public Book(String name, double price, String datePlacedOnSale, String pub2,Author author2){
        super(name,price, datePlacedOnSale);
        publisher=pub2;
        author=author2;
    }

    public String getPublisher(){
        return publisher;
    }

    public Author getAuthor(){
        return author;
    }

    public void displayCreator(){
        if(author!=null){
            System.out.print("Author: " + author.getName());
        }
    }
}
