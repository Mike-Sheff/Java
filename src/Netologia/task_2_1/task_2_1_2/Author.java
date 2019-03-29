package Netologia.task_2_1.task_2_1_2;

import java.util.Date;

public class Author {
    String nameAuthor;
    String surnameAuthor;
    String birthdayAuthor;
    String countryAuthor;

    public Author(String name, String surname, String birthday, String country) {
        this.nameAuthor = name;
        this.surnameAuthor = surname;
        this.birthdayAuthor = birthday;
        this.countryAuthor = country;
    }

    public String toString() {
        return "    Имя автора: " + nameAuthor + ", Фамилия автора: " + surnameAuthor + ", Дата рождения: " + birthdayAuthor + ", Страна: " + countryAuthor;
    }

    String autorPrint() {
        return "    Имя автора: " + nameAuthor + ", Фамилия автора: " + surnameAuthor + ", Дата рождения: " + birthdayAuthor + ", Страна: " + countryAuthor;
    }
}
