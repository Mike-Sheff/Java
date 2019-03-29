package Netologia.task_2_2.task_2_2_2;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> bookList;

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void filterBookByGenre(Genre genre) {
        for (Book book : bookList) {
            for (Genre genreFromBook : book.getGenres()) {
                if (genreFromBook.getAttributeOfGenre().equals(genre.getAttributeOfGenre())) {
                    if (genreFromBook.equals(genre)) {
                        System.out.println("Книга - " + book.getTitle() + " подходит под данный фильтр: жанр - " + genre.getGenreName());
                        break;
                    } else {
                        System.out.println("Книга - " + book.getTitle() + " не прошла фильтр: жанр - " + genre.getGenreName() + ", критерий - " +
                                genre.getAttributeOfGenre() + ", так как имеет жанр " +
                                genreFromBook.getGenreName());
                    }
                }
            }
        }
    }
}