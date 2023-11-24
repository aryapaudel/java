package S_Inheritance;

class Vehicle {
    public void accelerate() {
        System.out.println("I am moving towards my destination.");
    }
}

class Aeroplane extends Vehicle {
    public void fly() {
        System.out.println("I am flying.");
    }
}

class Motorbike extends Vehicle {
    public void run() {
        System.out.println("I am running on road.");
    }
}

public class c_hierarchical {
    public static void main(String[] args) {
        Aeroplane Boeing474 = new Aeroplane();
        Boeing474.accelerate();
        Boeing474.fly();
        // Boeing474.run(); unaccessible
        Motorbike Ducati = new Motorbike();
        Ducati.accelerate();
        Ducati.run();
        // Ducati.fly(); unaccessible
    }
}
