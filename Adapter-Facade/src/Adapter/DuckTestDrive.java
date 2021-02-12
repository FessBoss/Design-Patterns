package Adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        // Создаем объект Duck
        MallardDuck duck = new MallardDuck();

        // и объект Turkey
        WildTurkey turkey = new WildTurkey();
        // Затем Turkey упаковывается в TurkeyAdapter и начинает выглядеть, как Duck
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says... ");
        testDuck(turkeyAdapter);
    }

    // Метод testDuck() получает объект Duck и вызывает его методы quack() и fly().
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
