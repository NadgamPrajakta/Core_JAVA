package Inheritance;

class BaseVehicle
{
    String name;
    
    public BaseVehicle(String name)
    {
        this.name = name;
        System.out.println("Value assigned in the super class: " + name);
    }
}

class FourWheeler extends BaseVehicle
{
    public FourWheeler(String name)
    {
        super(name);
    }
}

class ThreeWheeler extends FourWheeler
{
    public ThreeWheeler(String name)
    {
        super(name);
    }
}

class TwoWheeler extends ThreeWheeler
{
    public TwoWheeler(String name)
    {
        super(name.toUpperCase());
    }
}

public class Sixth {

    public static void main(String[] args) {
        
        TwoWheeler two = new TwoWheeler("Harley_Davidson");
    }

}
