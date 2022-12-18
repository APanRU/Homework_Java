/* Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
в противном случае – false. */

import java.util.Scanner;

public class Task_1 {
    static boolean check (int array) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int one = in.nextInt();
        System.out.println("Введите второе число:");
        int two = in.nextInt();
        if (10 < (one + two) && (one + two) <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(check(0));
    }
}