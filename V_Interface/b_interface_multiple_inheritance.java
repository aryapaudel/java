package V_Interface;

interface ITeacher {
    public void teach();
}

interface IStudent {
    public void learn();
}

class College implements ITeacher, IStudent {

    @Override
    public void teach() {
        System.out.println("Teacher is teaching.");
    }

    @Override
    public void learn() {
        System.out.println("Student is learning.");
    }
}

public class b_interface_multiple_inheritance {
    public static void main(String[] args) {
        College c1 = new College();
        c1.teach();
        c1.learn();
    }
}
