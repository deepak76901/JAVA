package Practice;
class Demo{
    private int a;
    private int b;
    private int c;

    Demo(){
       this(10,20,30);
        System.out.println("Zero parametrized constructor by me");
    }
    Demo(int a){
        this();
        this.a=a;
    }
    Demo(int a , int b){
        this.a=a;
        this.b=b;
    }
    Demo(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

class Launch{
    public static void main(String[] args) {
        Demo d = new Demo(40);
        d.disp();
        System.out.println();

        Demo d1 = new Demo(10,20,30);
        d1.disp();
        
    }
}