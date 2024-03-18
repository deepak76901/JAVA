package Practice;
import java.util.*;

class Rectangle
{  
    Float length;
    Float breadth;
    Float area;

    public void input()
    {
        System.out.println("Calculation of Rectangle");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of rectangle");
        length = scan.nextFloat();

        System.out.println("Enter the Breadth of rectangle");
        breadth = scan.nextFloat();

    }

    public void compute()
    {
        area = length*breadth;
    }

    public void disp()
    {
        System.out.println("Area of Rectangle is : " + area);
    }
}

class Square
{
    Float length;
    Float area;

    public void input()
    {
        System.out.println("Calculation of Square");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Square");
        length = sc.nextFloat();

    }

    public void compute()
    {
        area = length*length;
    }

    public void disp()
    {
        System.out.println("Area of Square is : " + area);
    }

}

class Circle
{
    Float radius;
    Float area;

    public void input()
    {
        System.out.println("Calculation of Circle" );
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Radius of Circle");
        radius = sc.nextFloat();

    }

    public void compute()
    {
        area = 3.14f * radius * radius;
    }

    public void disp()
    {
        System.out.println("Area of Circle is : " + area);
    }
}

public class AreasProgram {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.input();
        rec.compute();
        rec.disp();

        Square sq = new Square();
        sq.input();
        sq.compute();
        sq.disp();

        Circle c = new Circle ();
        c.input();
        c.compute();
        c.disp();
        
    }
}
