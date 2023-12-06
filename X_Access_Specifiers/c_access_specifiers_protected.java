package X_Access_Specifiers;

class Sum {
    protected int add(int a, int b) {
        return (a + b);
    }
}

public class c_access_specifiers_protected extends Sum {
    public static void main(String[] args) {
        Sum obj = new Sum();
        System.out.println("The sum = " + obj.add(34, 89));
    }
}
