import java.util.Scanner;

class Student {
    int roll;
    int age;
    String name;

    void getdata(Scanner sc) {
        roll = sc.nextInt();
        age = sc.nextInt();
        name = sc.next();
    }

    void display() {
        System.out.println("Roll =" + roll);
        System.out.println("Age =" + age);
        System.out.println("Name =" + name);
    }
}

public class e_user_input_student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of the student1:");
        Student st1 = new Student();
        st1.getdata(sc);

        System.out.println("Enter the details of the student2:");
        Student st2 = new Student();
        st2.getdata(sc);

        System.out.println("Enter the details of the student3:");
        Student st3 = new Student();
        st3.getdata(sc);

        System.out.println("Details of the student1:");
        st1.display();

        System.out.println("Details of the student2:");
        st2.display();

        System.out.println("Details of the student3:");
        st3.display();
        sc.close();
    }
}