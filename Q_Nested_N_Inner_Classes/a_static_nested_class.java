package Q_Nested_N_Inner_Classes;


// outer class
public class a_static_nested_class {
    static int roll = 25;

    // inner class
    static class InnnerClass {
        void showRoll() {
            System.out.println("Roll number is = " + roll);
        }
    }

    public static void main(String[] args) {
        a_static_nested_class.InnnerClass obj = new a_static_nested_class.InnnerClass();
        obj.showRoll();
    }
}
