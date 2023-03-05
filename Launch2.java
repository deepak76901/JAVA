class Demo1{
    private String name;
    private String gender;
    private int age;

    Demo1(){
        this("Priya");
        // name = "Deepak";
        // gender = "Male";
        // age = 21;
    }
    Demo1(String name){
        this("Kiran" , "FeMale");
        this.name=name;
        // gender = "Male";
        // age = 22;
    }
    Demo1(String name , String gender){
        this("Hero" , "Halwa", 15);
        this.name=name;
        this.gender=gender;
        // age=23;
    }
    Demo1(String name , String gender , int age){
        
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    void disp1(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }

}

public class Launch2 {
    public static void main(String[] args) {
    Demo1 d = new Demo1("Kunal" , "Demo");
    d.disp1();
    }
}
