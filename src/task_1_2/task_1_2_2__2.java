package Netologia.task_1_2;

import java.util.Scanner;

public class task_1_2_2__2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Y = 2019;       // year
        int M = 2;    // month (Jan = 1, Dec = 12)


        // months[i] = name of month i
        String[] months = {
                "",                               // leave empty so that months[1] = "January"
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };

        // days[i] = number of days in month i
        int[] days = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // check for leap year
        if (M == 2 && isLeapYear(Y)) days[M] = 29;


        // print calendar header
        System.out.println("   " + months[M] + " " + Y);
        System.out.println(" S  M Tu  W Th  F  S");

        // starting day
        int d = day(M, 1, Y);

        // print the calendar
        for (int i = 0; i < d; i++)
            System.out.print("   ");
        for (int i = 1; i <= days[M]; i++) {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[M])) System.out.println();
        }

    }


    public static int day(int M, int D, int Y) {
        int y = Y - (14 - M) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = M + 12 * ((14 - M) / 12) - 2;
        int d = (D + x + (31 * m) / 12) % 7;
        return d;
    }

    // return true if the given year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) return true;
        if (year % 400 == 0) return true;
        return false;
    }
}
