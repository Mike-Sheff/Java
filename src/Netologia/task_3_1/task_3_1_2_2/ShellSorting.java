package Netologia.task_3_1.task_3_1_2_2;

public class ShellSorting {
    public static int[] shellSorting(int[] array) {
        int h = 1;
        int n = array.length;
        while (h < n / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
            h = h / 3;
        }
        return array;
    }
}
