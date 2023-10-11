// 6. use of this keyword to return current class instance
package O_This_Keyword;

class Person {
    Person hi() {
        return this;
    }

    void hello() {
        System.out.println("Hello Sanothimi");
    }
}

public class h_this_return_current_class_instance {
    public static void main(String[] args) {
        new Person().hi().hello();
    }
}
