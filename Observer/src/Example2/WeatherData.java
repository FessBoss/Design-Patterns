package Example2;

import java.util.Observable;

// Супер класс берет на себя все управление наблюдателями,
// поэтому мы удаляем код регистрации, добавления и оповещения из Example1
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    // Теперь структура для хранения наблюдателей не нужна
    public void measurementsChanged() {
        // Перед вызовом notifyObservers() необходимо вызвать setChanged();
        setChanged();
        // Объект данных не передается - это означает, что мы используем модель ЗАПРОСА ДАННЫХ
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // Эти методы будут использоваться наблюдателями для получения состояния объекта WeatherData
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
