package Intermediate.Library;

public class Book extends Item {

    public String genre;

    public Book(String title, int year, String author, Boolean withdrawn, String tempGenre)
    {
        super(title,year,author,withdrawn);
        genre = tempGenre;
    }
}
