package Example1;

// Как и в исходной архитектуре, Tea и Coffee расширяют класс CaffeineBeverage.
public class Coffee extends CaffeineBeverage {
    // Класс Coffee должен определить brew() и addCondiments() - два абстрактных метода из Beverage.
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
