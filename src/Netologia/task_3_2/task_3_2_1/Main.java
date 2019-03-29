package Netologia.task_3_2.task_3_2_1;

import java.util.Random;

public class Main {
    final static int SIZE = 8;

    public static void main(String[] args) {
        Random random = new Random();
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        int chet = 1;
        boolean clockise = false;

        for(int k = 0;k < chet; k++) {
            for (int i = 0; i < SIZE; ++i) {
                for (int j = 0; j < SIZE; ++j) {
                    if (clockise) {
                        rotatedColors[i][j] = colors[SIZE - 1 - j][i];
                    } else{
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
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
    }
}
