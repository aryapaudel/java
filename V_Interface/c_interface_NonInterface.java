package V_Interface;

interface IFather {
    public void teaching();
}

interface IMother {
    public void feeding();
}

class Home {
    public void sheltering() {
        System.out.println("Home is beautiful.");
    }
}

public class c_interface_NonInterface extends Home implements IFather, IMother {
    public static void main(String[] args) {
        c_interface_NonInterface obj = new c_interface_NonInterface();
        obj.teaching();
        obj.feeding();
        obj.sheltering();
    }

    @Override
    public void teaching() {
        System.out.println("Father is teaching.");
    }

    @Override
    public void feeding() {
        System.out.println("Mother is feeding.");
    }

}
