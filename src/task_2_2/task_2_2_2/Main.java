package Netologia.task_2_2.task_2_2_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача:  Иерархия “Жанры книг”.");
        System.out.println("");

        BookService bookService = new BookService();
        Book book = new Book("Lord of the Rings", Arrays.<Genre>asList(new StoryGenre(), new ProseGenre(), new FantasticGenre()));
        bookService.setBookList(Arrays.asList(book));

        bookService.filterBookByGenre(new StoryGenre());
        bookService.filterBookByGenre(new NarrativeGenre());

        bookService.filterBookByGenre(new ProseGenre());
        bookService.filterBookByGenre(new VerseGenre());

        bookService.filterBookByGenre(new FantasticGenre());
        bookService.filterBookByGenre(new ProfessionalGenre());

        System.out.println("");
        System.out.println("До свидания!");
    }
}
