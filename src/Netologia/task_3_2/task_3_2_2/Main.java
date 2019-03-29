package Netologia.task_3_2.task_3_2_2;

import java.util.Random;

public class Main {
    final static int SIZE = 10;
    final static int EMTY = 0;
    final static int SHIP = 1;
    final static int DEAD = 2;
    final static int MISS = 3;
    static int warField[][] = new int[SIZE][SIZE];
    final static int MAX_COUNT = 10;

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < MAX_COUNT; i++) {
            int shipPlace1 = random.nextInt(SIZE);
            int shipPlace2 = random.nextInt(SIZE);

            if (warField[shipPlace1][shipPlace2] == SHIP){
                i--;
            } else {
                warField[shipPlace1][shipPlace2] = SHIP;
            }
        }


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%3d", warField[i][j]);
            }
            System.out.println();
        }
    }
}
