package CustomArrayList;

/**
 * Методы используемые в моем ArrayList
 * @param <T> мой тип данных инт+стр
 */
public interface methods<T> {
    public T[] add(T newElem); //добавление метода
    public T get(int index); //получаем элемент по индексу
    public T[] remove(int index); //удаляем элемент по индексу

}