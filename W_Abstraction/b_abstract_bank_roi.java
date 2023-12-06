package W_Abstraction;

abstract class Bank {
    abstract int getRateOfInterest();
}

class GIME extends Bank {
    int getRateOfInterest() {
        return 13;
    }
}

class NIC extends Bank {
    int getRateOfInterest() {
        return 17;
    }
}

public class b_abstract_bank_roi {
    public static void main(String[] args) {
        Bank b;
        b = new GIME();
        System.out.println("Interest rate at GIME = " + b.getRateOfInterest() + "%");
        b = new NIC();
        System.out.println("Interest rate at NIC Asia = " + b.getRateOfInterest() + "%");
    }
}
