package Example2;

// Класс команды должен реализовывать интерфейс Command
public class LightOnCommand implements Command {
    Light light;

    // В переменной light конструктору передается конкретный объект, которым будет управлять команда.
    // При вызове execute получателем запроса будет объект light
    public LightOnCommand(Light light) {
        this.light = light;
    }

    // Метод execute вызывает метод on() объекта-получателя (то есть осветительной системы)
    @Override
    public void execute() {
        light.on();
    }
}
