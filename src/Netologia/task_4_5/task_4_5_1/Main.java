package Netologia.task_4_5.task_4_5_1;

import java.util.*;

public class Main {
    public static int index;
    public static ComparatorSortingPriority compPriorityAsc = new ComparatorSortingPriority(false);
    public static ComparatorSortingPriority compPriorityDesc = new ComparatorSortingPriority(true);
    public static ComparatorSortingPrice compPriceAsc = new ComparatorSortingPrice(true);
    public static ComparatorSortingPrice compPriceDesc = new ComparatorSortingPrice(false);
    public static Set<Wish> wishList = null;
    public static final List<String> LIST_ANSWER_YES = new ArrayList<>(Arrays.asList("L", "l", "Д", "д"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача: Список покупок.\n");

        while (true) {
            System.out.print("1. Сортировка по убыванию цены\n" +
                    "2. Сортировка по возрастанию цены\n" +
                    "3. Сортировка по приоритету от самого важного\n" +
                    "4. Сортировка по приоритету от низкого приоритета\n" +
                    "Введите индентификатор сортировки: ");
            index = scanner.nextInt();

            if ((index <= 0) || (index > 4)) {
                System.out.println("Вы выбрали не верный пункт!");
                continue;
            } else {
                break;
            }
        }

        Wish wish1 = new Wish("PS4", "Игровая консолль PlayStation Pro 4", 35_000d, "www.fotosklad.ru", 3);
        Wish wish2 = new Wish("MacBook", "Ноутбук MacBook", 60_000d, "www.apple.ru", 3);
        Wish wish3 = new Wish("Телефон", "Телефон Xiaomi ", 10_000d, "www.all-readers.ru", 5);
        Wish wish4 = new Wish("Gsktcjc", "РОБОТ-ПЫЛЕСОС XIAOMI MI ROBOROCK SWEEP ONE", 24_165d, "www.all-readers.ru", 4);
        Wish wish5 = new Wish("Ремешок для часов", "СМЕННЫЙ РЕМЕШОК ДЛЯ УМНЫХ ЧАСОВ AMAZFIT BIP SMARTWATCH (ЧЕРНЫЙ)", 299d, "www.all-readers.ru", 1);
        Wish wish6 = new Wish("Термометр", "ТЕРМОМЕТР XIAOMI MIJIA HYGROMETER BLUETOOTH", 929d, "www.all-readers.ru", 2);
        Wish wish7 = new Wish("Компьютерная мышь", "МЫШЬ XIAOMI MI PORTABLE MOUSE GOLD BLUETOOTH", 1_162d, "www.all-readers.ru", 1);
        Wish wish8 = new Wish("Камера", "ЭКШН-КАМЕРА XIAOMI MIJIA 4K ACTION CAMERA ", 7_649d, "www.all-readers.ru", 2);
        Wish wish9 = new Wish("Чайник", "ЧАЙНИК XIAOMI SMART KETTLE BLUETOOTH ", 2_699d, "www.all-readers.ru", 4);
        Wish wish10 = new Wish("SOUNDBAR", "ЗВУКОВАЯ ПАНЕЛЬ XIAOMI MI TV SOUNDBAR", 4_884d, "www.all-readers.ru", 3);
        Wish wish11 = new Wish("ОЧИСТИТЕЛЬ ВОЗДУХА", "ОЧИСТИТЕЛЬ ВОЗДУХА XIAOMI MI AIR PURIFIER 2S INTERNATIONAL VERSION", 9_798d, "www.all-readers.ru", 5);
        Wish wish12 = new Wish("ЭЛЕКТРОШВАБРА", "ЭЛЕКТРОШВАБРА XIAOMI SWDK ELECTRIC MOP D260", 6_979d, "www.all-readers.ru", 5);
        Wish wish13 = new Wish("МАГНИТНАЯ ЛЕНТА", "МАГНИТНАЯ ЛЕНТА ДЛЯ XIAOMI MI ROBOT VACUUM CLEANER (ВИРТУАЛЬНАЯ СТЕНА / КОРИЧНЕВАЯ)", 636d, "www.all-readers.ru", 1);

        switch (index) {
            case 1:
                wishList = new TreeSet<Wish>(compPriceDesc);
                break;
            case 2:
                wishList = new TreeSet<Wish>(compPriceAsc);
                break;
            case 3:
                wishList = new TreeSet<Wish>(compPriorityAsc);
                break;
            case 4:
                wishList = new TreeSet<Wish>(compPriorityDesc);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + index);
        }

        wishList.add(wish1);
        wishList.add(wish2);
        wishList.add(wish3);
        wishList.add(wish4);
        wishList.add(wish5);
        wishList.add(wish6);
        wishList.add(wish7);
        wishList.add(wish8);
        wishList.add(wish9);
        wishList.add(wish10);
        wishList.add(wish11);
        wishList.add(wish12);
        wishList.add(wish13);

        System.out.println("\n" + wishList.toString());
        String exit = "";

        while ((LIST_ANSWER_YES.equals(exit)) || exit.equals("")) {
            SortingTreeSet();

            Scanner scanner1 = new Scanner(System.in);
            System.out.print("\nХотите выйти? (\"Д\" и Enter): ");
            exit = scanner1.nextLine();
        }

        System.out.println("\nДо свидания!");
    }

    public static void SortingTreeSet() {
        Scanner scanner1 = new Scanner(System.in);

        while (true) {
            System.out.print("\n1. Сортировка по убыванию цены\n" +
                    "2. Сортировка по возрастанию цены\n" +
                    "3. Сортировка по приоритету от самого важного\n" +
                    "4. Сортировка по приоритету от низкого приоритета\n" +
                    "Введите индентификатор сортировки: ");
            index = scanner1.nextInt();

            if ((index <= 0) || (index > 4)) {
                System.out.println("Вы выбрали не верный пункт!");
                continue;
            } else {
                break;
            }
        }

        TreeSet<Wish> wishListSort = null;
        switch (index) {
            case 1:
                wishListSort = new TreeSet<Wish>(compPriceAsc);
            case 2:
                wishListSort = new TreeSet<Wish>(compPriceAsc);
                break;
            case 3:
                wishListSort = new TreeSet<Wish>(compPriorityAsc);
                break;
            case 4:
                wishListSort = new TreeSet<Wish>(compPriorityDesc);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + index);
        }
        wishListSort.addAll(wishList);

        Iterator iterator;
        iterator = wishListSort.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
