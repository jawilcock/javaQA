package Intermediate.Garage;

public class Motorbike extends Vehicle{

    public String name;
    public int engineSize;

    public Motorbike(int tempID, String tempVehicleType,String tempName,int tempSize, int tempDoors)
    {
        super(tempID,tempVehicleType,tempDoors);
        name = tempName;
        engineSize = tempSize;
    }

}
