package Example1;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return super.cost() + 0.20;
    }
}
