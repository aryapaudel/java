package G_Literals;

public class a_hex_octal_binary {
    public static void main(String[] args) {
        int decimalNum = 110; // no prefix -- decimal
        int hexNum = 0x6E; // 0x -- hex
        int octalNum = 0156; // 0 -- octal
        int octalNum2 = 0100; // 64
        int binaryNum = 0b1101110; // 0b -- binary
        
        System.out.println(decimalNum);
        System.out.println(hexNum);
        System.out.println(octalNum);
        System.out.println(octalNum2);
        System.out.println(binaryNum);
    }
}
