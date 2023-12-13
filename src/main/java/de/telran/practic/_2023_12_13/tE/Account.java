package de.telran.practic._2023_12_13.tE;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Account {
    private static int id = 1;
    private String accountNumber;
    private Country country;
    private Currency currency;
    private boolean isDebit;
    private double balance;

    public Account(Country country, Currency currency, boolean isDebit, double balance) {
        this.accountNumber = "acc" + id;
        id++;
        this.country = country;
        this.currency = currency;
        this.isDebit = isDebit;
        this.balance = balance;
    }
}

@Setter
@Getter
@AllArgsConstructor
class Bank {
    private Branch[] branches;
}

@Getter
@Setter
@AllArgsConstructor
class Branch {
    private String branchName;
    private Client[] clients;
}

@Getter
@Setter
@AllArgsConstructor
class Client {
    private String name;
    private String surName;
    private Account[] account;

    private Citezeship citizenship;
}

enum Country {
    USA,
    GERMANY,
    UKRAINE

}

enum Currency {
    USD,
    EURO

}

enum Citezeship {
    USA,
    GERMANY,
    UKRAINE
}
