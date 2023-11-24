package S_Inheritance;

class BaseClass {
    public void hi() {
        System.out.println("Hi, this is the method of base class.");
    }
}

class DerivedClass extends BaseClass {
    public void hi() {
        System.out.println("Hi, this is the method of derived class.");
    }
}

public class d_single_same_method {
    public static void main(String[] args) {
        BaseClass b1 = new BaseClass();
        // DerivedClass d1 = new DerivedClass();
        BaseClass d1 = new DerivedClass();
        b1.hi();
        d1.hi();
    }
}
