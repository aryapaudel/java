package M_Constructors;

public class f_copy_constructor {
    int roll;
    String name;

    // copy constuctor
    f_copy_constructor(int r, String n) {
        roll = r;
        name = n;
    }

    f_copy_constructor(f_copy_constructor stu) {
        System.out.println("\nAfter invoking copy constructor:");
        roll = stu.roll;
        name = stu.name;
    }

    int displayRoll() {
        return roll;
    }

    String displayName() {
        return name;
    }

    public static void main(String[] args) {
        f_copy_constructor st1 = new f_copy_constructor(12, "Ram");
        System.out.println("\nRoll no = " + st1.displayRoll());
        System.out.println("Name = " + st1.displayRoll());

        f_copy_constructor st2 = new f_copy_constructor(st1);
        System.out.println("Roll no = " + st2.displayRoll());
        System.out.println("Name = " + st2.displayRoll());
    }
}
