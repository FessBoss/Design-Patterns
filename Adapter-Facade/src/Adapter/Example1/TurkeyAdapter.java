package Adapter;

// Прежде всего необходимо реализовать интерфейс того типа, на который рассчитан ваш клиент
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    // Затем следует получить ссылку на адаптируемый объект; обычно это делается в конструкторе
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // Адаптер должен реализовывать все методы интерфейса. Преобразование quack() между классами выполняется просто -
    // реализация вызывает gobble().
    @Override
    public void quack() {
        turkey.gobble();
    }

    // Хотя метод fly() входит в оба интерфейса, индюшка не умеет летать на дальние расстояния.
    // Чтобы установить соответствие между этими методами, мы вызываем метод fly() класса Turkey пять раз.
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
