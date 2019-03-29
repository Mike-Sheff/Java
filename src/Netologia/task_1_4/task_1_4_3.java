package Netologia.task_1_4;

import java.util.Scanner;

public class task_1_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFormula = "";

        System.out.println("Задача: Проверка формулы.");
        System.out.println("");

        System.out.print("Введите формулу: ");
        inputFormula = scanner.nextLine();
        System.out.println(isFormulaValid(inputFormula));

        //checkFormula("5*)(3+5())");
        //checkFormula("5*(3+5)+(6+7)");
        //checkFormula("(5*(3+5)()+(6+7)");

        System.out.println("");
        System.out.println("До свидания!");
    }

    public static void checkFormula(String formula) {
        System.out.print("Введите формулу: ");
        System.out.println();
        System.out.println(formula);
        System.out.println("Проверка: " + isFormulaValid(formula));
        System.out.println();
    }

    public static boolean isFormulaValid(String formula) {
        int counterin = 0;
        int counterout = 0;
        int count = 0;

        for (int i = 0; i < formula.length(); i++) {
            char c = formula.charAt(i);

            if (c == '(') {
                counterin++;
            } else if (c == ')') {
                counterout++;
                if ((counterin + count) < counterout) {
                    System.out.println("Внимание: Закрывающая скобка раньше открывающейся! -> '" + formula.substring(0, i + 1) + "'");
                    count++;
                }

                if ('(' == formula.charAt(i - 1)) {
                    System.out.println("Внимание: В скобках ничего не заключено! -> '" + formula.substring(0, i + 1) + "'");
                }
            }
        }

        if (counterin == counterout) {
            return true;
        } else {
            if (counterin > counterout) {
                System.out.println("Внимание: Открывающих(" + counterin + " шт.) скобок больше, чем закрывающих(" + counterout + " шт.)!");
            } else {
                System.out.println("Внимание: Закрывающих(" + counterout + " шт.) скобок больше, чем открывающих(" + counterin + " шт.)!");
            }
            return false;
        }
    }
}
