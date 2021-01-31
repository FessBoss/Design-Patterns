package Example1;

public class MallardDuck extends Duck {

    // MallardDuck наследует переменные quackBehavior и flyBehavior (поведение) от класса Duck.
    public MallardDuck() {
        /*
            MallardDuck использует класс Quack для выполнения дествия,
            так что при вызове performQuack() ответственность за выполнение возлагается на объект Quack.
        */
        quackBehavior = new Quack();
        // В качестве реализации FlyBehavior используется тип FlyWithWings
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
