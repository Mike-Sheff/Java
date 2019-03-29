package Netologia.task_1_2;

import java.util.Scanner;

public class task_1_2_3 {

    public static final String[] MASS_USER = {"программист", "дизайнер", "тестировщик"};

    public static final int TIME_WORK = 40;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] masTimeUser = {0, 0, 0};
        int user = 0;
        int tempTime = 0;

        System.out.println("Задача: Планирование задач.");

        int counteruser = 0;

        while (counteruser < MASS_USER.length) {
            System.out.println("");
            System.out.println("Выберите участника: ");

            for (int i = 0; i < MASS_USER.length; i++) {
                if (masTimeUser[i] != TIME_WORK) {
                    System.out.println(i + " - " + MASS_USER[i]);
                } else {
                    continue;
                }
            }

            System.out.print("Ваш выбор: ");
            user = checkNumbers(scanner.nextLine(), 3);

            if (TIME_WORK == masTimeUser[user]) {
                continue;
            } else {
                while (TIME_WORK > masTimeUser[user]) {
                    System.out.println("");

                    System.out.print("Введите название задачи: ");
                    String work = scanner.nextLine();
                    if ("end".equals(work)) {
                        break;
                    }

                    System.out.print("Количество часов на задачу: ");
                    tempTime = checkNumbers(scanner.nextLine(), 41);

                    if (tempTime + masTimeUser[user] <= TIME_WORK) {
                        masTimeUser[user] += tempTime;
                        System.out.println("У участника " + MASS_USER[user] + " осталось времени  для работы: " + (TIME_WORK - masTimeUser[user]));
                    } else {
                        System.out.println("Задача слишком большая, нужно выбрать другую");
                        System.out.println("");
                    }
                }
                counteruser++;
            }
        }

        System.out.println();
        System.out.print("Все участники озадачины на эту неделю!");
        System.out.println();
        System.out.print("До свидания!");
    }

    public static int checkNumbers(String tempValue, int maxValue) {
        if ((tempValue.matches("[+]?\\d+")) && ((Integer.parseInt(tempValue) >= 0) && (Integer.parseInt(tempValue) < maxValue))) {

            return Integer.parseInt(tempValue);
        } else {
            System.out.println("Вы ввели строку или отрицательное число! Будет выбран участник под номером 0!");
            return 0;
        }
    }
}
