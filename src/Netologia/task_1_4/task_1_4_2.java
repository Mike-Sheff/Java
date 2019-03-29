package Netologia.task_1_4;

import java.util.Scanner;
import java.io.*;

public class task_1_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = "";

        System.out.println("Задача: Удаляем лишние пробелы.");
        System.out.println("");

        System.out.print("Введите текст:");
        //inputText = "  hjkjh hkjhkj   kjkj kkkk     kkkl ";
        //System.out.println(inputText + ".");
        inputText = scanner.nextLine();

        System.out.println("Было :" + inputText + ".");
        System.out.println("Стало:" + extraTrim(inputText) + ".");

        System.out.println("");
        System.out.println("До свидания!");
    }

    public static String extraTrim(String text) {
        String inputTrimmed = text.trim();
        return inputTrimmed.replaceAll("\\s+", " ");
    }
}
