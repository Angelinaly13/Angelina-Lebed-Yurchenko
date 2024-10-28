package CustomArrayList;
import java.util.Scanner;

public class Main {
    /**
     * Проверяем работоспособность add, remove и get
     * Показываю как работает каждый из методов:
     * main- основное тело программы
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrStr = scan.nextLine().split(" ");
        MyArrayList<String> arr = new MyArrayList<>(arrStr.length); // в первой строчке введите изначальный массив
        String forAdd = scan.nextLine(); // во второй строчке элемент который хотите добавить
        int index = scan.nextInt(); // в третьей индекс элемента который хотите удалить
        for (int i = 0; i < arrStr.length; i++) {
            arr.add(arrStr[i]);
        }
        System.out.print("Было до добавления: ");
        for (int i = 0; i < arr.size; i++) {
            System.out.print(arr.get(i) + " "); // !!! здесь мы используем get для получения эдемента по индексу в скобках
        }
        System.out.println("");
        arr.add(forAdd); // !!! здесь мы используем add
        System.out.print("Стало после добавления, перед удалением: ");
        for (int i = 0; i < arr.size; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("");
        arr.remove(index); // !!! здесь мы с помощью remove удаляем index-овый элемент
        System.out.print("Стало после удаления: ");
        for (int i = 0; i < arr.size; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

}