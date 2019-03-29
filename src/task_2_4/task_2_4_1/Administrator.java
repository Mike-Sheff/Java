package Netologia.task_2_4.task_2_4_1;

public interface Administrator {

    public void searchNameBook(Book book);
    public void searchAuthorBook(String authorBook);
    public void issueBook(Book book);
    public void notificationDelayBook(Book book, Reader reader);
}
