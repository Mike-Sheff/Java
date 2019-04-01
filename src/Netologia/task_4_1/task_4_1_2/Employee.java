package Netologia.task_4_1.task_4_1_2;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int age;
    private boolean sex;
    private String education;
    private String position;
    private String department;

    public Employee(String surname, String name, String patronymic, int age, boolean sex, String education, String position, String department) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.sex = sex;
        this.education = education;
        this.position = position;
        this.department = department;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex =  sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Ф.И.О.= " + surname + " " + name + " " + patronymic + " , возраст= " + age + " , пол= " + ((sex)? "М":"Ж")+
                " , образование= " + education + " , должность= " + position + ", отдел = " + department;
    }
}