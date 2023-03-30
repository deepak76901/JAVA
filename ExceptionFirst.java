package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFirst {
    public static void main(String[] args) {
        
        int num = 0 ;
        
        try(Scanner sc = new Scanner(System.in);)
        {
            num = sc.nextInt();
            
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter a Number");
        }
        
        // finally
        // {
        //     sc.close();
        //     System.out.println("Resourcce Closed");
        // }

        System.out.println(num);
    }
}
