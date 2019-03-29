package Netologia.task_2_4.task_2_4_1;

public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book("Книга первая", "Автор неизестный", "нетология",
                                2019, 500);

        Book secondBook = new Book();

        secondBook.setNameBook("Book two");
        secondBook.setAuthorBook("Unknown author");
        secondBook.setPublishingHouse("netologiya");
        secondBook.setYearBook(2018);
        secondBook.setCountPages(100);

        Book thirdBook = new Book("Книга третья", "Автор неизестный", "нетология",
                                2016, 50);

        User reader = new User();
        reader.takeBook(firstBook);
        reader.returnBook(secondBook);
        reader.orderBook(thirdBook);

        User librarian = new User();
        librarian.bringBook(firstBook);
        librarian.takeBook(firstBook);
        librarian.returnBook(firstBook);

        User supplier = new User();
        supplier.orderBook(secondBook);
        supplier.takeBook(secondBook);

        User administrator = new User();
        administrator.issueBook(thirdBook);
        administrator.notificationDelayBook(thirdBook, supplier);
    }
}