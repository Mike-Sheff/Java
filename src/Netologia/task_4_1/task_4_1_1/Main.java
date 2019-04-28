package Netologia.task_4_1.task_4_1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listTasks = new ArrayList<>();

        System.out.println("Задача: Записная книга.");
        System.out.println();

        System.out.println("Создание задач для добавление в список дел: ");
        actionList("new", listTasks);
        printListTask(listTasks);

        System.out.println("\nДобавление задач в список дел: ");
        actionList("add", listTasks);
        printListTask(listTasks);

        System.out.println("\nУдаление задачи из списока дел: ");
        actionList("del", listTasks);
        printListTask(listTasks);

        System.out.println();
        System.out.println("До свидание");
    }

    public static void printListTask(ArrayList<String> list) {
        int i = 1;
        System.out.format("\nСписок дел:\n");
        if (list.size() > 0) {
            for (String task : list) {
                System.out.format("Задача № %d : %s\n", i, task);
                i++;
            }
        } else {
            System.out.println("Список пуст!");
        }
    }

    public static void actionList(String operation, ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int index = 0;
        ArrayList<String> listClone;

        while (!(("Д".equals(input)) || ("д".equals(input)) || ("L".equals(input)) || ("l".equals(input)))) {
            switch (operation) {
                case "new":
                    System.out.print("Введите название задачи: ");
                    list.add(scanner.nextLine());
                    break;
                case "add":
                    printListTask(list);
                    System.out.print("Введите название задачи: ");
                    String taskAdd = scanner.nextLine();

                    while ((index <= 0) || (index > list.size())) {
                        System.out.format("Введите номер задачи, после которой нужно вставить новую задачу от 1 до %d: ", list.size());
                        try {
                            index = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException exp) {
                            System.out.println("Введите целое число, и в диапазоне от 1 до " + list.size());
                        }
                    }

                    list.add(index, taskAdd);
                    index = 0;
                    break;
                case "del":
                    printListTask(list);
                    if (list.size() > 0) {
                        while ((index <= 0) || (index > list.size())) {
                            System.out.format("Введите номер задачи от 1 до %d: ", list.size());

                            try {
                                index = Integer.parseInt(scanner.nextLine());
                            } catch (NumberFormatException exp) {
                                System.out.println("Введите целое число, и в диапазоне от 1 до " + list.size());
                            }
                        }
                        list.remove(index - 1);
                    } else {
                        System.out.println("Список пуст!");
                    }

                    System.out.println();
                    index = 0;
                    break;
            }
            System.out.print("Хотите завершить ввод? (для завершения, последовательно нажмите кнопку \"Д\" и Enter): ");
            input = scanner.nextLine();
        }
    }
}
