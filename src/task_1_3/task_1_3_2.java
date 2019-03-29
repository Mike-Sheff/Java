package Netologia.task_1_3;

import java.util.Scanner;
/*import java.time.format.*;
import java.time.temporal.TemporalAccessor;

public class task_1_3_2 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача: Проверка пользовательского ввода.");
        System.out.println("");

        System.out.println("Введите дату, в формате yyyy-MM-dd-hh-mm-ss: ");
        System.out.println(" ,где yyyy - год");
        System.out.println("      MM - месяц");
        System.out.println("      dd - день (состоящий из двух цифр)");
        System.out.println("      hh - Час в 12-часовом формате от 01 до 12");
        System.out.println("      mm - минуты");
        System.out.println("      ss - секунды");
        String inputDate = scanner.next();

        try {
            boolean result = isValidDateFormat(inputDate);
            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println("Формат даты не корректный, запустите программу еще раз");
        }

        System.out.println("");
        System.out.println("До свидания!");
    }

    static boolean isValidDateFormat(String inputDate) {
        String dateFormat = "yyyy-MM-dd-hh-mm-ss";

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(dateFormat);

        TemporalAccessor parsedDate = dateFormatter.parse(inputDate);

        if (parsedDate != null) {
            return true;
        }

        return false;
  }
}*/