/*Написать метод, которому в качестве параметра передается целое число. 
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. */

import java.util.Scanner;

public class Task_4 {
    static boolean check (int array) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int one = in.nextInt();
        if (one < 0) {
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