// 1. this keyword is used to refer current class instance variable
package O_This_Keyword;

class Student {
    int roll;
    String name;
    float marks;

    /* Student(int roll, String name, float marks) {
        roll = roll;
        name = name;
        marks = marks;
    } */

    /* Student(int r, String n, float m) {
        roll = r;
        name = n;
        marks = m;
    } */

    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("\nRoll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }
}

public class a_this_current_class_instance_variable {
    public static void main(String[] args) {
        Student s1 = new Student(12, "Ram", 45.5f);
        Student s2 = new Student(14, "Sita", 99.9f);
        s1.displayDetails();
        s2.displayDetails();
    }
}
