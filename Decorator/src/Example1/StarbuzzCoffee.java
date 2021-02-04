package Example1;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Mocha(new Mocha(new Whip(new DarkRoast())));
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Soy(new Mocha(new Whip(new HouseBlend())));
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
