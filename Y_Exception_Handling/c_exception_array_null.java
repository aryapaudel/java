package Y_Exception_Handling;

public class c_exception_array_null {
    public static void main(String[] args) {
        int num[] = null;
        try {
            System.out.println(num[6]);
        }  
        // catch (ArithmeticException e) {
        //     System.out.println("Arithmetic Exception handled.");
        // } 
        // catch (NullPointerException e) {
        //     System.out.println("NullPointerException handled.");
        // }
        catch (Exception e) {
            System.out.println("Exception handled.");
        }
    }
}
