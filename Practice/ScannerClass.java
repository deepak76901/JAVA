package Practice;
import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = scan.nextInt();
        System.out.print("Enter Second Number :");
        int b = scan.nextInt();

        System.out.println("The Sum of 2 numbers is " + (a+b));

        System.out.print("Enter the Username : ");
        String username = scan.next();
        System.out.print("Enter the password : ");
        String password = scan.next();
        System.out.println("The Username is " + username);
        System.out.println("The password is " + password);
        scan.close();

    }
    
}
