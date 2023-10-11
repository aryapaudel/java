// 3. use of this keyword to invoke current class constructor
// calling default constructor from parameterized constructor
package O_This_Keyword;

class Nums {
    Nums() {
        System.out.println("Default constructor invoked");
    }

    Nums(int a) {
        this();
        System.out.println("The value = " + a);
    }
}

public class c_this_current_class_constructor {
    public static void main(String[] args) {
        // Nums n1 = new Nums(23);
        new Nums(23);
    }
}
