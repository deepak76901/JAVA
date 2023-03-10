class Aeroplane
{
    public void Carry()
    {
        System.out.println("Carry Lugege");
    }

    public void fly()
    {
        System.out.println("Flying");
    }
}
class CargoPlane1 extends Aeroplane
{
    public void carry(){
        System.out.println("CargoPlane Carry goods");
    }
    public void fly(){
        System.out.println("Cargo Plane fly at Lower Heights");
    }
    public void takeOff(){
        System.out.println("CargoPlane req  longer Runway to takeoff");
    }
}
class PassengerPlane extends Aeroplane
{
    public void carry(){
        System.out.println("PassengerPlane Carry Passengers");
    }
    public void fly(){
        System.out.println("PassengerPlane flies at medium Heights");
    }
}
class FighterPlane extends Aeroplane
{
    public void carry(){
        System.out.println("FigterPlane Carry Fighters");
    }
    public void fly(){
        System.out.println("FighterPlane flies at Upper Heights");
    }
}


public class Inheritance2 {
    public static void main(String[] args) {
        Aeroplane cp = new CargoPlane1();
        cp.Carry();
        cp.fly();
        ((CargoPlane1)cp).takeOff();

        PassengerPlane pp = new PassengerPlane();
        pp.carry();
        pp.fly();

        FighterPlane fp = new FighterPlane();
        fp.carry();
        fp.fly();

        // Aeroplane ref1= new CargoPlane();
        // ref1.Carry();
        // ref1.fly();

        // Aeroplane ap = new Aeroplane();
        // ap.Carry();


        

    }
}
