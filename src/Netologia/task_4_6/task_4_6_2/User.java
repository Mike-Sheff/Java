package Netologia.task_4_6.task_4_6_2;
/*
    @author Sharin Mikhail
*/

public class User {
    String id;
    String surname;
    String name;
    String patronymic;
    String address;

    public User(String id, String surname, String name, String patronymic, String address) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
    }

    @Override
    public String toString() {
        return " ФИО: " + surname + " " + name + " " + patronymic +
                "\n Адресс: " + address;
    }
}

