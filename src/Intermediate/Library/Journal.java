package Intermediate.Library;

public class Journal extends Item{

    public String topic;

    public Journal(String title, int year, String author, Boolean withdrawn, String tempTopic)
    {
        super(title,year,author,withdrawn);
        topic = tempTopic;
    }
}