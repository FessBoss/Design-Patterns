package Example1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        /*
            Вызов метода PerformQuack(), унаследованного классом MallardDuck;
            метод делегирует выполнение операции по ссылке на QuackBehavior
            (то есть вызывает quack через унаследованнуб переменную quackBehavior)
         */
        mallard.performFly();
        // Затем то же самое происходит с методом performFly(), также унаследованным классом MallardDuck
        mallard.performQuack();

        System.out.println("=====================================================================");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
