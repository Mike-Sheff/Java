package Netologia.task_1_3;

import java.util.Scanner;

public class task_1_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = "";
        double result = 0;
        int value1;
        int value2;
        String value;

        System.out.println("Задача: Калькулятор.");

        while (true) {
            //Попросим пользователя ввести данные
            System.out.println("");
            System.out.println("Введите два числа и тип операции (+,-,*,/)");

            //Считаем введеные значения и сохраним в переменные
            while (true) {
                System.out.print("Введите первое число: ");
                value = scanner.nextLine();
                if (value.equals(checkNumbers(value, "[+-]?\\d+"))) {
                    break;
                } else {
                    System.out.println("Введено не правильное число!");
                }
            }

            value1 = Integer.parseInt(value);

            do {
                System.out.print("Введите второе число: ");
                value = scanner.nextLine();
                if (value.equals(checkNumbers(value, "[+-]?\\d+"))) {
                    break;
                } else {
                    System.out.println("Введено не правильное число!");
                }
            } while (true);

            value2 = Integer.parseInt(value);

            System.out.print("Введите операцию над числами: ");
            operation = scanner.nextLine();

            //Расчет результата
            switch (operation) {
                case "+":
                    result = value1 + value2;
                    outputResult(operation, result);
                    break;
                case "-":
                    result = value1 - value2;
                    outputResult(operation, result);
                    break;
                case "*":
                    result = value1 * value2;
                    outputResult(operation, result);
                    break;
                case "/":
                    if (value2 == 0) {
                        System.out.println("Делить на ноль нельзя!");
                    } else {
                        result = (double) value1 / value2;
                        outputResult(operation, result);
                    }
                    break;
                default:
                    System.out.println("Не правильный символ!");
                    break;
            }

            System.out.print("Хотите продолжить? (для завершения нажмите кнопку 'N' или Enter)");
            operation = scanner.nextLine();

            //Выходим из цикла
            if (("n".equals(operation)) || ("N".equals(operation)) ||
                    ("т".equals(operation)) || ("Т".equals(operation))) {
                break;
            }
        }

        System.out.println("");
        System.out.println("До свидания!");
    }

    public static void outputResult(String operation, double result) {
        System.out.printf("Результат операции \" %s \" = %.2f ", operation, result);
        System.out.println();
    }

    public static String checkNumbers(String tempValue, String regexp) {
        if (tempValue.matches(regexp)) {
            return tempValue;
        } else {
            return "";
        }
    }
}