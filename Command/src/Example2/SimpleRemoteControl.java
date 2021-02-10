package Example2;

public class SimpleRemoteControl {
    // Всего одна ячейка для хранения команды (и одно управляемое устройство).
    Command slot;

    public SimpleRemoteControl() {}

    // Метод для назначения команды. Может вызываться повторно, если клиент кода захочет изменить поведение кнопки
    public void setCommand(Command command) {
        slot = command;
    }

    // Метод, вызываемой при нажатии кнопки. Мы просто берем объект команды, связанный с текущей ячейкой,
    // и вызываем его метод execute
    public void buttonWasPressed() {
        slot.execute();
    }
}
