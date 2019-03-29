package Netologia.task_2_2.task_2_2_1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача:  Иерархия “Статусы книг”.");
        System.out.println("");

        Book book = new Book("The Lord of the Rings");

        BookMover fromStatusMover = new FromAvailableStatusMover();
        System.out.println("Первоначальный статус: " + book.getStatus());
        System.out.println("-------------------------------------");

        fromStatusMover.moveToStatus(book, StatusEnum.AVAILABLE);
        System.out.println(book.getStatus());
        fromStatusMover.moveToStatus(book, StatusEnum.OVERDUED);
        System.out.println(book.getStatus());
        fromStatusMover.moveToStatus(book, StatusEnum.BORROWED);
        System.out.println(book.getStatus());
        System.out.println("-------------------------------------");

        fromStatusMover = new FromBorrowedStatusMover();
        fromStatusMover.moveToStatus(book, StatusEnum.BORROWED);
        System.out.println(book.getStatus());
        fromStatusMover.moveToStatus(book, StatusEnum.OVERDUED);
        System.out.println(book.getStatus());
        System.out.println("-------------------------------------");

        fromStatusMover = new FromOverduedStatusMover();
        fromStatusMover.moveToStatus(book, StatusEnum.OVERDUED);
        System.out.println(book.getStatus());
        fromStatusMover.moveToStatus(book, StatusEnum.BORROWED);
        System.out.println(book.getStatus());
        fromStatusMover.moveToStatus(book, StatusEnum.ARCHIVED);
        System.out.println(book.getStatus());
        System.out.println("-------------------------------------");

        fromStatusMover = new FromArchievedStatusMover();
        fromStatusMover.moveToStatus(book, StatusEnum.ARCHIVED);
        System.out.println(book.getStatus());
        fromStatusMover.moveToStatus(book, StatusEnum.BORROWED);
        System.out.println(book.getStatus());
        fromStatusMover.moveToStatus(book, StatusEnum.AVAILABLE);
        System.out.println(book.getStatus());

        System.out.println("");
        System.out.println("До свидания!");
    }
}
