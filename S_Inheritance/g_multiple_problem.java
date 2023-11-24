package S_Inheritance;

class Dad{
    public void helloSon(){
        System.out.println("Hello son, love you from your dad.");
    }
}
class Mom{
    public void hiSon(){
        System.out.println("Hi son, love you from your mom.");
    }
}
/* class Son extends Dad, Mom{
    public void greetingsParents(){
        System.out.println("Greetings Dad and mom, I love both of you.");
    }

    Note : Multiple inheritance is not possible with Java Class, can be 
    solve with Java Interface.
} */

public class g_multiple_problem {
    public static void main(String[] args) {
        /* Son s1 = new Son();
        s1.helloSon();
        s1.hiSon(); */
    }
}
