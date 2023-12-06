package Y_Exception_Handling;

public class f_exception_throw_voter {
    public void checkVoterAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("You cannot cast your vote.");
        } else {
            System.out.println("You are eligible to cast your vote.");
        }
    }

    public static void main(String[] args) {
        f_exception_throw_voter v1 = new f_exception_throw_voter();
        v1.checkVoterAge(12);
    }
}
