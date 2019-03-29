package Netologia.task_2_2.task_2_2_1;

public class FromArchievedStatusMover extends BookMover{
    public FromArchievedStatusMover() {
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
                System.out.print("Из текущего статуса нельзя перейти в статус: задержана! ");
                break;
            case "BORROWED":
                System.out.print("Из текущего статуса нельзя перейти в статус: взята в пользование! ");
                break;
            case "ARCHIVED":
                System.out.print("Книга уже находится в статусе: в архиве! ");
                break;
        }
    }
}
