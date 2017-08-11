package Beginner;

public class Beginner {

    static int[] arrayOfInts = new int[10];

    public static void main(String[] args) {

        System.out.print(string("Hello world!\n"));
        createArray();

        for(int i = 0; i <10; i++)
        {
            System.out.println(method(arrayOfInts[i],4,false));
        }

    }

    static String string(String hello)
    {
        return hello;
    }

    static int method(int num1, int num2, Boolean condition)
    {

        int returnValue = 0;

        if(num1 == 0)
        {
            returnValue = num2;
        }
        else if(num2 == 0)
        {
            returnValue = num1;
        }
        else
        {
            if(condition == false)
            {
                returnValue = num1 * num2;
            }
            else returnValue = num1 + num2;

        }

        return returnValue;
    }

    public static void createArray()
    {
        System.out.println("");
        System.out.println("Array values:");
        for(int i = 0; i < arrayOfInts.length; i++)
        {
            System.out.println(arrayOfInts[i] = i+1);
        }
        System.out.println("---\n");
        System.out.println("Multiplied Array:");
        for(int i = 0; i < arrayOfInts.length; i++)
        {
            System.out.println(arrayOfInts[i] = arrayOfInts[i] * 10);
        }
        System.out.println("---\n");
    }

}

