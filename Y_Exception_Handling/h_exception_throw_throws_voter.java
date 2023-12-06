package Y_Exception_Handling;

public class h_exception_throw_throws_voter {
    public void checkVoterAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("You cannot cast your vote.");
        } else {
            System.out.println("You are eligible to cast your vote.");
        }
    }

    public static void main(String[] args) {
        h_exception_throw_throws_voter v1 = new h_exception_throw_throws_voter();
        v1.checkVoterAge(12);
    }
}
