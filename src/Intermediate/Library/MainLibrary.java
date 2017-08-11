package Intermediate.Library;

import java.util.ArrayList;

public class MainLibrary {

    public ArrayList<Person> personList = new ArrayList<>();
    public ArrayList<Item> itemList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void AddItem(Item tempItem) { itemList.add(tempItem); }

    public void RemoveItem(Item tempItem) {itemList.remove(tempItem);}

    public void UpdateItem(Item tempItem, String searchField)
    {
        for(Item searchedItem: itemList)
        {
            if(searchedItem.title == searchField)
            {
                if((searchedItem instanceof Thesis) && (tempItem instanceof Thesis))
                {
                    searchedItem.author = tempItem.author;
                    searchedItem.title = tempItem.title;
                    searchedItem.withdrawn = tempItem.withdrawn;
                    searchedItem.year = tempItem.year;
                    ((Thesis) searchedItem).university = ((Thesis) tempItem).university;
                }
            }
        }
    }

    public void RegisterPerson(Person tempPerson)
    {
        personList.add(tempPerson);
    }

    public void RemovePerson(Person tempPerson)
    {
        personList.remove(tempPerson);
    }

    public void UpdatePerson(Person newPerson, String searchName)
    {
        for(Person searchedPerson: personList)
        {
            if(searchedPerson.name == searchName)
            {
                searchedPerson.name = newPerson.name;
                searchedPerson.age  = newPerson.age;
                searchedPerson.personItemList = newPerson.personItemList;
            }
        }
    }

}
