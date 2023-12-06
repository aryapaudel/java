package W_Abstraction;

abstract class Dad {
    abstract void hi();
}

class Son extends Dad {
    void hi() {
        System.out.println("Hello dad, this is your son.");
    }
}

class Daughter extends Dad {
    void hi() {
        System.out.println("Hi dad, this is your daughter.");
    }
}

public class a_abstract {
    public static void main(String[] args) {
        Dad d1 = new Son();
        Dad d2 = new Daughter();
        d1.hi();
        d2.hi();
    }
}
