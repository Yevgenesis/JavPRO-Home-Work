package de.telran.homeWork.hw_18.fileCopy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
/*
    1. Написать приложение, которое будет копировать информацию из файла в другой файл.
Путь к существующему файлу и имя нового файла нужно вводить с клавиатуры.

*/
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine(); // Ввод имени исходного файла

        // Чтение файла
        FileReader file = new FileReader(fileName);
        StringBuilder fileData = new StringBuilder();
        int symbol;
        while ((symbol = file.read()) != -1) {
            fileData.append((char) symbol);
        }

        // Ввод имени нового файла и проверка существует ли такой файл
        String newFileName;
        File newFile;
        while (true) {
            System.out.println("Input new file name");
            newFileName = input.nextLine();
            newFile = new File(newFileName);
            if (!newFile.exists()) break;
            System.out.println("FileName is already exist!");
        }

        // Создание нового файла и запись в него информации из исходного файла
        FileWriter writer = new FileWriter(newFile);
        writer.write(fileData.toString());
        writer.close();
        System.out.println("File is created!");


    }
}
