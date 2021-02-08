package Example1;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("VeggiePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("VeggiePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("VeggiePizza cut...");
    }

    @Override
    public void box() {
        System.out.println("VeggiePizza box...");
    }
}
