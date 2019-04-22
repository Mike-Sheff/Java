package Netologia.task_4_6.task_4_6_1;

/*
    @author Sharin Mikhail
*/
public class Contact {
    private final String name;
    private final String surname;
    private final String phone;
    private final Enum group;

    public Contact(String surname, String name, String phone, Enum group) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurmane() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Контакт : " + surname + " " + name +
                ", Телефон: " + phone +
                ", Группа: "  + group.toString() + "\n";
    }
}
