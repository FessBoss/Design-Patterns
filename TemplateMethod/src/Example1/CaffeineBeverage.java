package Example1;

// CaffeineBeverage - абстрактный класс, как и в исходной архитектуре.
public abstract class CaffeineBeverage {
    // Теперь для приготовления чая и кофе будет использоваться один метод - prepareRecipe().
    // Этот метод объявлен с ключевым словом final, потому что субклассы не должны переопределять этот метод!
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Т.к. классы Coffee и Tea реализуют эти методы по-разному, мы объявляем их абстрактными.
    // Субклассы должны предоставить их реализацию!
    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
