package de.telran.homeWork.hw_6.xerox;

public class officeMFP {
    private static boolean isMfpBusy;

    private static officeMFP instance;

    private officeMFP() {
    }

    public static officeMFP getInstance() {
        if (instance == null) {
            instance = new officeMFP();
        }
        return instance;
    }

    public void printDocuments() {
        if (!isMfpBusy) {
            isMfpBusy = true;
            System.out.println("Start printing documents");
            // идёт печать документов
            System.out.println("Stop printing documents");
            isMfpBusy = false;
        } else {
            System.out.println("MFP is busy! wait please");

        }
    }

    public void copyDocuments() {
        if (!isMfpBusy) {
            isMfpBusy = true;
            System.out.println("Start copying documents");
            // идёт копирование документов
            System.out.println("Stop copying documents");
            isMfpBusy = false;
        } else {
            System.out.println("MFP is busy! wait please");

        }
    }


    public void scanDocuments() {
        if (!isMfpBusy) {
            isMfpBusy = true;
            System.out.println("Start scanning documents");
            // идёт сканирование документов
            System.out.println("Stop scanning documents");
            isMfpBusy = false;
        } else {
            System.out.println("MFP is busy! wait please");

        }
    }

}
