// import java.util.Scanner;

class calc{
    public int add(int n1 , int n2){
        int result = (n1 + n2);
        return result; 
    }
}
// class Scanner{
//     public int scan(n1 , n2){
//         int res=(n1+n2);
//         return res;
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Type a Number");
//         int n1 = scan.nextInt();
//         System.out.println("Type an Number");
//         int n2 = scan.nextInt();

//         int c=n1+n2;
//         System.out.println(c);
//         // calc obj = new calc();
//     }
// }
// int result = obj.add());
// System.out.println(result);

class oops{
public static void main(String[] args) {
    calc obj = new calc();
    int result = obj.add(4,79);
    System.out.println(result);
}
}