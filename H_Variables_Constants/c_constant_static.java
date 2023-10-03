package H_Variables_Constants;

class Student{
    static int clzId =27;
    int roll;
    String name;

    void input(int r, String n){
        roll = r;
        name = n;
    }
    void output()
    {
        System.out.println("College Id = " + clzId);
        System.out.println("Roll Number = " + roll);
        System.out.println("Name = " + name);
    }
}

public class c_constant_static {
    public static void main(String[] args) {
        // Student.clzId = 67;
        Student s1 = new Student();
        s1.input(12, "Ram");
        s1.output();
        Student s2 = new Student();
        s2.input(44, "Sita");
        s2.output();
    }
}
