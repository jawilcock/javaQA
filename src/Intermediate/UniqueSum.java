package Intermediate;

public class UniqueSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Result: " + UniqueSumCalc(1,2,3));
    }

    static int UniqueSumCalc(int num1, int num2, int num3)
    {
        int returnSum = 0;

        switch (num1)
        {
            case 1: if(num1 == num2)

                returnSum = num3;

            case 2: if(num1 == num3)

                returnSum = num2;

            case 3: if(num2 == num3)

                returnSum = num1;

            case 4: if(num1 == num2 && num1 == num3)

                returnSum = 0;

            case 5:

                returnSum = num1 + num2 + num3;
        }

        return returnSum;

    }

}