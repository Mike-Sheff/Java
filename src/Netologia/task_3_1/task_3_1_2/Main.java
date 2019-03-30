package Netologia.task_3_1.task_3_1_2;

import java.util.Arrays;
import java.util.Random;
import static Netologia.task_3_1.task_3_1_2.MergeSort.mergeSort;

public class Main {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        Product[] products = new Product[SIZE];

        Random random = new Random();

        System.out.println("Задача: Сортировка массива вручную.");
        System.out.println("");

        for (int i = 0; i < SIZE; i++) {
            products[i] = new Product("Продукт № " + (i+1), random.nextInt(1001),
                                "описание  продукта № " + (random.nextInt(SIZE)+1));
        }

        System.out.println("Массив продуктов:");
        System.out.println(Arrays.toString(products));
        System.out.println();

        Mysort(products);

        System.out.println("");
        System.out.println("До свидания!");
    }

    public static void Mysort(Product[] products){
        int[] price = new int[SIZE];

        for (int i = 0; i < products.length; i++) {
            price[i] = products[i].getPrice();
        }

        System.out.println("Массив цен на продукты: " + Arrays.toString(price));
        mergeSort(price, price.length);
        System.out.println("Отсортированный массив цен: " + Arrays.toString(price));

        Product[] productsSort = new Product[SIZE];

        int k = 0;
        for (int i = 0; i < price.length; i++) {
            if (i > 0) {
                if (price[i] == price[i - 1]) {
                    continue;
                } else {
                    for (int j = 0; j < products.length; j++) {
                        if (products[j].getPrice() == price[i]){
                           productsSort[k] = products[j];
                           k++;
                        }

                    }
                }
            }else {
                for (int j = 0; j < products.length; j++) {
                    if (products[j].getPrice() == price[i]) {
                        productsSort[k] = products[j];
                        k++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Отсортированный массив продуктов:");
        System.out.println(Arrays.toString(productsSort));
    }
}
