package Netologia.task_2_1.task_2_1_2;

import java.util.ArrayList;

public class User {
    String nameUser;
    String surnameUser;
    String emailUser;

    ArrayList<Book> listBookUser = new ArrayList<Book>();

    public User(String name, String surname, String email, Book book) {
        this.nameUser = name;
        this.surnameUser = surname;
        this.emailUser = email;
        this.listBookUser.add(book);
    }

    public String toString() {
        return "Имя пользователя:" + nameUser + ", Фамилия пользователя: " + surnameUser + ", E-mail: " + emailUser + ", " + toStringBook();
    }

    private String toStringBook() {
        String stringBooks = "";
        for (int i = 0; i < listBookUser.size(); i++)
            stringBooks += Book.toString(listBookUser.get(i));
        return stringBooks;
    }

    void userPrint() {
        System.out.printf("Имя пользователя: %s, Фамилия пользователя: %s, E-mail: %s %n", nameUser, surnameUser, emailUser);
        for (int i = 0; i < listBookUser.size(); i++)
            Book.bookPrint(listBookUser.get(i));
    }

    void addBook(Book book) {
        listBookUser.add(book);
    }
}
