package Netologia.task_2_1.task_2_1_3;

public class task_2_1_3 {
    public static void main(String[] args) {
        System.out.println("Задача: Считаем онлайн-пользователей.");
        System.out.println("");

        // считается автоматически внутри конструктора User
        new User("Петр", "Петров", "petr@mail.ru");

        new User("Сидор", "Сидоров", "sidor@mail.ru");

        new User("Иван", "Иванов", "ivan@mail.ru");


        System.out.println("Пользователей онлайн: " + User.totalOnline);
    }
}

