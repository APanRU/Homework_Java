/* Написать метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз; */

import java.util.Scanner;

public class Task_3 {
    static int method (int[] met) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int one = in.nextInt();
        return one;
    }

    static String method2 (String[] met2) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String two = in.nextLine();
        return two;
    }

    public static void main (String[] result) {
        int number = method(null);
        String text = method2(result);
        int i = 1;
        while (i <= number) {
            System.out.println(text);
            i = i +1;
        }
    }
}