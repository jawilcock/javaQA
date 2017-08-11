package Intermediate.Garage;

public class Car extends Vehicle{

    public String name;

    public Car(int tempID, String tempVehicleType,String tempName,int tempDoors)
    {
        super(tempID,tempVehicleType,tempDoors);
        name = tempName;

    }

    public String toString()
    {
        return super.toString() + this.name;
    }

}
