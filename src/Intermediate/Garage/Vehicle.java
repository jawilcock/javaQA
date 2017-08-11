package Intermediate.Garage;

public class Vehicle {

    public int ID;
    public String vehicleType;
    public int doors;
    public int bill;


    public Vehicle(int tempID, String tempVehicleType, int tempDoors)
    {
        ID = tempID;
        vehicleType = tempVehicleType;
        doors = tempDoors;
    }

    public String toString()
    {
        return this.ID + this.vehicleType + this.doors + this.bill;
    }
}

