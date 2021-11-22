package homeWork;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/** 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 *  2. Написать метод, который преобразует массив в ArrayList;
 */

public class AppTask1AndTask2 {
    private Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7};
    private String [] strNumbers = new String[]{"one", "two", "three", "four", "five", "six", "seven"};
    private List<Integer> numbersList = new ArrayList<>();
    private List<String> strNumbersList = new ArrayList<>();

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        AppTask1AndTask2 app = new AppTask1AndTask2();
        chengItem(app.numbers, 1, 4);
        printArray(app.numbers);
        chengItem(app.strNumbers, 1, 4);
        printArray(app.strNumbers);
    }
    private static <T> void chengItem(T [] array, int indexFirstItem, int indexSecondItem) {
        if (indexFirstItem < array.length && indexSecondItem < array.length) {
            final T temp = array[indexFirstItem];
            array[indexFirstItem] = array[indexSecondItem];
            array[indexSecondItem] = temp;
        }
        else {
            System.out.println("Введен индекс несуществующего элемента массива!");
        }
    }
    private static <T> void printArray(T [] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }
  ///////////////////////////////  Задача 2  /////////////////////////////////////////////
    private static void task2() {
        AppTask1AndTask2 app = new AppTask1AndTask2();
        transformArrayToList(app.numbers, app.numbersList);
        System.out.println(app.numbersList);
        transformArrayToList(app.strNumbers, app.strNumbersList);
        System.out.println(app.strNumbersList);
    }
    private static <T> void transformArrayToList(T [] arr, List<T> list) {
        for (T item : arr) {
            list.add(item);
        }
    }
}
