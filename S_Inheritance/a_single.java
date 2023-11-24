package S_Inheritance;

class SuperClass {
    public void hi() {
        System.out.println("Hi, Students");
    }
}

class SubClass extends SuperClass {
    public void hello() {
        System.out.println("Hello, Students");
    }
}

public class a_single {
    public static void main(String[] args) {
        SubClass s1 = new SubClass();
        s1.hello();
        s1.hi(); // method of SuperClass
    }
}
