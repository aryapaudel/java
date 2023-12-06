package X_Access_Specifiers;

class Student {
    // private int roll = 34; // cannot accesible out of class
    public int roll = 34;
}

public class b_access_specifiers_private {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Roll = " + s1.roll);
    }
}
