package M_Constructors;

public class d_parameterized_constructor {
    d_parameterized_constructor() {
        System.out.println("Default constructor is invoked.");
    }

    d_parameterized_constructor(int a) {
        System.out.println("A single integer parameter is passed.");
    }

    d_parameterized_constructor(int a, int b) {
        System.out.println("Two integer parameters are passed.");
    }

    d_parameterized_constructor(int a, String b) {
        System.out.println("A single integer and a string parameters are passed.");
    }

    public static void main(String[] args) {
        /*
         * d_parameterized_constructor obj1 = new d_parameterized_constructor();
         * d_parameterized_constructor obj2 = new d_parameterized_constructor(24);
         * d_parameterized_constructor obj3 = new d_parameterized_constructor(45,78);
         * d_parameterized_constructor obj4 = new d_parameterized_constructor(67,
         * "Ram");
         */

        new d_parameterized_constructor();
        new d_parameterized_constructor(24);
        new d_parameterized_constructor(45, 78);
        new d_parameterized_constructor(67, "Ram");
    }
}
