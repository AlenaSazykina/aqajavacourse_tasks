package org.example.javacircul;

import java.io.File;
import java.util.Scanner;

public class CProject {
    public static void main(String [] arg){
        int count = 0;
        while(true){
            String path = new Scanner (System.in).nextLine();
            if(fileExists(path)==true&&isDirectory(path)==false){
                System.out.println("Путь указан верно"); 
                count+=1;
                System.out.println("Это файл Номер " + count);
                continue;
            }
            else{
                System.out.println("Указанный файл не существует или указанный путь является путем к папке, а не путем к файлу");
            }
        }
        }

    private static boolean fileExists(String path){
        File file = new File(path);
        boolean fileExists = file.exists();
        return fileExists;
    }

    private static boolean isDirectory(String path){
        File file = new File(path);
        boolean isDirectory = file.isDirectory();
        return isDirectory;   
    }
}

После проверки существования
файла и того, что указанный путь является путём именно к файлу, а не к папке,
напишите код, который будет построчно читать указанный файл:

FileReader fileReader = new FileReader(path);
BufferedReader reader =
   new BufferedReader(fileReader);
String line;
while ((line = reader.readLine()) != null) {
   int length = line.length();
}
●     Поскольку в данном коде есть
целых два места, требующих обязательной обработки исключений, поместите этот
код внутрь конструкции try…catch, внутри которой пропишите обработку всех
исключений:

try {
   // code here
} catch (Exception ex) {
   ex.printStackTrace();
}
●     Для проверки кода используйте
файл реального
access-лога.

●     Допишите самостоятельно код
таким образом, чтобы он по итогам выполнения программы выводил:

общее количество строк в
файле;
длину самой длинной строки в файле;
длину самой короткой строки в файле
●   Допишите код таким образом, чтобы он прекращал своё выполнение (выбрасывал исключение) в случаях, если в файле встретилась строка длиннее 1024 символов. Создайте для данного исключения собственный класс исключения или объект класса RuntimeException, при создании которого в конструктор передайте понятное сообщение об ошибке.