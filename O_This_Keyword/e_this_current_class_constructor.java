// use of this keyword for constructor call
package O_This_Keyword;

class StuDemo {
    int roll;
    String name, course;
    float marks;

    StuDemo(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    StuDemo(int roll, String name, String course, float marks) {
        this(roll, name, course); // resuse of constructor using this keyword
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("\nRoll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Course = " + course);
        System.out.println("Marks = " + marks);
    }
}

public class e_this_current_class_constructor {
    public static void main(String[] args) {
        StuDemo s1 = new StuDemo(12, "Ram", "ICT");
        StuDemo s2 = new StuDemo(14, "Sita", "Science", 34.5f);
        s1.displayDetails();
        s2.displayDetails();
    }
}
