package CustomArrayList;

public class Main {

    public static void main(String[] args) {
        String[] arr = new String[] {"q", "1", "3", "2"};
        Realezation<String> realezation = new Realezation<>();
        arr = realezation.add(arr, "a");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //добавление элемента
        }
        System.out.println("- добавление элемента с помощью add");
        System.out.println(realezation.get(arr, 3) + " - получаем элемент с помощью get"); //получаем элемент
        arr = realezation.remove(arr, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" - удаляем элемент с помощью remove");
    }

}