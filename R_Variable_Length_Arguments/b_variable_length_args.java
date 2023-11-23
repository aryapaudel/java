package R_Variable_Length_Arguments;

public class b_variable_length_args {
    public int sumNum(int... args) {
        System.out.println("\nNumber of arguments " + args.length);
        int sum = 0;
        for (int x : args) {
            sum += x; // sum = sum +x;
        }
        return sum;
    }

    public static void main(String[] args) {
        b_variable_length_args obj = new b_variable_length_args();

        int sum2 = obj.sumNum(23, 45);
        System.out.println("Sum of two numbers = " + sum2);
        int sum3 = obj.sumNum(23, 45, 45);
        System.out.println("Sum of three numbers = " + sum3);
        int sum4 = obj.sumNum(23, 45, 23, 34);
        System.out.println("Sum of four numbers = " + sum4);
        int sum5 = obj.sumNum(23, 45, 78, 9, 67);
        System.out.println("Sum of five numbers = " + sum5);
    }
}
