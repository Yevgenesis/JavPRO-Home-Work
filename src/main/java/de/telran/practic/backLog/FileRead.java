package de.telran.practic.backLog;

import java.io.*;


public class FileRead {
    /*
    Написать программу на Java, которая читает текст из
    .txt файла, преобразует каждую букву в верхний регистр и
    записывает результат в новый .txt файл.*/
    public static void main(String[] args) throws IOException {
//        String currentPath = System.getProperty("user.dir");

//        System.out.println(currentPath);
//        FileReader fileReader = new FileReader("222.txt");
        String path = "222.txt";

//        StringBuilder destFile = new StringBuilder();
//        int characters;
////        char characters;
//        while ((characters = fileReader.read()) != -1){
//
//
//            destFile.append(Character.toString(characters).toUpperCase());
//
//
//        }
//        System.out.println(destFile);

        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;
            while (bufferedReader.ready()) {
                string = bufferedReader.readLine();
//                System.out.println(string);


                FileOutputStream newFile = new FileOutputStream("newFile");
//            for (int i = 0; i < string.length(); i++) {
                newFile.write(string.toUpperCase().getBytes());
//            }
            }
            System.out.println("New file is ready");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.fillInStackTrace();
        }


    }

}
