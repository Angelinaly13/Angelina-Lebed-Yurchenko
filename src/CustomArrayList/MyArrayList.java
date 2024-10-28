package CustomArrayList;

/**
 * в классе MyArrayList содержатся функции add, get и remove
 * @param <T> мой тип данных
 */
public class MyArrayList<T> {
    private Object[] myArray;
    int size;

    public MyArrayList(int size) {
        myArray = new Object[size];
    }

    /**
     * rizeSize увеличивает размер массива если в нем не хватает места для добавления нового элемента
     */
    public void rizeSize() {
        Object[] newArray = new Object[size*2];
        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        myArray = newArray;
    }

    /**
     * с помощью add добавляется элемент в myArr
     * @param element это элемент который мы добавляем в meArray
     */
    public void add(T element) {
        if (size == myArray.length) {
            rizeSize();
        }
        myArray[size] = element;
        size++;
    }

    /**
     * с помощью get мы получаем элемент массива по индексу
     * @param index индекс элемента который мы хотим получить
     * @return возвращаем найденныц элемент массива
     */
    public T get(int index) {
        return (T) myArray[index];
    }

    /**
     * с помощью remove мы удаляем элемент по индексу
     * @param index индекс по которому мы удаляем элемент
     */
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            myArray[i] = myArray[i + 1]; }
        size = size - 1;
    }

}