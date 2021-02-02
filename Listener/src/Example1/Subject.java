package Example1;

public interface Subject {
    // Оба метода получают в аргументе реализацию Observer (регистрируемый или исключаемый наблюдатель).
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    // Этот метод вызывается для оповещения наблюдателей об изменении состоянии субъекта
    void notifyObservers();
}
