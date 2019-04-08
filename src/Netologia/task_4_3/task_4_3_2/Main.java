package Netologia.task_4_3.task_4_3_2;

import java.util.*;

public class Main {
    public static final ArrayList<String> LIST_ANSWER_YES = new ArrayList<>(Arrays.asList("L", "l", "Д", "д"));
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Set<Organization> set = new HashSet<>();
        String input = "";
        String name, city, adress;
        int inn, kpp, ogrn;
        System.out.println("Задача: База организаций.\n");

        set.add(new Organization("ООО Нетология", "Москва", "Ленина 5",
                10123123, 12311121, 123243434));
        set.add(new Organization("ООО Нетология2", "Москва", "Ленина 5",
                10123123, 12311121, 123243434)); // не добавится
        set.add(new Organization("Учеба", "СПб", "Московский пр. 90",
                1013453423, 123213131, 1236921));
        set.add(new Organization("Study", "SPb", "Moskovskij pr. 90",
                1013453423, 123213131, 1236921)); // не добавится
        set.add(new Organization("Учеба2", "Ленинград", "Ленинский пр. 9",
                101, 123213131, 1236921));
        set.add(new Organization("Учеба2", "Ленинград", "Ленинский пр. 9",
                101, 123, 123));

        while (!LIST_ANSWER_YES.contains(input) || input.equals("")) {
            name = scannerString("название огранизации");
            city = scannerString("город");
            adress = scannerString("адрес");

            inn = scannerInt("ИНН");
            kpp = scannerInt("КПП");
            ogrn = scannerInt("ОГРН");

            set.add(new Organization(name, city, adress, inn, kpp, ogrn));

            System.out.print("Для выхода последовательно нажмите \"Д\" и \"Enter\". " +
                    "Для продолжения нажмите \"Enter\": ");
            input = scanner.nextLine();
        }

        System.out.println("\nСписок организаций:");

        if (set.isEmpty()) {
            System.out.println("В списке нет организаций");
        } else {
            System.out.println(set.toString());
        }

        System.out.println("\nДо свидания!");
    }

    public static String scannerString(String text) {
        System.out.format("Введите %s: ", text);
        return scanner.nextLine();
    }

    public static int scannerInt(String text) {
        String tempStringValue;
        int tempIntValue = 0;
        do {
            tempStringValue = scannerString(text);

            if (tempStringValue.matches("[+]?\\d+")) {
                tempIntValue = Integer.parseInt(tempStringValue);
            } else {
                tempStringValue = "";
            }
        } while (tempStringValue.equals(""));
        return tempIntValue;
    }
}
