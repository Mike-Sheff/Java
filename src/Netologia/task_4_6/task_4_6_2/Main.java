package Netologia.task_4_6.task_4_6_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static final String PATH_USER_DB = "C:\\Users\\Mike\\Downloads\\Study\\Java\\src\\Netologia\\task_4_6\\task_4_6_2\\user.db";
    public static final String PATH_SERVER_LOG = "C:\\Users\\Mike\\Downloads\\Study\\Java\\src\\Netologia\\task_4_6\\task_4_6_2\\server.log";

    public static TreeMap<String, User> userTreeMap = new TreeMap<>();
    public static HashMap<String, Set<String>> userIpHashMap = new HashMap<>();
    public static HashMap<String, Integer> serverLogHashMap = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Задача: Найти взломщика.\n");

        FileReaderUser(PATH_USER_DB);

        FileReaderServerLog(PATH_SERVER_LOG);
        int maxCount = 0;
        String villanIp = "";


        for (Map.Entry<String, Integer> e : serverLogHashMap.entrySet()) {
            if (maxCount < e.getValue()) {
                maxCount = e.getValue();
                villanIp = e.getKey();
            }
        }

        String villainId = "";
        for (Map.Entry<String, Set<String>> e : userIpHashMap.entrySet()) {
            if ((e.getValue()).contains(villanIp)) {
                villainId = e.getKey();
            }
        }

        System.out.println("\nПредпологаемый злоумышленник:");
        System.out.println(userTreeMap.ceilingEntry(villainId).getValue().toString());
        System.out.println(" Количество входов: " + maxCount);

        System.out.println("\nДо свидания!");
    }

    public static void FileReaderUser(String path) {
        //Создаем объекта файл
        File file = new File(path);

        //Создаем scanner для чтения из файла
        Scanner scanner = null;

        try {
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // пропускаем первую строку с названием полей
            scanner.nextLine();

            //Построчно читаем файл в цикле, пока файл не закончится
            while (scanner.hasNextLine()) {
                Set<String> set = new HashSet<>();
                String line = scanner.nextLine();
                String[] massLine = line.split(";");
                String[] massFio = massLine[2].split(" ");
                User user = new User(massLine[1], massFio[0], massFio[1], massFio[2], massLine[3]);

                userTreeMap.put(massLine[1], user);
                if (userIpHashMap.get(massLine[1]) != null) {
                    set = userIpHashMap.remove(massLine[1]);
                }
                set.add(massLine[0]);
                userIpHashMap.put(massLine[1], set);
            }
            System.out.println("Файл " + file.getName() + " прочитан.");
        } catch (Exception exp) {
            System.out.println("Произошла ошибка: ");
            exp.printStackTrace();
        }

        //Закрываем scanner после чтения, для освобождения файла и ресурсов
        scanner.close();
    }

    public static void FileReaderServerLog(String path) throws FileNotFoundException {
        //Создаем объекта файл
        File file = new File(path);


        //Создаем scanner для чтения из файла
        Scanner scanner = new Scanner(file);
        try {
            //Построчно читаем файл в цикле, пока файл не закончится
            while (scanner.hasNextLine()) {
                int i = 1;
                String line = scanner.nextLine();
                String[] massLine = line.split(":");
                if (serverLogHashMap.get(massLine[0]) != null) {
                    i = serverLogHashMap.remove(massLine[0]);
                    i++;
                }
                serverLogHashMap.put(massLine[0], i);
            }

            System.out.println("Файл " + file.getName() + " прочитан.");
        } catch (Exception exp) {
            System.out.println("Произошла ошибка: ");
            exp.printStackTrace();
        }

        //Закрываем scanner после чтения, для освобождения файла и ресурсов
        scanner.close();
    }
}