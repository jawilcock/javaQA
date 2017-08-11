package Intermediate.Library;

public interface ItemCRUD extends PersonCRUD{
    void AddItem(Item i);
    void RemoveItem(Item i);
    void UpdateItem(Item i,String s);
}
