package Intermediate.WorkingWithFiles;

import java.io.*;
import java.util.ArrayList;

public class MainFile {

    static ArrayList<Person> peopleList = new ArrayList<>();
    static ArrayList<Person> updatedPeopleList = new ArrayList<>();

    public static void main(String[] args) {

        MainFile mf = new MainFile();

        Person person1 = new Person("Adam","Memer", 18);
        peopleList.add(person1);
        Person person2 = new Person("Bob","Streamer", 19);
        peopleList.add(person2);
        Person person3 = new Person("Chris","Chef", 20);
        peopleList.add(person3);
        Person person4 = new Person("Dave","Madman", 28);
        peopleList.add(person4);
        Person person5 = new Person("Eddie","Pool Pro", 38);
        peopleList.add(person5);

        mf.WriteFile();
        try {
            mf.ReadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Person person: updatedPeopleList)
        {
            System.out.println(person);
        }
    }

    public void WriteFile()
    {
        try
        {
            File file = new File("C://Users/Administrator/Documents/JavaProject/src/Intermediate/WorkingWithFiles/people.txt");

            if(!file.exists()) file.createNewFile();

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for(Person person: peopleList)
            {
                bw.write(person.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void ReadFile() throws IOException {

        try {

            File file = new File("C://Users/Administrator/Documents/JavaProject/src/Intermediate/WorkingWithFiles/people.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = reader.readLine();
            while(line != null)
            {


                String[] parts = line.split(",");
                String part1 = parts[0];
                String part2 = parts[1];
                int part3 = Integer.parseInt(parts[2]);

                Person newPerson = new Person(part1,part2,part3);
                updatedPeopleList.add(newPerson);

                line = reader.readLine();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
