package Netologia;

import java.util.Scanner;

class shablon {
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    String str = "";

    System.out.println("Задача: .");
    System.out.println("");

    System.out.print("Введите: ");   
    i = checkNumbers(scanner.nextLine()); 
    System.out.println(i);

    System.out.print("Введите: ");   
    str = scanner.nextLine();
    System.out.println(str);

    System.out.println("");    
    System.out.println("До свидания!");
  }

  public static int checkNumbers(String tempValue)
  {      
    if(tempValue.matches("[+]?\\d+"))
    {
      return Integer.parseInt(tempValue);
    }
    else
    {
      System.out.println("Вы ввели строку или отрицательное число! Значение будет присвоено по умолчанию!");
      return 0;
    }
  }
}