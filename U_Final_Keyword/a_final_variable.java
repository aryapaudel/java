package U_Final_Keyword;

public class a_final_variable {
 
    final int a = 45;
    void display() {
        System.out.println("The value of a = " + a);
    }

    public static void main(String[] args) {
        a_final_variable obj = new a_final_variable();
        obj.display();
    }
}
