package H_Variables_Constants;

class College {
    final int clzId = 27;

    void display() {
        System.out.println("The college id = " + clzId);
    }
}

public class b_constant_final {
    public static void main(String[] args) {
        College obj = new College();
        obj.display();
    }
}
