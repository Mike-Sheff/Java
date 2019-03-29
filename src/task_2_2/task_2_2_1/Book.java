package Netologia.task_2_2.task_2_2_1;

public class Book {
    private String title;
    private String status;

    public Book(String title){
        this.title =  title;
        this.status = StatusEnum.AVAILABLE.name();
    }
    public Book(){
        this("wrw ");
    }

    public String getStatus(){

        return this.status;
    }

    public String getTitle() {
        return title;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
