package Netologia.task_3_1.task_3_1_2_2;

import java.util.Arrays;
import java.util.Random;

import static Netologia.task_3_1.task_3_1_2_2.BubbleSorting.bubbleSorting;
import static Netologia.task_3_1.task_3_1_2_2.MergeSort.mergeSort;
import static Netologia.task_3_1.task_3_1_2_2.QuickSort.quickSort;
import static Netologia.task_3_1.task_3_1_2_2.InsertionSort.insertionSort;
import static Netologia.task_3_1.task_3_1_2_2.SelectionSort.selectionSort;
import static Netologia.task_3_1.task_3_1_2_2.ShellSorting.shellSorting;

public class Main {
    static long start;
    static long finish;

    public static void main(String[] args) {
        int[] actual;

        actual = fillArray();

        // Merge Sort
        printDisplay("Начальный массив:", actual);
        start = System.nanoTime();
        mergeSort(actual, actual.length);
        finish = System.nanoTime();
        printDisplay("\nМассив после сортировки:", actual);
        System.out.format("\nВремя выполнения Merge сортировки: %d \n" , finish - start);

        actual = fillArray();

        // Quich Sort
        printDisplay("Начальный массив:", actual);
        start = System.nanoTime();
        quickSort(actual, 0, actual.length - 1);
        finish = System.nanoTime();
        printDisplay("\nМассив после сортировки:", actual);
        System.out.format("\nВремя выполнения Quick сортировки: %d \n" , finish - start);

        actual = fillArray();

        //  Insertion Sort
        printDisplay("Начальный массив:", actual);
        start = System.nanoTime();
        insertionSort(actual);
        finish = System.nanoTime();
        printDisplay("\nМассив после сортировки:", actual);
        System.out.format("\nВремя выполнения Insertion сортировки: %d \n" , finish - start);
        actual = fillArray();

        //  Selection Sort
        printDisplay("Начальный массив:", actual);
        start = System.nanoTime();
        selectionSort(actual);
        finish = System.nanoTime();
        printDisplay("\nМассив после сортировки:", actual);
        System.out.format("\nВремя выполнения Selection сортировки: %d \n" , finish - start);

        actual = fillArray();

        //  Shell Sort
        printDisplay("Начальный массив:", actual);
        start = System.nanoTime();
        shellSorting(actual);
        finish = System.nanoTime();
        printDisplay("\nМассив после сортировки:", actual);
        System.out.format("\nВремя выполнения Shell сортировки: %d \n" , finish - start);

        actual = fillArray();

        //  Bubble Sort
        printDisplay("Начальный массив:", actual);
        start = System.nanoTime();
        bubbleSorting(actual);
        finish = System.nanoTime();
        printDisplay("\nМассив после сортировки:", actual);
        System.out.format("\nВремя выполнения Bubble сортировки: %d \n" , finish - start);

        System.out.println("-------------------------");

        Product[] product = new Product[5];
        Random random = new Random();

        for (int i = 0; i < product.length; i++) {
            String name = "Product #" + (random.nextInt(20 - 10 +1) + 10);
            int price = random.nextInt(10) * 10;
            String other = "Other # " + (product.length - i);
            product[i] = new Product(name, price, other);
        }

        System.out.println("сортировка по price");
        System.out.println(Arrays.toString(product));
        Arrays.sort(product);
        System.out.println(Arrays.toString(product));

        System.out.println("-------------------------");
        System.out.println("сортировка по name");
        System.out.println(Arrays.toString(product));
        Arrays.sort(product, new NameProductComparator());
        System.out.println(Arrays.toString(product));

        System.out.println("-------------------------");
        System.out.println("сортировка по other");
        System.out.println(Arrays.toString(product));
        Arrays.sort(product, new OtherProductComparator());
        System.out.println(Arrays.toString(product));

    }

    public static void printDisplay(String text, int[] a){
        System.out.println(text);
        for (int i = 0; i < a.length; i++) {
            System.out.format("%2d", a[i]);
        }
    }

    public static int[] fillArray(){
        System.out.println();
        int[] a = new int[]{5, 1, 6, 2, 3, 4, 9, 7, 8};
        System.out.println();

        return a;
    }
}
