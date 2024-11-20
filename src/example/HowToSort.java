package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowToSort {
    Integer limit_for_length;

    public HowToSort(Integer limit_for_length) {
        this.limit_for_length = limit_for_length;
    }

    protected void CheckLength(List<Integer> arr) {
        if (arr.size() > limit_for_length) {
            throw new RuntimeException("Size of list bigger than max");
        }
    }

    public List<Integer> mergeSort(List arr) {
        limit_for_length = 100000;
        ArrayList rez = new ArrayList<>();
        Collections.sort(arr);
        return arr;
    }

    public List<Integer> bubbleSort(List<Integer> arr) {
        limit_for_length = 1000;
        int s = -1;
        int[] arr1 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arr1[i] = arr.get(i);
            s++;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        ArrayList rez = new ArrayList<>();
        for (int i = 0; i <= s; i++) {
            rez.add(arr1[i]);
        }
        return rez;
    }

    public void my_add(List arr, int element) {
        arr.add(element);
    }

    public int my_get(List<Integer> arr, int index) {
        return arr.get(index);
    }

}
