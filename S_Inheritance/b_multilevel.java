package S_Inheritance;

class GrandPa {
    public void grand() {
        System.out.println("Hello, grandpa");
    }
}

class Father extends GrandPa {
    public void dad() {
        System.out.println("Hello, dad");
    }
}

class Son extends Father {
    public void child() {
        System.out.println("Greetings from your child.");
    }
}

public class b_multilevel {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.grand();
        s1.dad();
        s1.child();
    }
}
