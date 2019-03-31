package Netologia.task_3_2.task_3_2_2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    final static int SIZE = 5; //10;
    final static int EMTY = 0;
    final static int SHIP = 1;
    final static int DEAD = 2;
    final static int MISS = 3;
    static int warField[][] = new int[SIZE][SIZE];
    final static int MAX_COUNT = 5; //10;
    final static int MAX_MOVE = 10; //30;

    public static void main(String[] args) {
        Random random = new Random();
        int deadCount = 0;
        Scanner scanner = new Scanner(System.in);
        int shipPlace1 = -1;
        int shipPlace2 = -1;

        System.out.println("Задача: Морской бой.");
        System.out.println();

        for (int i = 0; i < MAX_COUNT; i++) {
            shipPlace1 = random.nextInt(SIZE);
            shipPlace2 = random.nextInt(SIZE);

            if (warField[shipPlace1][shipPlace2] == SHIP) {
                i--;
            } else {
                warField[shipPlace1][shipPlace2] = SHIP;
            }
        }

        int k = 1;

        while (true) {
            System.out.println("Текущее поле (на шаге № " + k + "): ");

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.format("%3d", warField[i][j]);
                }
                System.out.println();
            }

            shipPlace1 = -1;
            shipPlace2 = -1;

            while ((shipPlace1 < 0) || (shipPlace1 >= SIZE)) {
                System.out.print("Введите координату по горизонтали (y) от 0 до " + (SIZE - 1) + ": ");
                try {
                    shipPlace1 = Integer.parseInt(scanner.next());
                } catch (NumberFormatException e) {
                    System.out.println("Error: Введите целое число!");
                    shipPlace1 = -1;
                }
            }
            while ((shipPlace2 < 0) || (shipPlace2 >= SIZE)) {
                System.out.print("Введите координату по вертикали (x) от 0 до " + (SIZE - 1) + ": ");
                try {
                    shipPlace2 = Integer.parseInt(scanner.next());
                } catch (NumberFormatException e) {
                    System.out.println("Error: Введите целое число!");
                    shipPlace2 = -1;
                }
            }

            switch (warField[shipPlace1][shipPlace2]) {
                case 0:
                    warField[shipPlace1][shipPlace2] = 3;
                    System.out.println("Промахнулся!");
                    break;
                case 1:
                    warField[shipPlace1][shipPlace2] = 2;
                    deadCount++;
                    System.out.println("Попал!");
                    break;
                case 2:
                    System.out.println("Вы уже сюда стреляли и попали!");
                    k--;
                    break;
                case 3:
                    System.out.println("Вы уже сюда стреляли и промахнулись!");
                    k--;
                    break;
            }

            if ((deadCount == MAX_COUNT) || (k == MAX_MOVE)) {
                System.out.format("Совершено шагов - %d \nУбито кораблей - %d \n", k, deadCount);
                break;
            }
            k++;
        }

        if (deadCount == MAX_COUNT) {
            System.out.print("Вы выйграли!");
        } else {
            System.out.println("Вы проиграли!");
        }

        System.out.println();
        System.out.println("До свидания!");
    }
}