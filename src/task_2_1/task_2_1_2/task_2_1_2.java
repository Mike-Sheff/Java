package Netologia.task_2_1.task_2_1_2;

import java.util.Date;

public class task_2_1_2 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Задача: Учетная запись пользователя.");
        System.out.println("");

        Author author1 = new Author("Николай", "Гоголь", "20.03.1809", "Украина");
        Author author2 = new Author("Лев", "Толстой", "09.09.1828", "Российская империя");
        Author author3 = new Author("Михаил", "Лермонтов", "15.10.1814", "Российская империя");

        Book book1Author1 = new Book(author1, "Мертвые души", 207, 1842);

        Book book1Author2 = new Book(author2, "Война и мир", 1000, 1865);
        Book book2Author2 = new Book(author2, "Анна Каренина", 1000, 1873);

        Book book1Author3 = new Book(author3, "Герой нашего времени", 423, 1840);

        User userPetr = new User("Петр", "Петров", "petr@mail.ru", book1Author2);
        userPetr.addBook(book2Author2);
        userPetr.addBook(book1Author3);

        System.out.print(userPetr.toString());  // вместо userPetr.userPrint();

        System.out.println("");

        User userSidor = new User("Сидор", "Сидоров", "sidor@mail.ru", book1Author1);
        userSidor.addBook(book1Author3);

        System.out.print(userSidor); //вместо userSidor.userPrint();

        System.out.printf("%n%n");
        System.out.println("До свидания!");
    }
}