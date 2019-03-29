package Netologia.task_1_1;

import java.util.Scanner;
import java.util.Arrays;

public class task_1_1_3 {
  public static final String[] MASS_STRING_LOGIN = {"admin", "user", "User"};
  public static final String[] MASS_STRING_PASSWORD = {"123", "qwe", "asd"};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputLogin = "";
    String inputPassword = "";
    String tempPassword = "";

    System.out.println("Для аутентификации пользователя");
    System.out.print("Введите логин: ");

    inputLogin = scanner.nextLine();

    System.out.print("Введите пароль: ");

    inputPassword = scanner.nextLine();

    tempPassword = MASS_STRING_PASSWORD[Arrays.asList(MASS_STRING_LOGIN).indexOf(inputLogin)];

    if (Arrays.asList(MASS_STRING_LOGIN).contains(inputLogin) && (inputPassword.equals(tempPassword))) {
      System.out.println("");
      System.out.println("Добро пожаловать, " + inputLogin + "!");
    } else {
      System.out.println("");
      System.out.println("Неверный логин или пароль2!");
    }

    System.out.println("");
    System.out.println("До свидания!");
  }
}
