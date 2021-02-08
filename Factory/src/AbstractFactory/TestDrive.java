package AbstractFactory;

public class TestDrive {
    public static void main(String[] args) {
        CarsFactory factory = new ToyotaFactory();
        factory.createSedan();
    }
}
