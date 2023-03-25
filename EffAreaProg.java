package Practice;
import java.util.Scanner;

abstract class shape
{
    float area;

    abstract public void input();
    abstract public void compute();
    public void disp()
    {
        System.out.println("Area is : " + area);
    }
}

class Rectangle1 extends shape
{
    float length;
    float breadth;

    public void input()
    {
        System.out.println("Calculation of Rectangle");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of Rectangle ");
        length = scan.nextFloat();
        System.out.println("Enter the breadth of Rectangle");
        breadth = scan.nextFloat();
    }

    public void compute()
    {
        area = length * breadth;
    }
}

class Square1 extends shape
{
    float length;
    
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
}

class Circle1 extends shape
{
    float radius;

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
}

class geometry
{
    public void poly(shape ref)
    {
        ref.input();
        ref.compute();
        ref.disp();
    }
}

public class EffAreaProg {
    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1();
        Square1 sq = new Square1();
        Circle1 c = new Circle1();

        geometry g= new geometry();
        g.poly(rec);
        g.poly(sq);
        g.poly(c);
        
    }
}
