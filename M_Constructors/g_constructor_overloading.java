package M_Constructors;

class ConsOverloadingDemo {
    ConsOverloadingDemo(int a) {
        System.out.println("a = " + a);
    }

    ConsOverloadingDemo(int a, String name) {
        System.out.println("a = " + a + " Name = " + name);
    }

    ConsOverloadingDemo(double c) {
        System.out.println("c = " + c);
    }
}

public class g_constructor_overloading {
    public static void main(String[] args) {
        // ConsOverloadingDemo s1 = new ConsOverloadingDemo(25);
        // ConsOverloadingDemo s2 = new ConsOverloadingDemo(25, "Ram");
        // ConsOverloadingDemo s3 = new ConsOverloadingDemo(25.25);
        new ConsOverloadingDemo(25);
        new ConsOverloadingDemo(25, "Ram");
        new ConsOverloadingDemo(25.25);
    }

}
