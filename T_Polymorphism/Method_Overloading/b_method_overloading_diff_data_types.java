package T_Polymorphism.Method_Overloading;

class Nums {
    int sum(int a, int b) {
        return (a + b);
    }

    double sum(double a, double b) {
        return (a + b);
    }
}

public class b_method_overloading_diff_data_types {
    public static void main(String[] args) {
        Nums obj = new Nums();
        int sum1 = obj.sum(12, 34);
        double sum2 = obj.sum(12.34, 34.12);
        System.out.println("The sum of two integers = " + sum1);
        System.out.println("The sum of two double numbers = " + sum2);
    }
}
