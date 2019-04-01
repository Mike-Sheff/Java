package Netologia.task_4_1.task_4_1_2;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        String input = "";
        Employee emp;

        emp = new Employee("Петров", "Петр", "Петрович", 30, true,
                "среднее специальное", "водитель", "транспортный");
        list.add(emp);
        emp = new Employee("Сидорова", "Мария", "Сидоровна", 28, false,
                "высшее", "бухгалтер", "бухгалтерия");
        list.add(emp);
        emp = new Employee("Иванов", "Иван", "Иванович", 25, true,
                "среднее специальное", "водитель", "транспортный");
        list.add(emp);
        emp = new Employee("Семенчук", "Лидия", "Васильевна", 25, false,
                "высшее", "бухгалтер", "бухгалтерия");
        list.add(emp);

        System.out.println("Добавление данных в список сотрудников: ");
        while (!(("Д".equals(input)) || ("д".equals(input)) || ("L".equals(input)) || ("l".equals(input)))) {

            System.out.println();
            System.out.print("Введите фамилию сотрудника: ");
            String surname = scanner.nextLine();
            System.out.print("Введите имя сотрудника: ");
            String name = scanner.nextLine();
            System.out.print("Введите отчество сотрудника: ");
            String patronymic = scanner.nextLine();
            int age = 0;
            while (age <= 0) {
                System.out.print("Введите возраст сотрудника: ");
                try {
                    age = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException exp) {
                    System.out.println("Введите целое число и больше 0");
                }
            }
            String tmpSex = "";
            ArrayList<String> manSex = new ArrayList<>(Arrays.asList("M", "m", "V", "v", "М", "м",
                    "муж.", "Муж.", "Муж", "муж",
                    "МУЖ", "Мужю", "мужю", "мужской",
                    "Мужской", "МУЖСКОЙ", "МУЖЮ"));
            ArrayList<String> womanSex = new ArrayList<>(Arrays.asList(";", ":", "Ж", "ж", "Жен.",
                    "ЖЕН", "жен.", "женю", "Женю",
                    "женский", "Женский", "ЖЕНСКИЙ",
                    "Жен", "жен", "ЖЕНЮ", "ЖЕН."));
            boolean sex = true;
            while (tmpSex == "") {
                System.out.print("Введите пол сотрудника (М/Ж): ");
                tmpSex = scanner.nextLine();
                if (manSex.contains(tmpSex)) {
                    sex = true;
                } else if (womanSex.contains(tmpSex)) {
                    sex = false;
                } else {
                    tmpSex = "";
                }
            }
            System.out.print("Введите образование сотрудника: ");
            String education = scanner.nextLine();
            System.out.print("Введите должность сотрудника: ");
            String position = scanner.nextLine();
            System.out.print("Введите отдел сотрудника: ");
            String department = scanner.nextLine();

            emp = new Employee(surname, name, patronymic, age, sex, education, position, department);

            list.add(emp);

            System.out.print("Хотите завершить ввод? (для завершения, последовательно нажмите кнопку \"Д\" и Enter): ");
            input = scanner.nextLine();
            System.out.println();
        }

        System.out.println("Общий список данных сотрудников: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.format("%d. %s\n", i + 1, list.get(i).toString());
        }

        System.out.println("Исправление данных сотрудника(-ов): ");
        input = "";
        while (!(("Д".equals(input)) || ("д".equals(input)) || ("L".equals(input)) || ("l".equals(input)))) {

            System.out.print("Введите фамилию работника, для которого хотите изменить данные: ");
            String surname = scanner.nextLine();
            System.out.print("Введите имя работника, для которого хотите изменить данные: ");
            String name = scanner.nextLine();
            System.out.print("Введите отчество работника, для которого хотите изменить данные: ");
            String patronymic = scanner.nextLine();

            ArrayList<String> listAttributes = new ArrayList<>(Arrays.asList("фамилия", "имя", "отчество", "возраст",
                    "пол", "образование", "должность",
                    "отдел"));
            int empIndex = searchBySurname(surname, name, patronymic, list);
            if (empIndex != -1) {
                for (int i = 0; i < listAttributes.size(); i++) {

                    if (questionAttribute(listAttributes.get(i))) {
                        switch (i) {
                            case 0:
                                System.out.print("Введите правильная фамилия: ");
                                input = scanner.nextLine();
                                if (!input.equals(list.get(empIndex).getSurname())) {
                                    list.get(empIndex).setSurname(input);
                                }
                                break;
                            case 1:
                                System.out.print("Введите правильное имя: ");
                                input = scanner.nextLine();
                                if (!input.equals(list.get(empIndex).getName())) {
                                    list.get(empIndex).setName(input);
                                }
                                break;
                            case 2:
                                System.out.print("Введите правильное отчество: ");
                                input = scanner.nextLine();
                                if (!input.equals(list.get(empIndex).getPatronymic())) {
                                    list.get(empIndex).setPatronymic(input);
                                }
                                break;
                            case 5:
                                System.out.print("Введите правильное образование: ");
                                input = scanner.nextLine();
                                if (!input.equals(list.get(empIndex).getEducation())) {
                                    list.get(empIndex).setEducation(input);
                                }
                                break;
                            case 6:
                                System.out.print("Введите правильную должности: ");
                                input = scanner.nextLine();
                                if (!input.equals(list.get(empIndex).getPosition())) {
                                    list.get(empIndex).setPosition(input);
                                }
                                break;
                            case 7:
                                System.out.print("Введите правильный отдел: ");
                                input = scanner.nextLine();
                                if (!input.equals(list.get(empIndex).getDepartment())) {
                                    list.get(empIndex).setDepartment(input);
                                }
                                break;
                            case 3:
                                int age = 0;
                                while ((age <= 0) || (age == list.get(empIndex).getAge())) {
                                    System.out.print("Введите возраст сотрудника: ");
                                    try {
                                        age = Integer.parseInt(scanner.nextLine());
                                    } catch (NumberFormatException exp) {
                                        System.out.println("Введите целое число и больше 0");
                                    }
                                }
                                list.get(empIndex).setAge(age);
                                break;
                            case 4:
                                System.out.println("Пол автоматически исправлен на противоположный!");
                                list.get(empIndex).setSex(!list.get(empIndex).getSex());
                                break;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                System.out.format("Сотрудника %s %s %s - нет в списке!\n", surname, name, patronymic);
            }

            System.out.println();
            System.out.print("Хотите завершить исправления? (для завершения, последовательно нажмите кнопку \"Д\" и Enter): ");
            input = scanner.nextLine();
            System.out.println();
        }


        System.out.println("Общий список данных сотрудников: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.format("\n%d. %s", i + 1, list.get(i).toString());
        }
    }

    public static boolean questionAttribute(String nameAttribute) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!(("Д".equals(input)) || ("д".equals(input)) || ("L".equals(input)) || ("l".equals(input)) ||
                ("Н".equals(input)) || ("н".equals(input)) || ("Y".equals(input)) || ("y".equals(input)))) {

            System.out.format("Меняем %s? (Д/Н)", nameAttribute);
            input = scanner.nextLine();
        }
        if (("Д".equals(input)) || ("д".equals(input)) || ("L".equals(input)) || ("l".equals(input))) {
            return true;
        } else {
            return false;
        }
    }

    public static int searchBySurname(String surname, String name, String patronymic, List<Employee> list) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getSurname().equals(surname) &&
                    employee.getName().equals(name) &&
                    employee.getPatronymic().equals(patronymic)) {
                return list.indexOf(employee);
            }
        }
        return -1;
    }
}
