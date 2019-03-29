package Netologia.task_2_1.task_2_1_2;

public class Book {
    String nameBook;
    int pagesBook;
    int yearBook;

    Author authorBook;

    public Book(Author author, String name, int pages, int year) {
        this.authorBook = author;
        this.nameBook = name;
        this.pagesBook = pages;
        this.yearBook = year;
    }

    static public String toString(Book book) {
        return book.authorBook.toString() + ", Название книги: " + book.nameBook + ", Кол-во страниц: " + book.pagesBook + ", Год издания: " + book.yearBook;
    }

    static void bookPrint(Book book) {
        System.out.printf(" %s, Название книги: %s, Кол-во страниц: %d, Год издания: %d %n", book.authorBook.autorPrint(), book.nameBook, book.pagesBook, book.yearBook);
    }
}