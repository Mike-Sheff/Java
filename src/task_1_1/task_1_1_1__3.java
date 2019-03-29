package Netologia.task_1_1;

import java.util.Scanner;

class task_1_1_1__3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = "";
        int year = 0;

        System.out.println("Для получения числа дней в году");
        System.out.println("Введите год в формате \"yyyy\": ");

        inputValue = scanner.nextLine();
        if (inputValue.matches("[+]?\\d+")) {
            year = Integer.parseInt(inputValue);

            if ((year > 999) && (year < 10000))  // Проверка введенного на формат yyyy
            {
                //if ((year % 400 == 0) || (year % 100 == 0) )
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " году - 366 дней");
                } else {
                    System.out.println(year + " году - 365 дней");
                }
            } else {
                System.out.println("Вы ввели число не соответствующая формату \"yyyy\"!");
            }
        } else {
            System.out.println("Вы ввели строку или отрицательное число!");
        }

        System.out.println("");
        System.out.println("До свидания!");
    }
}
