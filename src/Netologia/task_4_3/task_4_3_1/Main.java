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

        printSet(set);
        
        while (!((input.equals("L")) || (input.equals("l")) || (input.equals("Д")) || (input.equals("д")))) {
            System.out.print("\nВведите информацию о студенте:\n ФИО: ");
            name = scanner.nextLine();
            System.out.print(" Номер группы: ");
            group = scanner.nextLine();
            
            while(true) {
                System.out.print(" Номер студенческого билета: ");
                studentId = scanner.nextLine();
                if (set.add(new Student(name, group, studentId))) {
                    System.out.println("Добавление студента прошло удачно!");
                    break;
                } else {
                    System.out.println("Такой номер студенческого уже существует!");

                    System.out.print("Хотите исправить номер студенческого? (\"Д\" и Enter): ");
                    input = scanner.nextLine();

                    if (!((input.equals("L")) || (input.equals("l")) || (input.equals("Д")) || (input.equals("д")))) {
                        break;
                    }
                }
            }

            System.out.print("Хотите завершить ввод? (для завершения, последовательно нажмите кнопку \"Д\" и Enter): ");
            input = scanner.nextLine();
        }

        printSet(set);

        System.out.println("\nДо свидания!");
    }
    
    public static void printSet(Set set){
        System.out.println("\nСписок студентов:");

        if (set.isEmpty()) {
            System.out.println("В списке нет студентов");
        } else {
            System.out.println(set.toString());
        }
    }
}
