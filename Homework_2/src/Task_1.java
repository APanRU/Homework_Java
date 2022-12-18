/*1. Напишите метод, который принимает на вход строку (String) и
 определяет является ли строка палиндромом (возвращает boolean значение).
 шалаш
 abcdedcba */

import java.util.Scanner;

public class Task_1 {
    public static boolean check () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово");
        String text = sc.nextLine();
        char[] strToArray = text.toCharArray();
        int i = 0;
        while (i < (strToArray.length / 2)){
            if (strToArray[i] == strToArray[strToArray.length - (i+1)]) {
                i = i + 1;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check());
    }
}