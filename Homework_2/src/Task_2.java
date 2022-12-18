/**
 * 2. Напишите метод, который определит тип (расширение) файлов из текущей папки
 * и выведет в консоль результат вида
 * 1 Расширение файла: txt
 * 2 Расширение файла: pdf
 * 3 Расширение файла: jpg
 * "\"C:\\Users\\Панкратовы\\Desktop\\1\""
 */

import java.io.File;

public class Task_2 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Панкратовы\\Desktop\\1");
        File[] files = dir.listFiles();
        for (File file : files) {
//            System.out.println(file);
            String name = file.getName();
//            System.out.println(name);
            int index = name.lastIndexOf(".");
//            System.out.println(index);
            String extension = name.substring(index + 1, name.length());
            System.out.printf("Расширение файла %s => %s\n", name, extension);
        }
    }

}
