package Netologia.task_4_2.task_4_2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static final ArrayList<String> LIST_ANSWER_YES = new ArrayList<>(Arrays.asList("L", "l", "Д", "д"));
//    public static final ArrayList<String> LIST_ANSWER_NO = new ArrayList<>(Arrays.asList("Y", "y", "н", "Н", "H", "h"));
    public static final int WAIT_DOORS_IN_SECONDS = 10; // количество секунд, которое потребуется на закрытие/открытие дверей;
    public static final int WAIT_MOVE_IN_SECONDS = 5; // количество секунд, затрачиваемое лифтом на движение между этажами;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int floor;
        Queue<Integer> queue = new ArrayDeque<>();

        System.out.println("Задача: Лифт.\n");

        while (!LIST_ANSWER_YES.contains(input) || input.equals("")) {
            while (true) {
                System.out.print("Введите номер этажа(с 1 по 25): ");
                try {
                    floor = Integer.parseInt(bufferedReader.readLine());

                    if ((floor > 0) && (floor <= 25)) {
                        queue.add(floor);
                        break;
                    } else {
                        System.out.println("Введен недопустимый этаж! Будьте внимательны!");
                    }
                } catch (NumberFormatException exp) {
                    System.out.println("Вы ввели не целое число! Будьте внимательны!");
                }
            }

            System.out.print("Для выхода последовательно нажмите \"Д\" и \"Enter\". " +
                    "Для продолжения нажмите \"Enter\": ");
            input = bufferedReader.readLine();
        }

        queue.add(0);

        int totalSeconds = 0; // всего потрачено времени на движение и остановки лифтом;
        int previouseFloor = -1; // переменная для хранения предыдущей остановки.
        int currentFloor;

        System.out.println("\nПоехали по этажам: ");
        while (!queue.isEmpty()) {
            currentFloor = queue.poll();

            switch (queue.size()) {
                case 0:
                    System.out.println("Выход!\nВремя затраченное лифтом на маршрут = " + totalSeconds + " с.");
                    break;
                default:
                    System.out.print("Этаж № " + currentFloor + " -> ");
                    break;
            }

            if (previouseFloor != -1) {
                totalSeconds += Math.abs(currentFloor - previouseFloor) * WAIT_MOVE_IN_SECONDS;
                totalSeconds += WAIT_DOORS_IN_SECONDS;
            }
            previouseFloor = currentFloor;
        }

        System.out.println("\nДо свидания!");
    }
}