package Composite.Example1;

public class UnknownCar implements Car {
    @Override
    public void draw(String color) {
        System.out.println("UnknownCar color: " + color);
    }
}
