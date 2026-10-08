public class Author
{
    private String name;
    private String dateOfBirth;

    public Author(String name2, String dateOfBirth2){
        name=name2;
        dateOfBirth=dateOfBirth2;
    }

    public String getName(){
        return name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
}
