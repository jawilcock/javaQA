package Intermediate.LibraryTest;

import Intermediate.Library.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainLibraryTest {

    @Test
    public void TestRegisterPerson()
    {
        MainLibrary ml = new MainLibrary();
        Person tempPerson = new Person ("Nick",21,null);
        ml.RegisterPerson(tempPerson);

        assertEquals(1,ml.personList.size());
    }

    @Test
    public void TestRemovePerson()
    {
        MainLibrary ml = new MainLibrary();
        Person tempPerson = new Person ("Nick",21, null);
        ml.RegisterPerson(tempPerson);
        ml.RemovePerson(tempPerson);

        assertEquals(0,ml.personList.size());
    }

    @Test
    public void TestUpdatePerson()
    {
        MainLibrary ml = new MainLibrary();
        Person tempPerson = new Person ("Nick",22, null);
        ml.RegisterPerson(tempPerson);

        Book book = new Book("HP",1998, "JKSWAG",true,"Memes");
        Person newPerson = new Person( "Rick", 22, book);
        ml.UpdatePerson(newPerson, tempPerson.name);

        assertEquals("Rick",ml.personList.get(0).name);
        assertEquals(1,ml.personList.get(0).personItemList.size());
    }

    @Test
    public void TestAddItem()
    {
        MainLibrary ml = new MainLibrary();
        Book book = new Book("HP",1998, "JKSWAG",false,"Memes");
        Thesis thesis = new Thesis("A cruel angels thesis",1997, "Evangelion", false, "Uni of Hull");
        Journal journal = new Journal("A diary",2001, "AF", false, "Communism");

        ml.AddItem(book);
        ml.AddItem(thesis);
        ml.AddItem(journal);
        assertEquals(3,ml.itemList.size());
    }

    @Test
    public void TestRemoveItem()
    {
        MainLibrary ml = new MainLibrary();
        Thesis thesis = new Thesis("A cruel angels thesis",1997, "Evangelion", false, "Uni of Hull");
        ml.AddItem(thesis);
        ml.RemoveItem(thesis);

        assertEquals(0,ml.itemList.size());
    }

    @Test
    public void TestUpdateItem()
    {
        MainLibrary ml = new MainLibrary();
        Thesis thesis = new Thesis("A cruel angels thesis",1997, "Evangelion", false, "Uni of Hull");
        ml.AddItem(thesis);

        Thesis newThesis = new Thesis("A cruel angels thesis",1997, "Evangelion", false, "Uni of Anime");
        ml.UpdateItem(newThesis,thesis.title);

        if(ml.itemList.get(0) instanceof Thesis)
        {
            assertEquals("Uni of Anime",((Thesis) ml.itemList.get(0)).university);
        }

    }

}
