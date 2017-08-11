package Intermediate;

import java.util.ArrayList;

public class People{

    String name;
    int age;
    String jobTitle;

    static ArrayList<People> peopleList = new ArrayList<People>();

    People(String name, int age, String jobTitle){
        this.name=name;
        this.age=age;
        this.jobTitle=jobTitle;
    }

    public String toString()
    {
        return "Name: "+name+", Age: "+age+", Job: "+jobTitle;
    }

    static void CreatePeople()
    {
        People person1 = new People("Jeff",21, "Memes");
        peopleList.add(person1);
        People person2 = new People("Mike",24, "Streamer");
        peopleList.add(person2);
        People person3 = new People("Harry",27, "Unemployed");
        peopleList.add(person3);
    }

    public static void main(String[] args) {

        CreatePeople();
        for(int i = 0; i < peopleList.size();i++)
        {
            System.out.println(peopleList.get(i));
        }

    }
}
