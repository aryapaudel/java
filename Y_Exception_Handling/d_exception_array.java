package Y_Exception_Handling;

public class d_exception_array {
    public static void main(String[] args) {
        int myNum[] = { 12, 34, 56, 78, 90 };
        try {
            for (int i = 0; i <= myNum.length; i++) {
                System.out.println(myNum[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }
}
