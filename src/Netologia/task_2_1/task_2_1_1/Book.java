package Netologia.task_2_1.task_2_1_1;

public class Book {
    String nameBook; // Название книги
    String authorBook; // Автор книги
    String publishingHouse; // издательство
    int yearBook; // год издания книги
    int countPages; // кол-во страниц
    int currentPage; // текущая страница

    public Book() {
    }

    public Book(String name, String author, String publishingHouse, int year, int countPages) {
        this.nameBook = name;
        this.authorBook = author;
        this.publishingHouse = publishingHouse;
        this.yearBook = year;
        this.countPages = countPages;
        this.currentPage = 1;
    }

    // перевернуть страницу на определенное кол-во
    int turnPageCount(int countTurnPages) {
        // если перевернутое кол-во стр. от текущей (в любую сторону) вошел в диапозон от начала книги до последней стр.
        if (((currentPage + countTurnPages) <= countPages) && ((currentPage + countTurnPages) >= 1)) {
            return currentPage = (currentPage + countTurnPages);
        } else {
            return currentPage = currentPage;
        }
    }

    int turnPage(int page) {
        return currentPage = page;
    }

    // получения номера следующей страницы
    int turnPageForward() {
        if (currentPage < countPages) {
            return ++currentPage;
        } else {
            return currentPage;
        }
    }

    // получения номера предыдущей страницы
    int turnPageBack() {
        if (currentPage > 1) {
            return currentPage--;
        } else {
            return currentPage;
        }
    }

    public String toString() {
        return "Название: " + nameBook + ", Автор: " + authorBook + ", Издательство: " + publishingHouse + ", Год издания: " + yearBook + ", Кол-во стр.: " + countPages + ", Текущая стр.: " + currentPage;
    }

    void printInfoBook() {
        System.out.printf("Название: %s, Автор: %s, Издательство: %s, Год издания: %d, Кол-во стр.: %d, Текущая стр.: %d %n", nameBook, authorBook, publishingHouse, yearBook, countPages, currentPage);
    }
}