import java.util.Scanner;

class Student {
    int roll;
    int age;
    String name;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        roll = sc.nextInt();
        age = sc.nextInt();
        name = sc.next();
        sc.close();
    }

    void display() {
        System.out.println("Roll =" + roll);
        System.out.println("Age =" + age);
        System.out.println("Name =" + name);
    }
}

public class e_user_input_student_details {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        System.out.println("Enter the details of the student1:");
        st1.getdata();
        System.out.println("Enter the details of the student2:");
        st2.getdata();
        System.out.println("Details of the student1:");
        st1.display();
        System.out.println("Details of the student2:");
        st2.display();
    }
}