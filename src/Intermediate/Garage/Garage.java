package Intermediate.Garage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Garage{

    public LinkedList<Vehicle> vehicleList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    public int vehicleIDs = 0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Welcome to the Garage!\n");

        Garage garage = new Garage();
        garage.StartGarage();

    }

    public void StartGarage()
    {

        int input;

        System.out.println("Please declare what service you would like.");
        System.out.println("To add a new vehicle to the garage, press 1");
        System.out.println("To add bills to the vehicles, press 2");
        System.out.println("To remove a vehicle, press 3");
        System.out.println("To clear the garage, press 4");

        input = sc.nextInt();

        switch(input)
        {
            case 1:
                AddVehicle();
            case 2:
                CalculateBills();
            case 3:
                RemoveVehicle();
            case 4:
                ClearGarage();
        }


    }

    public void AddVehicle()
    {
        String vehicleType;
        int vehicleDoors;
        String vehicleName;

        System.out.println("Please enter the type of vehicle:");
        vehicleType = sc.next();
        switch (vehicleType)
        {
            case "Car":

                System.out.println("Please enter the name of the vehicle:");
                vehicleName = sc.next();

                System.out.println("Please enter the door count of the vehicle:");
                vehicleDoors = sc.nextInt();

                Car newCar = new Car(vehicleIDs,vehicleType,vehicleName,vehicleDoors);
                vehicleList.add(newCar);
                vehicleIDs = vehicleIDs + 1;
                break;

            case "Motorbike":

                System.out.println("Please enter the name of the vehicle:");
                vehicleName = sc.next();

                System.out.println("Please enter the size of the engine:");
                int engineSize = sc.nextInt();

                vehicleDoors = 0;

                Motorbike newMotorbike = new Motorbike(vehicleIDs,vehicleType,vehicleName,engineSize,vehicleDoors);
                vehicleList.add(newMotorbike);
                vehicleIDs = vehicleIDs + 1;
                break;

            case "Van":

                System.out.println("Please enter the name of the vehicle:");
                vehicleName = sc.next();

                System.out.println("Please enter the door count of the vehicle:");
                vehicleDoors = sc.nextInt();

                Van newVan = new Van(vehicleIDs,vehicleType,vehicleName,vehicleDoors);
                vehicleList.add(newVan);
                vehicleIDs = vehicleIDs + 1;
                break;
        }

        System.out.println("Current vehicles in garage:");
        //for(Vehicle vehicle : vehicleList)
            System.out.println(vehicleList);
        System.out.println("");
        StartGarage();

    }

    public void CalculateBills()
    {
        for(Vehicle vehicle : vehicleList)
        {
            if(vehicle.vehicleType == "Car")
            {
                vehicle.bill = 2000;
            }

            else if(vehicle.vehicleType == "Motorbike")
            {
                vehicle.bill = 1500;
            }

            else if(vehicle.vehicleType == "Van")
            {
                vehicle.bill = 3000;
            }
        }
        StartGarage();
    }

    public void RemoveVehicle()
    {
        int input;

        System.out.println("Press 1 for an ID Remove, Press 2 for a Type Remove");
        input = sc.nextInt();
        switch(input)
        {
            case 1:
                int tempID;
                System.out.println("Enter ID:");
                tempID = sc.nextInt();

                for(Vehicle vehicle : vehicleList)
                    if(tempID == vehicle.ID)
                    {
                        vehicleList.remove(vehicle);
                    }

            break;

            case 2:
                String tempType;
                System.out.println("Enter Type:");
                tempType = sc.next();

                for(Vehicle vehicle : vehicleList)
                    if(tempType == vehicle.vehicleType)
                    {
                        vehicleList.remove(vehicle);
                    }

                break;
        }

        StartGarage();
    }

    public void ClearGarage()
    {
        vehicleList.clear();
        System.out.println(vehicleList);
        System.out.println("Garage cleared");
        StartGarage();
    }

}
























