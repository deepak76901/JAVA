package Practice;

class Student
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}

public class Encap {
    public static void main(String[] args) {

        Student st = new Student();
        st.setName("Deepak");
        st.setAge(51);
        
        System.out.println(st.getName());
        System.out.println(st.getAge());
    }
}
