package Example1;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    // Добавляем контейнер ArrayList для хранения наблюдателей и создаем его в конструкторе.
    public WeatherData() {
        observers = new ArrayList<>();
    }

    // Новые наблюдатели просто добавляются в конец списка.
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // Если наблюдатель хочет отменить регистрацию, мы просто удаляем его из списка.
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        observers.remove(i);
    }

    // Оповещение наблюдателей об изменении состоится через метод update(), реализуемый всеми наблюдателями.
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    // Оповещение наблюдателей о появлении новых данных
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // Другие методы WeatherData
}
