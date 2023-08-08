import java.util.Scanner;

public class d_add_user_input_nums {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        sum = a+b;
        System.out.println("The sum = "+sum);
        sc.close();
    }
}
