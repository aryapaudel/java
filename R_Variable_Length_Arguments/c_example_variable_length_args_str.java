package R_Variable_Length_Arguments;

public class c_example_variable_length_args_str {
    public static void DisplayNames(String... str) {
        System.out.println("\nNumber of arguments =" + str.length);
        System.out.println("The argument values are:");
        for (String s : str) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        DisplayNames("Ram", "Sita", "Hari", "Gita");
        DisplayNames();
        DisplayNames("Danial", "John", "Samual");
        DisplayNames("Fulkumari", "Ritumati");
    }
}
