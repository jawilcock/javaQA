package Intermediate.PaintWizard;

import java.util.ArrayList;
import java.util.Scanner;

public class PaintWizard {

    public ArrayList<Paint> paintList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("Welcome to the Paint Wizard!\n");
        PaintWizard paintW = new PaintWizard();
        paintW.Method();
    }

    public void Method()
    {
        int roomSize;

        Paint paint1 = new Paint("CheapoMax", 20,19.99,10);
        Paint paint2 = new Paint("AverageJoes", 15,17.99,11);
        Paint paint3 = new Paint("DuluxourousPaints", 10,25,20);

        paintList.add(paint1);
        paintList.add(paint2);
        paintList.add(paint3);

        System.out.println("Enter the room size in metres squared:");
        roomSize = sc.nextInt();

        for(Paint paint : paintList)
        {
            System.out.println(paint.name);
            int leftCoverage = paint.totalCoverage - roomSize;
            double wastePrice = leftCoverage / paint.pricePerMetreSquare;
            System.out.println(wastePrice);
            System.out.println("----------\n");
        }
    }
}
