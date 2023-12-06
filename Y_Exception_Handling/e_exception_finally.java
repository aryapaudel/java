package Y_Exception_Handling;

public class e_exception_finally {
    public static void main(String[] args) {
        int a = 12, b = 2, result;
        try {
            result = a / b;
            System.out.println("The result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("We cannot divide a number by zero " + e);
        } finally {
            System.out.println("Be careful when you divide a number by zero");
        }
    }
}
