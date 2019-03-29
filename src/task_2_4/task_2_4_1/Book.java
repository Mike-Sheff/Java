package Netologia.task_2_4.task_2_4_1;

public class Book {
    private String nameBook; // Название книги
    private String authorBook; // Автор книги
    private String publishingHouse; // издательство
    private int yearBook; // год издания книги
    private int countPages; // кол-во страниц

    public Book() {
    }

    public Book(String name, String author, String publishingHouse, int year, int countPages) {
        this.nameBook = name;
        this.authorBook = author;
        this.publishingHouse = publishingHouse;
        this.yearBook = year;
        this.countPages = countPages;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public void setPublishingHouse(String publishingHouse){
        this.publishingHouse = publishingHouse;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public String toString() {
        return "Название: " + nameBook + ", Автор: " + authorBook + ", Издательство: " + publishingHouse + ", Год издания: " + yearBook + ", Кол-во стр.: " + countPages;
    }
}
