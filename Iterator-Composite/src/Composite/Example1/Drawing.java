package Composite.Example1;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Car {
    private List<Car> cars = new ArrayList<>();

    @Override
    public void draw(String color) {
        for (Car car : cars) {
            car.draw(color);
        }
    }

    public void add(Car car) {
        this.cars.add(car);
    }

    public void clear() {
        System.out.println();
        this.cars.clear();
    }
}
