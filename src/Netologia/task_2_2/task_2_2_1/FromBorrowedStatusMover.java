package Netologia.task_2_2.task_2_2_1;

public class FromBorrowedStatusMover extends BookMover{
    public FromBorrowedStatusMover() {

    }

    @Override
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {

        switch (requestedStatus.name())
        {
            case "AVAILABLE":
                System.out.print("Книга перешла в статус: доступна! ");
                book.setStatus(requestedStatus.name());
                break;
            case "OVERDUED":
                System.out.print("Перейти в статус: задержана! ");
                book.setStatus(requestedStatus.name());
                break;
            case "BORROWED":
                System.out.print("Книга уже находится в статусе: взята в пользование! ");
                break;
            case "ARCHIVED":
                System.out.print("Книга перешла в статус: в архиве! ");
                book.setStatus(requestedStatus.name());
                break;
        }
    }
}
