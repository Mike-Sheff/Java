package Netologia.task_1_2;

import java.util.Scanner;

public class task_1_2_1 {
    public static int maxTimeTask = 0; // время продолжительной задачи
    public static int minTimeTask = 0; // время короткой задачи
    public static int allTimeTasks = 0; // общее время задач
    public static int currentTimeTask = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputName = "";
        int inputdays = 0;
        int inputhours = 0;
        int inputminutes = 0;
        String input = "";

        System.out.println("Задача: Перевод времени.");
        System.out.println("");

        do {
            System.out.print("Введите название задачи: ");
            inputName = scanner.nextLine();
            System.out.print("Сколько дней потребуется на выполнение? ");
            inputdays = checkNumbers(scanner.nextLine());
            System.out.print("Сколько часов? ");
            inputhours = checkNumbers(scanner.nextLine());
            System.out.print("Сколько минут? ");
            inputminutes = checkNumbers(scanner.nextLine());

            currentTimeTask = convertToSeconds(inputdays, inputhours, inputminutes);

            allTimeTasks += currentTimeTask;

            maxTimeTask = valueOperation(currentTimeTask, '>', maxTimeTask);

            minTimeTask = valueOperation(currentTimeTask, '<', minTimeTask);

            System.out.println("Для завершения работы введите 'end' / для продолжения нажмите enter");
            System.out.print("");
            input = scanner.nextLine();

            if ("end".equals(input)) {
                System.out.println("");
                System.out.println("Вы закончили вводить задачи!");
                System.out.println("Всего потребуется: " + allTimeTasks + " секунд");
                System.out.println("Самая продолжительная задача: " + maxTimeTask + " секунд");
                System.out.println("Самая короткая задача: " + minTimeTask + " секунд");

                break;
            }
        } while (true);

        System.out.println("");
        System.out.print("До свидания!");
    }

    // Проверка на правильность введения положительного числа
    public static int checkNumbers(String tempValue) {
        if (tempValue.matches("[+]?\\d+")) {
            return Integer.parseInt(tempValue);
        } else {
            System.out.println("Вы ввели строку или отрицательное число! Значение будет приравнено к нулю!");
            return 0;
        }
    }

    // Операции по поиску максимума и минимума
    public static int valueOperation(int firstValue, char operation, int secondValue) {
        if ((operation == '>') && (firstValue > secondValue)) {
            return firstValue;
        } else if ((operation == '<') && ((firstValue < secondValue) || (secondValue == 0))) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

    // Перевод время работы над задачей в секунды
    public static int convertToSeconds(int days, int hours, int minutes) {
        return ((days * 24 + hours) * 60 + minutes) * 60;
        //int seconds = days*86400 + hours*3600 + minutes*60;
        //return seconds;
    }
}
