package CustomArrayList;

import java.lang.reflect.Array;

public class Realezation<A extends Comparable<A>> implements methods<A> {

    /**
     * Добавление элемента только по индексу
     * @param arr массив
     * @param newElem добавляемый элемент
     * @return возвращает массив
     */
    public A[] add(A[] arr, A newElem) {
        final A[] rez = (A[]) Array.newInstance(arr.getClass().getComponentType(), arr.length + 1);
        for (int i = 0; i < arr.length; i++) {
            rez[i] = arr[i];
        }
        rez[arr.length] = newElem;
        return rez;
    }

    /**
     * Получаем элемет массива по индексу
     * @param arr массив
     * @param index индекс получаемого элемента
     * @return возвращает элемент
     */
    public A get(A[] arr, int index) {
        return arr[index];
    }

    /**
     * Удаляем элемент массива по индексу
     * @param arr массив
     * @param index индекс удаляемого элемента
     * @return возвращаем массив
     */
    public A[] remove(A[] arr, int index) {
        A[] rez = (A[]) Array.newInstance(arr.getClass().getComponentType(), arr.length - 1);
        for (int i = 0; i < index; i++) {
            rez[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            rez[i - 1] = arr[i];
        }
        return rez;
    }
}
