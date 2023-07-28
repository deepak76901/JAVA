package ArrayDeque;
import java.util.*;

public class File1 {
    
    public static void main(String[] args) {
        
        System.out.println("Array Deque Concept :  ");

        ArrayDeque ad1=new ArrayDeque();
        ad1.add(10);
        ad1.add(20);
        ad1.add(30);

        System.out.println(ad1);

        ad1.addFirst(00);
        System.out.println(ad1);

        ad1.addLast(40);
        System.out.println(ad1);

        ad1.add(5);
        System.out.println(ad1);

        ad1.addLast(60);
        System.out.println(ad1);

        ad1.removeLast();
        System.out.println(ad1);

        
    }
}
