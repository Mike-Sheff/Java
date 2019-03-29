package Netologia.task_1_1;

import java.util.Scanner;

class task_1_1_3__2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String Login = "admin";
    String Password = "123";

    System.out.println("Для аутентификации пользователя");
    System.out.print("Введите логин: ");

    String inputLogin = scanner.nextLine();

    System.out.print("Введите пароль: ");

    String inputPassword = scanner.nextLine();


    if ((inputLogin.equals(Login)) && (inputPassword.equals(Password))) {
      System.out.println("");
      System.out.println("Добро пожаловать, " + inputLogin + "!");
    } else {
      System.out.println("");
      System.out.println("Неверный логин или пароль!");
    }
  }
}