package de.telran.practic._2023_12_13.tE;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class Generator {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    public static Currency getCurrency() {
        Currency[] currencies = Currency.values();
        return currencies[RANDOM.nextInt(currencies.length)];
    }

    public static Citezeship getCitezeship() {
        Citezeship[] citezeships = Citezeship.values();
        return citezeships[RANDOM.nextInt(citezeships.length)];
    }

    public static Country getCountry() {
        Country[] countries = Country.values();
        return countries[RANDOM.nextInt(countries.length)];
    }

    public static Account getAccount() {
        Country country = getCountry();
        Currency currency = getCurrency();
        boolean isDebit = RANDOM.nextBoolean();
        double balance = RANDOM.nextDouble();

        return new Account(country, currency, isDebit, balance);
    }

    public static Client getClient() {
        String name = FAKER.name().firstName();
        String surName = FAKER.name().lastName();

        int quantity = RANDOM.nextInt(4) + 1;
        Account[] account = new Account[quantity];
        for (int i = 0; i < quantity; i++) {
            account[i] = getAccount();
        }

        Citezeship citizenship = getCitezeship();

        return new Client(name, surName, account, citizenship);
    }

    public static Branch getBranch() {
        String branchName = FAKER.funnyName().name();

        int quantity = RANDOM.nextInt(4) + 1;
        Client[] clients = new Client[quantity];
        for (int i = 0; i < quantity; i++) {
            clients[i] = getClient();
        }


        clients[0] = getClient();
        return new Branch(branchName, clients);
    }

    public static Bank getBank() {

        int quantity = RANDOM.nextInt(4) + 1;
        Branch[] branches = new Branch[quantity];
        for (int i = 0; i < quantity; i++) {
            branches[i] = getBranch();
        }
        return new Bank(branches);
    }
}
