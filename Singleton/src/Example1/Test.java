package Example1;

public class Test {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton.equals(singleton1)); // true
    }
}
