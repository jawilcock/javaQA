package Intermediate.Garage;

public class Van extends Vehicle{

    public String name;

    public Van(int tempID, String tempVehicleType,String tempName,int tempDoors)
    {
        super(tempID,tempVehicleType,tempDoors);
        name = tempName;

    }

}
