package Example1;

public class Tea extends CaffeineBeverage {
    // Класс Tea должен определить brew() и addCondiments() - два абстрактных метода из Beverage.
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
