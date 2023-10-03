package G_Literals;

public class b_character_escape_sequences {
    public static void main(String[] args) {
        // System.out.println("Hello Java, "We are from Nepal "."); // error
        System.out.println("Hello Java, \"We are from Nepal\".");
        System.out.println("Hello Java, \tWe are from Nepal.");
        System.out.println("Hello Java, \nWe are from Nepal.");
        System.out.println("Hello Java,\bWe are from Nepal.");
        System.out.println("Hello Java, \rWe are from Nepal.");
        System.out.println("\\ this is backslash used in character escape operation.");
    }
}