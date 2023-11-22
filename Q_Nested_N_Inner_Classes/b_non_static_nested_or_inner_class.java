package Q_Nested_N_Inner_Classes;

class OuterClass {

    public void Display() {
        InnerClass in = new InnerClass();
        in.show();
    }

    class InnerClass {
        public void show() {
            System.out.println("This is the method within inner class.");
        }
    }
}

public class b_non_static_nested_or_inner_class {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.Display();
    }
}
