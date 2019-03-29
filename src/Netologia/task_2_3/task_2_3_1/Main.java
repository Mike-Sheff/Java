package Netologia.task_2_3.task_2_3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача: Игра-шутер.");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        while(true)
        {
            slot = scanner.nextInt();
            if(slot == -1) {
                break;
            } else {
                player.shotWithWeapon(slot);
            }
        }
        // главный цикл игры:
        // запрашивать номер с клвиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1

        System.out.println("Game over!");

        System.out.println("");
        System.out.println("До свидания!");
    }
}
