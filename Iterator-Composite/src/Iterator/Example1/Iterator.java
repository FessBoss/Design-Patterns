package Iterator.Example1;

public interface Iterator {
    // hasNext() возвращает флаг, который указывает, остались ли в коллекции элементы для перебора
    boolean hashNext();
    // метод next() возвращает следующий элемент
    Object next();
}
