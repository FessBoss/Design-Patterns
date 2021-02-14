package Iterator.Example1;

public class Waitress {
    DinerMenu dinerMenu;

    public Waitress(DinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nLUNCH");
        printMenu(dinerIterator);
    }

    // Перегруженный метод printMenu() использует Iterator для перебора и вывода элементов меню.
    private void printMenu(Iterator iterator) {
        // Проверяем, остались ли еще элементы.
        while (iterator.hashNext()) {
            // Получаем следующий элемент
            MenuItem menuItem = (MenuItem) iterator.next();
            // Выводим название, цену и описание текущего элемента
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
