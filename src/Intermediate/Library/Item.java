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

    //hello

    /**

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getWithdrawn() {
        return withdrawn;
    }

    public void setWithdrawn(Boolean withdrawn) {
        this.withdrawn = withdrawn;
    }
        */
}
