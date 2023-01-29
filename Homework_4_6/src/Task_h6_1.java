//* 2. Создать массив (int[]) из 1000 случайных элементов от 0 до 24.
//* Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
//* в данном массиве и верните его в виде числа с плавающей запятой (double)
//* Для вычисления процента используйте формулу:
//* процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
public class Task_h6_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Random random = new Random(); // Object 'random' of class 'Random'
        for (int i = 0; i < 1000; i++) { // Fill array with 1000 random numbers from 0 to 24
            int a = random.nextInt(24);
            list1.add(a);
        }
        double unique_numbers = unique(list1);
        System.out.println("Unique numbers percent: " + unique_numbers);
    }

    private static Double unique(ArrayList<Integer> source) {
        int counter = 0;
        HashSet<Integer> newSet = new HashSet<>();
        for (int i = 0; i < source.size(); i++) {
            boolean add_flag = newSet.add(source.get(i));
            if (add_flag) {
                counter += 1;
            }
        }
        // System.out.println(newSet);
        double unique_internal = (counter * 100) / source.size();
        return unique_internal;
    }
    }
