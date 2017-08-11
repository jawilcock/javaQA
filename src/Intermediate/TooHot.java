package Intermediate;

public class TooHot {
static int temperature = 40;
static boolean isSummer = false;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Too hot? "+ TooHot(isSummer,temperature));
    }

    static boolean TooHot(boolean summer, int tempTemp)
    {
        Boolean isTooHot = false;
        if(summer == true)
        {
            if(tempTemp > 59 && tempTemp <= 101) isTooHot = true;
        }
        else
        {
            if(tempTemp > 59 && tempTemp <= 91) isTooHot = true;
        }

        return isTooHot;
    }
}
