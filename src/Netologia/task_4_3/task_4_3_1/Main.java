package task_4_3.task_4_3_1;

import Netologia.task_4_3.task_4_3_1.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Set<Student> set = new HashSet<>();
        String name;
        String group;
        String studentId;

        System.out.println("Задача: Список студентов.");

        set.add(new Student("Иванов Петр Николаевич", "1243-Б", "31231343"));
        set.add(new Student("Иванов Петр Николаевич", "1243-Б", "31231343")); // не добавится
        set.add(new Student("Петров Иван Николаевич", "1244-Б", "31231343")); // не добавится
        set.add(new Student("Петрова Татьяна Михайловна", "1243-Б", "43221343"));
        set.add(new Student("Иванов Петр Николаевич", "1243-Б", "31231344")); // добавится


        while (!((input.equals("L")) || (input.equals("l")) || (input.equals("Д")) || (input.equals("д")))) {
            System.out.print("\nВведите информацию о студенте:\n ФИО: ");
            name = scanner.nextLine();
            System.out.print(" Номер группы: ");
            group = scanner.nextLine();
            //        studentId = "";

            //          while(studentId.equals("")) {
            System.out.print(" Номер студенческого билета: ");
            studentId = scanner.nextLine();
            //TODO: проверку на наличие данного билета в массиве и выдавать возможность введение заново номера билета
            /*if (set.equals(studentId)) {
                    System.out.println("Такой номер студенческого уже существует!");
                    studentId = "";
                } else {

                    break;
                }
            }*/

            set.add(new Student(name, group, studentId));

            System.out.print("Хотите завершить ввод? (для завершения, последовательно нажмите кнопку \"Д\" и Enter): ");
            input = scanner.nextLine();
        }

        System.out.println("\nСписок студентов:");

        if (set.isEmpty()) {
            System.out.println("В списке нет студентов");
        } else {
            System.out.println(set.toString());
        }

        System.out.println("\nДо свидания!");
    }
}