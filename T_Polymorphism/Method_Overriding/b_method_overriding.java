package T_Polymorphism.Method_Overriding;

class GrandPa {
    void Hello() {
        System.out.println("Hello from grandpa");
    }
}

class Dad extends GrandPa {
    void Hello() {
        System.out.println("Hello from dad.");
    }
}

class Child extends Dad {
    void Hello() {
        System.out.println("Hello from child.");
    }
}

public class b_method_overriding {
    public static void main(String[] args) {
        GrandPa a, b, c;
        a = new GrandPa();
        b = new Dad();
        c = new Child();

        a.Hello();
        b.Hello();
        c.Hello();
    }
}
