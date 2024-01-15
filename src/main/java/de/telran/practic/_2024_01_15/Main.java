package de.telran.practic._2024_01_15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/java/de/telran/practic/_2024_01_15/report.txt";

        Handler handler = new Handler();

        try {
            FileReader file = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(file);
            String line;

            while ((line = reader.readLine()) != null) {
                handler.parseString(line);
            }

        } catch (Exception e) {
            System.out.println("Error reading or parsing JSON: " + e.getMessage());
        }
        handler.printProducts();

    }
}
