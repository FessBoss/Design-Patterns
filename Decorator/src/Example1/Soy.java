package Example1;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return super.cost() + .15;
    }
}
