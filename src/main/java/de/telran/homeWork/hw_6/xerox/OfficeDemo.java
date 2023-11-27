package de.telran.homeWork.hw_6.xerox;

import java.security.spec.RSAOtherPrimeInfo;
/*
У вас на работе стоит всего один принтер, который умеет сканировать и ксерокопировать. Реализуйте класс,
который позволит вам реализовать последовательный доступ сотрудников для выполнения вышеуказанных операций
на этом принтере.
*/
public class OfficeDemo {
    public static void main(String[] args) {
        officeMFP user1 = officeMFP.getInstance();
        officeMFP user2 = officeMFP.getInstance();

        user1.scanDocuments();
        user2.copyDocuments();

    }
}
