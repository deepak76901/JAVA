package Patterns;
public class Palindrom {
    public static void main(String[] args) {
        String s1 = "raam";
        String s2 = "";
        for(int i=s1.length()-1 ; i>=0  ; i--){
            s2 = s2 + s1.charAt(i);
        }if (s2.equals(s1)){
            System.out.println("It's a Palindrome");
        }else{
            System.out.println("It's  Not a Palindrome");
        }
    }
}
