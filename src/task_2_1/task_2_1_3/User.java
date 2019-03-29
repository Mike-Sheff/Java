package Netologia.task_2_1.task_2_1_3;

public class User {
    static int totalOnline = 0;
    String nameUser;
    String surnameUser;
    String emailUser;

    public User() {
        this.totalOnline++;
    }

    public User(String name, String surname, String email) {
        this();
        this.nameUser = name;
        this.surnameUser = surname;
        this.emailUser = email;
    }
}