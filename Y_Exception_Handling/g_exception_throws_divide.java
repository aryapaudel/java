package Y_Exception_Handling;

public class g_exception_throws_divide {
    public int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        g_exception_throws_divide obj = new g_exception_throws_divide();
        try {
            System.out.println("The result = " + obj.divide(12, 0));
        } catch (ArithmeticException e) {
            System.out.println("We cannot divide a number by zero");
        }
    }
}
