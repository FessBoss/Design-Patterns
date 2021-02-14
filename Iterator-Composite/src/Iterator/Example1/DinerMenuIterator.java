package Iterator.Example1;

// Реализуем интерфейс итератор
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    // В переменной position хранится текущая позиция перебора в массиве.
    int position = 0;

    // Конструктор получает массив объектов, для перебора которых создается итератор.
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    // Метод next() возвращает следующий элемент массива и увеличивает текущую позицию.
    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    // Метод hasNext() возвращает true, елси в массиве еще остались элементы для перебора.
    @Override
    public boolean hashNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

}
