package Intermediate.Library;

public class Thesis extends Item{

    public String university;

    public Thesis(String title, int year, String author, Boolean withdrawn, String tempUni)
    {
        super(title,year,author,withdrawn);
        university = tempUni;
    }
}
