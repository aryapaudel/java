package Y_Exception_Handling;

public class b_exception_solution {
    public static void main(String[] args) {
        int a = 12, b = 0, result;
        try {
            result = a / b;
            System.out.println("The result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("We cannot divide a number by zero " + e);
        }

    }
}
