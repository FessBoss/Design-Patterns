package Example1;

// Интерфейс Observer реализуется всеми наблюдателями;
// таким образом, все наблюдатели должны реализовывать метод update()
public interface Observer {
    // Данные состояния,передаваемые наблюдателям при изменении состояния субъекта
    void update(float temp, float humidity, float pressure);
}
