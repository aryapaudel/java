package X_Access_Specifiers;

class Teacher {
    public int t_id = 45;
}

public class d_access_specifiers_public {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println("Teacher id = " + t1.t_id);
    }
}
