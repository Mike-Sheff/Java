package Netologia.task_2_2.task_2_2_1;

public class FromAvailableStatusMover extends BookMover {

    public FromAvailableStatusMover() {

    }

    @Override
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {

        switch (requestedStatus.name())
        {
            case "AVAILABLE":
                System.out.print("Книга уже находится в статусе: доступна! ");
                break;
            case "OVERDUED":
                System.out.print("Из текущего статуса нельзя перейти в статус: задержана! ");
                break;
            case "BORROWED":
                System.out.print("Книга перешла в статус: взята в пользование! ");
                book.setStatus(requestedStatus.name());
                break;
            case "ARCHIVED":
                System.out.print("Книга перешла в статус: в архиве! ");
                book.setStatus(requestedStatus.name());
                break;
        }
    }

}
