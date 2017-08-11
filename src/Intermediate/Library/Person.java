package Intermediate.Library;

import java.util.ArrayList;

public class Person {

    public String name;
    public int age;
    public ArrayList<Item> personItemList = new ArrayList<>();

    public Person(String tempName, int tempAge, Item tempItem)
    {
        name = tempName;
        age = tempAge;
        personItemList.add(tempItem);
    }
}
