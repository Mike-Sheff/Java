package Netologia.task_1_4;

import java.util.Scanner;
import java.lang.Exception;

public class task_1_4_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int startTime = 0;
        int endTime = 0;
        int result = 0;
        String inputText = "";

        System.out.println("Задача: Добавление новой задачи в TaskManager.");
        System.out.println("");

        System.out.print("Введите новую задачу: ");
        //inputText = "Добавить картинку на главный экран приветствия, задача начинается в 15 и заканчивается в 19";
        inputText = "Добавить картинку на главный экран приветствия, задача начинается в 15 и заканчивается в 15";
        //inputText = "Добавить картинку на главный экран приветствия, задача начинается в 19 и заканчивается в 15 ";
        //inputText = "Добавить картинку на главный экран приветствия, задача начинается в 19 и заканчивается в 1а ";
        System.out.println(inputText);
        //inputText = scanner.nextLine();

        startTime = getValueInText(inputText, "начинается в");
        endTime = getValueInText(inputText, "заканчивается в");

        result = endTime - startTime;
        if ((result <= 0) || (endTime < 0) || (startTime < 0)) {
            throw new Exception("Error input string: " + inputText);
        } else {
            System.out.println("");
            System.out.println("На задачу потребуется: " + result + " ч.");
        }

        System.out.println("");
        System.out.println("До свидания!");

    }

    public static int getValueInText(String text, String searchText) {
        int startTimeInt = 0;
        int lenText = 0;
        int startPos = text.indexOf(searchText);

        if (startPos < 0) {
            return -1;
        }

        lenText = searchText.length();

        try {
            String startTimeString = text.substring(startPos + lenText, startPos + lenText + 3);
            startTimeString = startTimeString.trim();
            startTimeInt = Integer.parseInt(startTimeString);
        } catch (Exception exp) {
            System.out.println("");
            return -1;
        }

        return startTimeInt;
    }
}