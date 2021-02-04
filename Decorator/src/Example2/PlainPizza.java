package Example2;

public class PlainPizza implements Pizza {
    public PlainPizza() {
        System.out.println("Create pizza");
    }

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
