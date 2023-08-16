package C_Control_Statement.a_if_block;

import java.util.Scanner;

public class e_char_male_female {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m for male and f for female:");
        char a = sc.next().charAt(0);
        if (a == 'm') {
            System.out.println("Hello Mister");
        } else {
            System.out.println("Hello Mistress");
        }
        sc.close();
    }
}
