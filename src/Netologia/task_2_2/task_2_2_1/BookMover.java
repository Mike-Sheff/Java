package Netologia.task_2_2.task_2_2_1;

public class BookMover extends Book{

    public BookMover() {
        super();
    }

    protected void moveToStatus(Book book, StatusEnum requestedStatus) {
        throw new  IllegalStateException();
    }
}
