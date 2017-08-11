package Intermediate.Library;

public abstract class Item {

    public String title;
    public int year;
    public String author;
    public Boolean withdrawn;

    public Item(String tempTitle, int tempYear, String tempAuthor, Boolean tempWithdrawn) {

        title = tempTitle;
        year = tempYear;
        author = tempAuthor;
        withdrawn =  tempWithdrawn;

    }

}
