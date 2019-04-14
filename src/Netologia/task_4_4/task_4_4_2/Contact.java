package Netologia.task_4_4.task_4_4_2;

import java.util.Objects;

public class Contact{
    private String surname;
    private String name;
    private String number;

    public Contact(String surname, String name, String number) {
        this.surname = surname;
        this.name = name;
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(surname, contact.surname) &&
                Objects.equals(name, contact.name) &&
                Objects.equals(number, contact.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, number);
    }

    @Override
    public String toString() {
        return "\nФамилия: " + surname +
                ", Имя: " + name +
                ", Номер телефона: " + number;
    }
}
