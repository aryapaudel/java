package S_Inheritance;

class Mom {
    public void cooking() {
        System.out.println("Mom is cooking meal.");
    }
}

class Daughter extends Mom {
    @Override
    public void cooking() {
        System.out.println("Mom ki pari is cooking meal.");
    }
}

public class f_method_overriding {
    public static void main(String[] args) {
        Daughter riya = new Daughter();
        riya.cooking();
    }

}
