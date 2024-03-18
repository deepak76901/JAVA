package ArrayList;
import java.util.*;
import java.lang.*;

public class ArrayList2 {
    public static void main(String[] args) {
        
        ArrayList al=new ArrayList();
        al.add("Hello");
        al.add("World");
        al.add("Deepak");
        al.add(3,56);

        String ab = (String)al.get(0);
        Integer i = (Integer)al.get(3);

        System.out.println(ab);
        System.out.println(i);


    }
}
