package P_Static_Fields_Methods;

public class b_static_methods {
    // instance variable
    int a = 19;

    // static variable
    static int b = 5;

    // instance method
    void displayInstanceMethod() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // static method
    static void displayStaticMethod() {
        // System.out.println("a = " + a); // error
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        b_static_methods obj = new b_static_methods();
        obj.displayInstanceMethod();
        displayStaticMethod();
    }
}
