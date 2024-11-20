package example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HowToSort sorts = new HowToSort(0);
        String[] arrStr = scan.nextLine().split(" ");
        ArrayList array = new ArrayList();
        for (int i = 0; i < arrStr.length; i++) {
            array.add(Integer.parseInt(arrStr[i]));
        }
        List arr = sorts.bubbleSort(array);
        for (int i = 0; i < arr.size() ; i++) {
            System.out.print(sorts.my_get(arr, i) + " ");
        }

    }
}