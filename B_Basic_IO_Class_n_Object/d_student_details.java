package B_Basic_IO_Class_n_Object;

class Stud {
    int roll, age;
    String name, address;

    void inputData(int r, int a, String n, String ad) {
        roll = r;
        age = a;
        name = n;
        address = ad;
    }

    void displayData() {
        System.out.println("Roll = " + roll);
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
    }
}

public class d_student_details {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.inputData(12, 29, "Ram", "Ghopteodar");
        s1.displayData();
    }
}
