package Intermediate.PaintWizard;

public class Paint {

    public String name;
    public int size;
    public int coveragePerLitre;
    public double price;
    public int totalCoverage;
    public double pricePerMetreSquare;
    public double pricePerLitre;

    public Paint(String tempName, int tempSize, double tempPrice, int tempCover)
    {
        this.name = tempName;
        this.size = tempSize;
        this.coveragePerLitre = tempCover;
        this.price = tempPrice;
        this.totalCoverage = tempCover * tempSize;
        this.pricePerMetreSquare = tempPrice / coveragePerLitre;
        this.pricePerLitre = tempPrice / size;
    }

    public String toString()
    {
        return name + " "+ size + " "+coveragePerLitre + " "+price + " "+totalCoverage + " "+pricePerMetreSquare+" "+pricePerLitre+";";
    }
}
