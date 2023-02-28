public class Strings {

    public static void main(String[] args) {
        // String name ="Deepak";
        // System.out.println(name);
        // String names= new String("Arifa i love u");
        // System.out.println(names);
        // names = "Arifa i want to fuck u";
        // System.out.println(names);
        // name = "aditya";
        // System.out.println(name);
        // int n ;
        // n = 79;
        // System.out.println(n);

        // char []ch = {'j','o','a','w'};
        // System.out.println(ch[0]);
        // String s = new String(ch);
        // System.out.println(s);

        // String s1 = new String("Deepak Baghel");
        // String s2 = new String("Deepak Baghel");
        // System.out.println(s1 == s2);
        // System.out.println(s1.equals(s2));

        // String s3 = "Deepak";
        // System.out.println(s3.charAt(0));
        // System.out.println(s3.charAt(1));

        // String s = "Deepak";
        // System.out.println(s.charAt(4));
        // System.out.println(s.substring(1, 4));
        // System.out.println(s.concat(" tendulkar"));
        // System.out.println(s.length());
        // System.out.println(s.replace('e','a'));
        // System.out.println(s.replace('a','e'));
        // s = s.toLowerCase();
        // // System.out.println(s.toLowerCase());
        // System.out.println(s);
        // System.out.println(s.trim());
        // System.out.println(s.indexOf('E'));
        // System.out.println(s.lastIndexOf('E'));
        // String s1 = s.toString();
        // System.out.println(s1.equals(s));
        // String s1= s.concat(" Baghel");
        // System.out.println(s);
        // System.out.println(s1);
        // String  s2 = s1 + " is a Pro Coder.";
        // System.out.println(s2);

        // REVERSING THE STRING

        // String str= "Deepak Baghel";
        // String str2="";
        // System.out.println("Before Reversing : " + str);
        // for(int i=str.length()-1 ; i>=0 ; i-- ){
        //     str2= str2 + str.charAt(i);
        // }
        // System.out.println("After Reversing : " + str2);

        // String s1="Deepak Baghel";
        // String s2="";
        // String arr[] = s1.split(" ");
        // // System.out.println(arr[1]);
        // for  (int j=arr.length - 1;j>=0;j--){
        //     s2 = s2 + arr[j] + " ";
        // }System.out.println(s2);

        String s3="Deepak Baghel";
        String s4="";
        String sarr[]=s3.split(" ");
        // System.out.println(sarr[1]);
        for(String elem : sarr){
            for(int i=elem.length()-1 ; i>=0 ; i--){
                s4 = s4 + elem.charAt(i) ;
            }s4 = s4 + " ";
        }
        System.out.println("Before Reversing : " + s3);
        System.out.println("After Reversing : " + s4);

    }
}
