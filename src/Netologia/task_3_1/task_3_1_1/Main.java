package Netologia.task_3_1.task_3_1_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int productNumber = 0;
        int productCount = 0;
        int sumProducts = 0;
        String[] products = new String[]{"Хлеб", "Молоко", "Яблоки"};
        int[] price = new int[]{100, 200, 300};
        int[] currentPrice = new int[products.length];
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Задача: Покупка товаров.");
        System.out.println("");

        if (price.length == products.length) {
            for (int i = 0; i < products.length; i++) {
                if (i == 0){
                    System.out.printf("%3s | %7s | %5s \n", "№", "Продукты", "Цены");
                }
                System.out.printf("%3d  | %7s  - %5d руб.\n", i+1, products[i], price[i]);
            }

            System.out.println("");
            while(!(("Д".equals(input)) || ("д".equals(input)) || ("L".equals(input)) || ("l".equals(input)))){
                while ((productNumber <= 0) || (productNumber > (products.length))){
                    System.out.print("Введите номер продукта: ");
                    try {
                        productNumber = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Введите целое число");
                        productNumber = 0;
                    }
                }

                while (productCount <= 0) {
                    System.out.print("Введите количество продукта: ");
                    try {
                        productCount = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Введите целое число");
                        productCount = 0;
                    }
                }

                currentPrice[productNumber-1] = productCount;

                System.out.println("");
                productCount = 0;
                productNumber = 0;
                System.out.print("Хотите завершить ввод? (для завершения, последовательно нажмите кнопку \"Д\" и Enter): ");
                input = scanner.next();
            }

            System.out.println("");
            int j = 1;
            for (int i = 0; i < currentPrice.length; i++) {
                if(currentPrice[i] != 0) {
                    System.out.format("#%d. %s - %d шт. по %d = %d руб. \n", j, products[i], currentPrice[i], price[i],
                                        currentPrice[i] * price[i]);
                    sumProducts += currentPrice[i] * price[i];
                    j++;
                }
            }
            System.out.println("Итого к оплате: " + sumProducts + " руб.");
        }

        System.out.println("");
        System.out.println("До свидания!");
    }
}
