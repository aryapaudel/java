package R_Variable_Length_Arguments;

public class a_example_without_using_variable_lengh_args {
    public int sumNum(int a, int b) {
        return a + b;
    }

    public int sumNum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        a_example_without_using_variable_lengh_args obj = new a_example_without_using_variable_lengh_args();
        System.out.println("Sum of two arguments=" + obj.sumNum(23, 45));
        System.out.println("Sum of three arguments=" + obj.sumNum(23, 45, 99));
    }
}
