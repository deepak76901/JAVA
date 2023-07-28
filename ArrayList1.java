package ArrayList;

import java.util.*;

class File1{
    public static void main(String[] args) {

        // System.out.println("Hello ");

        ArrayList al1 = new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1);

        ArrayList al2 = new ArrayList();

        al2.add("Deepak");
        al2.add("Baghel");
        al2.add(10);
        al2.add("Crore");
        al2.add("ka Malik Hai");

        System.out.println(al2);

        ArrayList al3 = new ArrayList();

        al3.add(10);
        al3.add("PW");

        System.out.println(al3);

        al3.add(2,"Skills");

        System.out.println(al3);


        
    }
}