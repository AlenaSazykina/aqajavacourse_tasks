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
