package Netologia.task_4_4.task_4_4_2;

import java.util.*;

public class Main {
    private static final ArrayList<String> LIST_ANSWER_YES = new ArrayList<>(Arrays.asList("L", "l", "Д", "д"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Map<Contact, String> map = new HashMap<>();

        System.out.println("Задача: Телефонный справочник\n");

        List<String> groups = new ArrayList<>(Arrays.asList("Family", "Friends", "Other", "Work"));
        Contact contact1 = new Contact("Petrov", "Petr", "+7(911)111-11-11");
        Contact contact2 = new Contact("Sidorova", "Mariya", "+7-922-222-22-22");
        Contact contact3 = new Contact("Ivanov", "Ivan", "8(933)333-33-33");
        List<Contact> contacts = new ArrayList<>(Arrays.asList(contact1,contact2, contact3));

        map.put(contact1, groups.get(0));
        map.put(contact1, groups.get(3));
        map.put(contact2, groups.get(1));
        map.put(contact3, groups.get(0));

        PhoneContacts phoneContacts = new PhoneContacts(groups, map);
        String namegroup;

        while ((LIST_ANSWER_YES.equals(input)) || "".equals(input)) {
            System.out.print("Введите название группы: ");
            namegroup = scanner.nextLine();
            if (phoneContacts.searchName(namegroup)) {
                System.out.println("Такая группа уже существует!");
            } else {
                phoneContacts.addNewName(namegroup);
            }

            System.out.print("Хотите выйти? (Нажмите последовательно \"Д\" и Enter): ");
            input = scanner.nextLine();
        }

        phoneContacts.getName();

        String surname;
        String name;
        String numberphone;
        int numbergroup;
        input = "";
        System.out.println();

        while ((LIST_ANSWER_YES.equals(input)) || "".equals(input)) {
            System.out.print("Введите фамилию контакта: ");
            surname = scanner.nextLine();
            System.out.print("Введите имя контакта: ");
            name = scanner.nextLine();
            System.out.print("Введите телефон контакта: ");
            numberphone = scanner.nextLine();

            while (true) {
                phoneContacts.getName();

                System.out.print("Выберите номер группы: ");
                numbergroup = scanner.nextInt();

                if ((numbergroup > 0) && (numbergroup <= phoneContacts.getSizeName())) {
                    contacts.add(new Contact(surname, name, numberphone));
                    phoneContacts.setNameContactMap(phoneContacts.setName(numbergroup-1)
                                                    , new Contact(surname, name, numberphone));
                    break;
                } else {
                    System.out.println("Вы ввели число не соответствующее ниодной группе!");
                }
            }

            scanner.nextLine();

            System.out.print("Хотите выйти? (Нажмите последовательно \"Д\" и Enter): ");
            input = scanner.nextLine();
        }

        System.out.println();
        System.out.println(phoneContacts.toString());

        //TODO: сделать сортировку контактов

        System.out.println("\nДо свидания!");
    }
}
