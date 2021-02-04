package Example1;

public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
