package Example1;

public class Espresso implements Beverage {
    public Espresso() { }

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
