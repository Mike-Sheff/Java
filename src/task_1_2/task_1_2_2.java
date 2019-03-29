package Netologia.task_1_2;

import java.util.Scanner;
import java.util.Calendar;

public class task_1_2_2 {
    public static String[] mounthName = {"Январь", "Февраль", "Март",
            "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь",
            "Октябрь", "Ноябрь", "Декабрь"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dayWeek = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};

        int inputYear;
        int inputMounth;
        int daysOfMounth;
        int CountDaysOfMounth;
        int counterOfWeek;

        Calendar calendar = Calendar.getInstance();

        System.out.println("Задача: Календарь.");
        System.out.println("");

        System.out.print("Введите год: ");
        inputYear = checkNumbers(scanner.nextLine());
        inputYear = (((inputYear > 999) && (inputYear < 10000)) ? inputYear : 2019);

        System.out.println("");

        System.out.print("Введите месяц: ");
        inputMounth = checkNumbers(scanner.nextLine());
        inputMounth = ((inputMounth > 12) ? 0 : inputMounth - 1);

        System.out.println();

        calendar.set(inputYear, inputMounth, 1);

        printWeekYear(calendar);

        System.out.println();

        for (String printweek : dayWeek) {
            System.out.print(printweek);
            System.out.print(" ");
        }

        CountDaysOfMounth = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
        daysOfMounth = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println();

        // Заполняем пустые значенеия перед 1 числом месяца
        for (int i = 1; i < (daysOfMounth - 1); i++) {
            System.out.print(" _ ");
        }

        counterOfWeek = (daysOfMounth - 1);
        for (int j = 1; j <= CountDaysOfMounth; j++) {
            if (j < 10) {
                System.out.print(" " + j + " ");
            } else {
                System.out.print(j + " ");
            }

            if (counterOfWeek == 7) {
                System.out.println();
                counterOfWeek = 1;
            } else {
                counterOfWeek++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.print("До свидания!");
    }

    public static void printWeekYear(Calendar cal) {
        for (int i = 0; i < 12; i++) {
            if (i == cal.get(Calendar.MONTH)) {
                System.out.println("Текущий месяц: " + mounthName[i]);
            } else {
                continue;
            }
        }
        System.out.println("Текущий год: " + cal.get(Calendar.YEAR));
    }

    // Проверка на правильность введения положительного числа
    public static int checkNumbers(String tempValue) {
        if (tempValue.matches("[+]?\\d+")) {
            return Integer.parseInt(tempValue);
        } else {
            System.out.println("Вы ввели строку или отрицательное число! Значение будет по умолчанию!");
            return 0;
        }
    }
}

