package Intermediate;

public class Blackjack {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Result: " + BlackjackCalc(22,22));

    }

    public static int BlackjackCalc(int num1, int num2)
    {
        int returnValue = 0;

        if(num1 > 21 && num2 > 21)
            returnValue = 0;
        else
        {
            if(num1 > num2)
            {
                if(num1 <= 21) returnValue = num1;
                else returnValue = num2;
            }

            else if(num2 > num1)
            {
                if(num1 <= 21) returnValue = num2;
                else returnValue = num1;
            }

        }

        return returnValue;
    }

}