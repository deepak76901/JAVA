package Practice;

class Addition
{
    void add(int x,int y)
    {
        System.out.println(x+y);
    }

    void add(int x,double y)
    {
        System.out.println(x + y);
    }

    void add(double x,double y ,double z)
    {
        System.out.println(x+y+z);
    }
    void add(double x,double y,int z)
    {
        System.out.println(x + y + z);
    }
    void add(double x,int y)
    {
        System.out.println(x + y);
    }
}

public class MethodOver {
    public static void main(String []args){

        Addition ad = new Addition();
        ad.add(63,37.56);
        ad.add(38.68,36.91,9.35);
        ad.add(5.19,8.24,5);
        ad.add(21,57);
        ad.add(6.89,84);
    }
}
