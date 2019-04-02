package Netologia.task_4_2.task_4_2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static final ArrayList<String> LIST_ANSWER_YES = new ArrayList<>(Arrays.asList("L", "l", "Д", "д"));

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String formula = "2 + 3 * 4";

        System.out.println("Задача: Польская запись.");


        while (!LIST_ANSWER_YES.contains(input) || input.equals("")) {
            System.out.print("\nВведите математическую формулу: ");
            if (formula.equals("")){
                formula = bufferedReader.readLine();
            } else {
                System.out.println(formula);
            }

            Stack<String> sign = new Stack<>();
            Queue<Integer> numbers = new ArrayDeque<>();

            String[] arrayValues = formula.split(" ");
            formula = "";

            for (int i = 0; i < arrayValues.length; i++) {
                String value = arrayValues[i];
                if (isNumber(value)) {
                    numbers.add(Integer.parseInt(value));
                } else {
                    sign.add(value);
                }
            }

            System.out.print("Польская запись формулы: ");

            while (!numbers.isEmpty()) {
                System.out.print(numbers.poll() + " ");
            }

            while (!sign.isEmpty()) {
                System.out.print(sign.pop() + " ");
            }

            System.out.print("\n\nДля выхода последовательно нажмите \"Д\" и \"Enter\". " +
                    "Для повторения ввода формулы нажмите \"Enter\": ");
            input = bufferedReader.readLine();
        }
        System.out.println("\nДо свидания!");
    }

    public static boolean isNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
