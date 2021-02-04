package Example2;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basic = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basic.getDescription());
        System.out.println("Price: " + basic.getCost());
    }
}
