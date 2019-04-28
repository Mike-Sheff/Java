package Netologia.task_4_4.task_4_4_1;

import java.util.*;

public class Main {
    public static List<Product> products;
    public static List<Storage> storages;

    public static Map<Product, Storage> map = new HashMap<>();

    public static void main(String[] args) {
        boolean exit = true;
        System.out.println("Задача: Учет товаров на складах.\n");

        Storage storage1 = new Storage("Склад 1", "Санкт-Петербург");
        Storage storage2 = new Storage("Склад 2", "Москва");

        storages = new ArrayList<>(Arrays.asList(storage1, storage2));

        Product product1 = new Product("1л", "Хлеб", 5.5f);
        Product product2 = new Product("28р", "Булка", 33.3f);
        Product product3 = new Product("3ж", "Батон", 47.87f);

        products = new ArrayList<>(Arrays.asList(product1, product2, product3));

        map.put(products.get(0), storages.get(0));
        map.put(product2, storage2);
        map.put(products.get(2), storages.get(0));

        System.out.println("Привязка продукта и складов:");
        System.out.println(map);

        while (exit) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Меню:\n" +
                    "  1 - Вывести список продуктов\n" +
                    "  2 - Добавить продукт\n" +
                    "  3 - Вывести список складов\n" +
                    "  4 - Добавить склад\n" +
                    "  5 - Поиск продукта на складах\n" +
                    "  6 - Перемещение продукта между складами\n" +
                    "  7 - Удаления продукта\n" +
                    "  0 - Выход из программы\n" +
                    "Выберите пункт меню от 0 до 7: ");

            if (scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("\nСписок продуктов:");
                        for (Product product : products) {
                            System.out.print(product);
                        }
                        System.out.println();
                        break;
                    case 2:
                        addProduct(null);
                        System.out.println("Привязка продукта и склада:");
                        System.out.println(map);
                        break;
                    case 4:
                        addStorage();
                    case 3:
                        System.out.println("\nСписок складов:");
                        for (Storage storage : storages) {
                            System.out.print(storage);
                        }
                        System.out.println();
                        break;
                    case 5:
                        searchProductStorage();
                        break;
                    case 6:
                        //TODO:
                        break;
                    case 7:
                        //TODO:
                        break;
                    case 0:
                        System.out.println("\nДо свидания!");
                        exit = false;
                        break;
                    default:
                        System.out.println("Внимание! Вы выбрали несуществующий пункт меню!");
                        break;
                }
            } else {
                System.out.println("Внимание! Вы не правильно ввели пункт меню.");
            }
        }
    }

    private static void addStorage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название склада: ");
        String nameStorage = scanner.nextLine();
        System.out.print("Введите адрес склада: ");
        String addressStorage = scanner.nextLine();

        storages.add(new Storage(nameStorage,addressStorage));

    }

    private static void searchProductStorage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите название продукта для поиска: ");
        String searchName = scanner.nextLine();
        String searchProduct = null;
        for (Product product : products) {
            if (product.getName().equals(searchName)) {
                searchProduct = product.getId();
                break;
            }
        }

        if(searchProduct == null){
            System.out.println("Даного продукта нет в списках продуктов!");
        } else {
            for (Map.Entry<Product, Storage> mp : map.entrySet()) {
                if (mp.getKey().equals(searchProduct)) {
                    System.out.format("Продукт - %s находится на складе - %s \n\n", searchName, mp.getValue().getName());
                }
            }
        }
    }

    public static void addProduct(String id) {
        Scanner scanner = new Scanner(System.in);
        float price;
        Product prod = null;

        System.out.print("Введите название продукта: ");
        String name = scanner.nextLine();

        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите цену продукта: ");
            if (scanner1.hasNextFloat()) {
                price = scanner1.nextFloat();
                break;
            } else {
                System.out.println("Будьте внимательней! Введите дробное число (с запятой)!");
            }
        }

        while (true) {
            if (id == null) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("Введите номер продукта: ");
                id = scanner2.next();
            }

            if (products.contains(id)) {
                System.out.println("Продукт с таким номером уже есть в списке!");
                id = null;

                System.out.print("Хотите исправить номер товара? (\"Д\" и Enter): ");
                String exit = scanner.nextLine();

                if (!((exit.equals("L")) || (exit.equals("l")) || (exit.equals("Д")) || (exit.equals("д")))) {
                    break;
                }
            } else {
                prod = new Product(id, name, price);
                products.add(prod);
                System.out.println("Добавление прошло удачно!");
                break;
            }
        }

        while (true) {
            System.out.println("Склады:");

            int i = 1;
            for (Storage storage : storages) {
                System.out.println(i++ + " - " + storage.getName());
            }

            System.out.print("Выберите номер склада: ");
            int numberStorage = scanner.nextInt();
            if ((numberStorage < 1) || (numberStorage >= i)) {
                continue;
            } else {
                map.put(prod, storages.get(numberStorage - 1));
                System.out.println();
                break;
            }
        }
    }
}