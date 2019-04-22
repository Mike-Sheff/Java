package Netologia.task_4_6.task_4_6_1;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
    @author Sharin Mikhail
*/
public class Main {
    public static Contacts contacts = new Contacts();
    public static MissedCalls missedCalls = new MissedCalls();

    public static void main(String[] args) throws InterruptedException {
        int input;
        boolean exit = true;

        System.out.println("Задача: Пропущенные вызовы.\n");

        contacts.addContact("Петров","Петр","111-11-11",Group.WORK);
        contacts.addContact("Сидоров","Сидр","222-22-22",Group.WORK);
        contacts.addContact("Иванов","Иван","333-33-33",Group.WORK);

        contacts.addContact("Алексеев","Михаил","+7-777-777-77-77",Group.FRIENDS);
        contacts.addContact("Алексеев","Александр","+7-888-888-88-88",Group.FRIENDS);
        contacts.addContact("Алексеева","Ксения","+7-999-999-99-99",Group.FRIENDS);

        contacts.addContact("Шарин","Константин","8(444)444-44-44",Group.FAMILY);
        contacts.addContact("Шарин","Михаил","8(555)555-55-55",Group.FAMILY);
        contacts.addContact("Шарин","Сергей","8(666)666-66-66",Group.FAMILY);

        System.out.println(contacts);

        missedCalls.addMissedCalls("555-55-55");
        TimeUnit.SECONDS.sleep(1);
        missedCalls.addMissedCalls("+7-888-888-88-88");
        TimeUnit.SECONDS.sleep(1);
        missedCalls.addMissedCalls("555-55-44");
        TimeUnit.SECONDS.sleep(1);
        missedCalls.addMissedCalls("8(555)555-55-55");
        TimeUnit.SECONDS.sleep(1);
        missedCalls.addMissedCalls("333-333-333");
        TimeUnit.SECONDS.sleep(1);
        missedCalls.addMissedCalls("222-22-22");
        TimeUnit.SECONDS.sleep(1);
        missedCalls.addMissedCalls("567-88-88");

        missedCalls.showCalls();

        while (exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nМеню:\n" +
                    "1. Добавить контакт\n" +
                    "2. Добавить пропущенный вызов\n" +
                    "3. Вывести все пропущенные вызовы\n" +
                    "4. Очистить пропущенные вызовы\n" +
                    "5. Выход\n" +
                    "Выберите пункт меню: ");

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
            } else {
                continue;
            }

            switch (input) {
                case 1:
                    addContact();
                    System.out.println(contacts);
                    break;
                case 2:
                    addMissedCall();
                    missedCalls.showCalls();
                    break;
                case 3:
                    missedCalls.showCalls(contacts);
                    break;
                case 4:
                    missedCalls.clearMissesCalls();
                    System.out.println("Список пропущенных контактов очищен!");
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("Будьте внимательны, не правильно выбран пункт меню.");
                    break;
            }

        }

        System.out.println("\n До свидания!");
    }

    public static void addContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите через пробел фамилию и имя: ");
        String surname = scanner.next();
        String name = scanner.next();
        System.out.print("Введите номер телефона: ");
        String phone = scanner.next();

        int input;
        while (true){
            Scanner scanner1 = new Scanner(System.in);

            System.out.print("Группа:\n" +
                    "1 - Работа\n" +
                    "2 - Друзья\n" +
                    "3 - Семья\n" +
                    "Выберите номер группы (1-3): ");
            if(scanner1.hasNextInt()){
                input = scanner1.nextInt();
                if ((input >= 1) && (input <= 3)){
                    break;
                } else {
                    System.out.println("Error: Выбран не правильный номер групы!");
                }
            }

        }

        Enum group = Group.FAMILY;

        switch (input) {
            case 1:
                group = Group.WORK;
                break;
            case 2:
                group = Group.FRIENDS;
                break;
            case 3:
                group = Group.FAMILY;
                break;
        }

        contacts.addContact(surname,name,phone,group);

        System.out.println("Добавлен контакт!");
    }

    private static void addMissedCall() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите номер пропущенного звонка: ");
        String phone = scanner.nextLine();
        missedCalls.addMissedCalls(phone);

        System.out.println("Номер пропущенного звонка записан!");
    }
}