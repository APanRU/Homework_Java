/* Написать метод, которому в качестве параметра передается целое число, 
метод должен напечатать в консоль, положительное ли число передали или отрицательное. 
Замечание: ноль считаем положительным числом. */

import java.util.Scanner;

public class Task_2 {
    public static void main (String[] a) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int one = in.nextInt();
        if (one < 0){
            System.out.print("Отрицательное");
        }
        else {
            System.out.print("Положительное");
        }
    }

}