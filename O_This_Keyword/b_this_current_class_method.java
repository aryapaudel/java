// 2. use of this keyword to invoke current class method
package O_This_Keyword;

class Teacher {
    void hi() {
        System.out.println("Hi Sanothimi");
    }

    void hello() {
        System.out.println("Hello Sanothimi");
        this.hi(); // similar to hi();
    }
}

public class b_this_current_class_method {
    public static void main(String[] args) {
        Teacher s1 = new Teacher();
        s1.hello();
    }
}
