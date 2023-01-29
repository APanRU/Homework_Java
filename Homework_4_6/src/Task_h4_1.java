//1. Реализовать консольное приложение, которое:
//* Принимает от пользователя строку вида
//* text~num
//* Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//* Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//* > first~1
//* > third~3
//* > print~1
//* < first
//* > print~2
//* < throw new IllegalArgumentException(); (напечатать, что такого элемента нет)

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class Task_h4_1 {
    public static void main(String[] args) throws IOException{
        LinkedList<String> text_list = new LinkedList<String>();
        text_list.add("first");
        text_list.add("second");
        text_list.add("third");
        text_list.add("fourth");
        text_list.add("fifth");
        System.out.println("Origin LinkedList: " + text_list);
        BufferedReader in_string = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your text");
        String s = in_string.readLine();
        String s_inner[] = s.split("~");
        Integer n1 = Integer.parseInt(s_inner[1]);
        if (s_inner[0].equals("print")){
            System.out.println(text_list.get(n1 - 1));
            text_list.remove(text_list.get(n1 - 1));
            System.out.println("Modified LinkedList: " + text_list);
        }
        else{
            text_list.add(n1 - 1, s_inner[0]);
            System.out.println("Modified LinkedList: " + text_list);
        }
        File my_File = new File("D:\\geekbrains\\Begin_Java\\Homework\\Homework_4_6\\my_File.txt");
        if (my_File.createNewFile()){

        }
        else{
            FileWriter new_write = new FileWriter(my_File);
            for (int i = 0; i < text_list.size(); i++) {
                new_write.write(text_list.get(i) + System.lineSeparator()); // Write data to .txt file to be used in Exercise002
            }
            new_write.close();
        }
    }
}
