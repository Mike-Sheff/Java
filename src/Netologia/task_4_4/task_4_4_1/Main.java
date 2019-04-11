package Netologia.task_4_4.task_4_4_1;

import java.util.*;

public class Main {
    public static Set<Product> productSet = new LinkedHashSet<>();
    public static Set<Storage> storageSet = new LinkedHashSet<>();

    public static void main(String[] args) {
        boolean exit = true;
        //TODO: переделать
        Map<Product, Storage> map = new HashMap<>();

        storageSet.add(new Storage("Склад 1","Санкт-Петербург"));
        storageSet.add(new Storage("Склад 2","Москва"));

        productSet.add(new Product("1","Хлеб", 5.5f));
        productSet.add(new Product("2","Булка", 33.3f));
        productSet.add(new Product("3","Батон", 47.87f));

        //TODO: как реализовать добавление?
        map.put(productSet, storageSet);

        System.out.println(map);

        while(exit){
            Scanner scanner =  new Scanner(System.in);

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

            if(scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Список продуктов: \n");
                        System.out.println(productSet);
                        break;
                    case 2:
                        addProduct(null);
                        break;
                    case 3:
                        System.out.println("Список складов: \n");
                        System.out.println(storageSet);
                        break;
                    case 4:
                        addStorage();
                        break;
                    case 5:
                        //TODO:
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

    public static void addProduct(String id){
        Scanner scanner = new Scanner(System.in);
        float price;

        System.out.print("Введите название продукта: ");
        String name = scanner.nextLine();

        while(true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите цену продукта: ");
            if (scanner1.hasNextFloat()) {
                price = scanner1.nextFloat();
                break;
            } else{
                System.out.println("Будьте внимательней! Введите дробное число (с запятой)!");
            }
        }

        while (true) {
            if (id.isEmpty()) {
                System.out.print("Введите номер продукта: ");
                id = scanner.next();
            }

            if (productSet.add(new Product(id, name, price))) {
                System.out.println("Добавление прошло удачно!");
                break;
            } else {
                System.out.println("Продукт с таким номером уже есть в списке!");
                id = null;

                System.out.print("Хотите исправить номер студенческого? (\"Д\" и Enter): ");
                String exit = scanner.nextLine();

                if (!((exit.equals("L")) || (exit.equals("l")) || (exit.equals("Д")) || (exit.equals("д")))) {
                    break;
                }
            }
        }

                //TODO  спрашивать про склад

    }

    public static void addStorage(){

    }
}
/*
Создадим 2 или 3 объекта Storage (склад)
Создадим цикл для ввода Product, после каждого создания объекта Product нужно запросить информацию на
какой склад добавить созданный объект.
Создадим метод поиска товаров на складе.
Дополнительный функционал
Добавить перемещение товара с одного склада на другой
Удаление товара со склада по идентификатору товара.

Добрый день, вы запустили программу складского учета.
Чтобы добавить товар введите: номер, название, цену (за кг, литр) товара и нажмите <enter>
Чтобы завершить ввод ведите пустую строку в качестве товара
Введите товар:
12344 Мандарины 120 р. <enter>
Укажите склад размещения товара (склад 1, склад 2):
склад 1 <enter>
Введите товар:
52341 Помидоры 99 р. <enter>
Укажите склад размещения товара (склад 1, склад 2):
склад 2 <enter>
<enter>
Для поиска товара введите его идентификатор и нажмите <enter>:
12344 <enter>
Остатки товара с номером 12344:
  Склад: склад 1
  Товар: Мандарины
  Цена: 120 р.
<enter>
Для поиска товара введите его идентификатор и нажмите <enter> (для выхода нажмите <enter>):
<enter>
Выход.
 */