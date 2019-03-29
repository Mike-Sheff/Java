package Netologia.task_1_3;

import java.util.Scanner;

public class task_1_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        long totalTime = 0;
        long total = 0;

        System.out.println("Задача: Расчет нагрузки.");

        while (!(("Д".equals(input)) || ("д".equals(input)) || ("L".equals(input)) || ("l".equals(input)))) {
            System.out.println("");
            System.out.print("Введите название задачи: ");
            String task = scanner.nextLine();

            System.out.print("Сколько времени потребуется на выполнение задачи? ");
            int time = Integer.parseInt(scanner.nextLine());

            System.out.print("В какой единице значение (ч - часы, м - минуты, c - секунды): ");
            String unit = scanner.nextLine();

            if (time > 0) {
                //Переведем время в секунды
                switch (unit) {
                    case "ч":
                    case "x":
                        time = time * 3600;
                        break;
                    case "v":
                    case "м":
                        time = time * 60;
                        break;
                    case "c":
                    case "с":
                        time = time * 1;
                        break;
                    default:
                        time = 0;
                        break;
                }
                totalTime += time;
            }

            System.out.print("Завершить ввод задач? (Д/Н) ");
            input = scanner.nextLine();
        }

        //После ввода "end" проверяем если totalTime
        if (totalTime > 0) {
            System.out.println("");
            System.out.println("В какой единице измерения вернуть значение (ч - часы, м - минуты, c - секунды)");
            String unit = scanner.next();

            total = totalTime;
            //Переводим в необходимую единицу измерения
            switch (unit) {
                case "ч":
                case "x":
                    totalTime = totalTime / 3600;
                    break;
                case "v":
                case "м":
                    totalTime = totalTime / 60;
                    break;
            }

            //Выводим результат
            System.out.println("Значение: " + totalTime + " " + unit);
            System.out.println("Значение время: " + (int) (total / 3600) + "ч " + (int) ((total / 60) % 60) + "м " + total % 60 + "с");
        }

        System.out.println("");
        System.out.println("До свидания!");
    }
}
