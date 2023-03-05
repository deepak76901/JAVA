class Trial{
    static int age;
    static String name;
    String myName = "Deepak Baghel";
    static{
        age=21;
        name = "Deepak";
        // System.out.println(a);
        //myName = "sop"; //Not Possible because we cant store non-static variables in static area 
    }
    static void Demo(){
        System.out.println(name + " is " + age + " years old." );
    }
}

public class Static {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Trial tr=new Trial();
        System.out.println(Trial.name); 
        System.out.println(Trial.age);
        System.out.println(tr.name);
        System.out.println(tr.age);

        Trial.name = "Rahul";   // Static Variable value ko change kr skte h ese.

        Trial.Demo(); // static methods ko hamesha className se hi call krna chahiye , kr ham refrence variable se bhi skte h
        // tr.Demo();
        // tr.myName = "fi";
        System.out.println(tr.myName);
        // System.out.println(Trial.myName);  // ham non-static variables ko className se access nhi kr skte, sirf refrence variable se hi  access kr skte h(ya ObjectName se) 
        
    }
}