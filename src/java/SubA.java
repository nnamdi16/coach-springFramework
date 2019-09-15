package java;

//A static factory method that returns instance of its own class
public class SubA {
    private static final SubA obj = new SubA();
    private SubA () {
        System.out.println("Private constructor");
    }

    //factory method that returns instance of its own class
    public static SubA getA() {
        System.out.println("factory method");
        return obj;
    }

    public void msg() {
        System.out.println("Hello User");
    }
}
