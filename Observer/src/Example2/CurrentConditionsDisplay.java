package Example2;

import java.util.Observable;
import java.util.Observer;

// Реализуем интерфейс Observer из пакеты java.util
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    // Объект элемента текущего состояния добавляется в качестве наблюдателя
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    // Обновленный метод update() получает Observable и необязательные данные.
    @Override
    public void update(Observable obs, Object arg) {
        // В update() мы сначала проверяем, что субъект относится к типу WeatherData,
        // затем использует его get-методы для получения температуры и влажности,
        // после чего вызывает display().
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
