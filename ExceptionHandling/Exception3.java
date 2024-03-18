package ExceptionHandling;

public class Exception3 {
    public static void main(String[] args) {
        
        int num1=6;
        int num2= -2;
        int result=0;

        try
        {
            if(num2<0)
            {
                Exception e = new ArithmeticException("  Negative Number Not Allowed  ");
                throw e;
            }
            else
            {
            result=num1/num2;
            System.out.println(result);
            }
        }
        catch (Exception e)
        {
            System.out.println("Enter a valid Number   " + e);
        }

    }
}
