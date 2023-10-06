package N_Garbage_Collection;

public class a_garbage_collection {
    public static void main(String[] args) {
        // uncomment before running the following code
        /* a_garbage_collection obj1 = new a_garbage_collection();
        a_garbage_collection obj2 = new a_garbage_collection();
        obj1 = null;
        obj2 = null; */
        System.gc();
    }

    public void finalize() {
        System.out.println("Garbage collected.");
    }

}
