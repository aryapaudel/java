package M_Constructors;

class Student {
    Student() {
        System.out.println("Default construtor is invoked.");
    }
}

public class b_default_constructor {
    public static void main(String[] args) {
        // Student s1 = new Student();
        new Student();
    }
}
