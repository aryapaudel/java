package C_Control_Statement.a_if_block;

import java.util.Scanner;

public class f_if_else_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check +ve, -ve or zero:");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The number " + num + " is +ve.");
        } else if (num < 0) {
            System.out.println("The number " + num + " is -ve.");
        } else {
            System.out.println("The number zero.");
        }
        sc.close();
    }
}
