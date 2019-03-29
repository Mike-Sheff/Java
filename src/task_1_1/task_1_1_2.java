package Netologia.task_1_1;

import java.util.Scanner;

public class task_1_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTaskHour1 = 0;
        int firstTaskHour2 = 0;
        int secondTaskHour1 = 0;
        int secondTaskHour2 = 0;

        System.out.println("Для проверки пересечение задач");
        System.out.println("Введите интервал первой задачи в формате 'Н1' и 'К1':");
        System.out.println(",где Н1 - время начала задачи, К1 - время окончания задачи");
        System.out.println(" время исчисляется от 00 до 23");

        firstTaskHour1 = scanner.nextInt(); // Н1
        firstTaskHour2 = scanner.nextInt(); // K1

        if ((firstTaskHour1 < 0) || (firstTaskHour1 > 23)) {
            System.out.println("Время начала задачи не соответствует требованию!");
        } else {
            if ((firstTaskHour2 <= firstTaskHour1) || (firstTaskHour2 > 23)) {
                System.out.println("Время окончания задачи не соответствует требованию!");
            } else {
                System.out.println("Введите интервал второй задачи в формате 'Н2' и 'К2':");
                System.out.println(",где Н2 - время начала задачи, К2 - время окончания задачи");
                System.out.println(" время исчисляется от 00 до 23");

                secondTaskHour1 = scanner.nextInt(); // Н2
                secondTaskHour2 = scanner.nextInt(); // К2

                if ((secondTaskHour1 < 0) || (secondTaskHour1 > 23)) {
                    System.out.println("Время начала задачи не соответствует требованию!");
                } else {
                    if ((secondTaskHour2 <= secondTaskHour1) || (secondTaskHour2 > 23)) {
                        System.out.println("Время окончания задачи не соответствует требованию!");
                    } else {
                        if (((secondTaskHour1 > firstTaskHour1) && (secondTaskHour1 < firstTaskHour2)) || // Н2 > Н1 и Н2 < К1
                                ((secondTaskHour2 > firstTaskHour1) && (secondTaskHour2 < firstTaskHour2)) || // К2 > H1 и K2 < K1
                                ((firstTaskHour1 > secondTaskHour1) && (firstTaskHour1 < secondTaskHour2)) || // H1 > H2 и H1 < K2
                                ((secondTaskHour1 == firstTaskHour1) || (secondTaskHour2 == firstTaskHour2)) // H2 = H1 или K2 = K1
                        ) {
                            System.out.println("Задачи пересекаются во времени!");
                        } else {
                            System.out.println("Задачи не пересекаются во времени!");
                        }
                    }
                }
            }
        }

        System.out.println("");
        System.out.println("До свидания!");
    }
}
