package Practice;
abstract class Aeroplane
{
    protected abstract void takeOff();
    public abstract void fly();
}
class CargoPlane extends Aeroplane
{
    public void takeOff()
    {
        System.out.println("Takeoff CargoPlane");
    }
    public void fly()
    {
        System.out.println("Fly CargoPlane");
    }
}
class PassengerPlane extends Aeroplane
{
    public void takeOff()
    {
        System.out.println(" TakeOff PP");
    }
    public void fly()
    {
        System.out.println("Fly PP");
    }
}
class FighterPlane extends Aeroplane
{
    public void takeOff()
    {
        System.out.println("Take Off FighterPlane");
    }
    public void fly()
    {
        System.out.println("Fly Fighter Plane");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Aeroplane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
    }
}

// Abstract class m access Modifiers ka access increase kr rha ho to chlega ,agar access decrease kr rha ho to nii mana jayega.