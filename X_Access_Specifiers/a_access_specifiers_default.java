package X_Access_Specifiers;

class Num {
    int x = 6; // no defined any acccess specifier, i.e. Default
}

public class a_access_specifiers_default {
    public static void main(String[] args) {
        Num n1 = new Num();
        System.out.println("The value is =" + n1.x);
    }
}
