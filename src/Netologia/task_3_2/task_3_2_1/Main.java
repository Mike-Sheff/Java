package Netologia.task_3_2.task_3_2_1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    final static int SIZE = 8;

    public static void main(String[] args) {
        Random random = new Random();
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);
        int turn = 0;

        System.out.println("Задача: Поворот матрицы на 90 градусов по часовой стрелке.");
        System.out.println();

        System.out.println("Выберите следующие варианты поворота:");
        System.out.println("1 - по часовой ");
        System.out.println("2 - против часовой");

        while ((turn <= 0) || (turn > 2)) {
            System.out.print("Ваш вариант: ");
            try {
                turn = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Error: Введите целое число!");
                turn = 0;
            }
        }
        System.out.println("Выберите следующие варианты поворота:");
        System.out.println("1 - 90 градусов или 90+360*n, где n - любое целое число");
        System.out.println("2 - 180 градусов или 180+360*n, где n - любое целое число");
        System.out.println("3 - 270 градусов или 270+360*n, где n - любое целое число");
        System.out.println("4 - 360 градусов или 360*n, где n - любое целое число");

        int turnOn = 0;

        while ((turnOn < 1) || (turnOn > 4)) {
            System.out.print("Ваш вариант: ");
            try {
                turnOn = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Error: Введите целое число!");
                turnOn = 0;
            }
        }

        if (turnOn == 4) {
            turnOn = 0;
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        System.out.println("Матрица до поворота: ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }

        for (int k = 0; k < turnOn; k++) {
            for (int i = 0; i < SIZE; ++i) {
                for (int j = 0; j < SIZE; ++j) {
                    if (turn == 1) {
                        rotatedColors[i][j] = colors[SIZE - 1 - j][i];
                    } else {
                        rotatedColors[i][j] = colors[j][SIZE - 1 - i];
                    }
                }
            }
            for (int i = 0; i < SIZE; ++i) {
                for (int j = 0; j < SIZE; ++j) {
                    colors[i][j] = rotatedColors[i][j];
                }
            }
        }

        System.out.println("");
        System.out.println("Матрица после поворота: ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("До свидания!");
    }
}
