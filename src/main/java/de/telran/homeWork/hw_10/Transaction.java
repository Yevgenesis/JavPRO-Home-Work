package de.telran.homeWork.hw_10;

import java.util.Objects;

public class Transaction {
    private int id;
    private int debit_account_id;
    private int credit_account_id;
    private int type;
    private double amount;
    private String description;
    private String created_at;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDebit_account_id() {
        return debit_account_id;
    }

    public void setDebit_account_id(int debit_account_id) {
        this.debit_account_id = debit_account_id;
    }

    public int getCredit_account_id() {
        return credit_account_id;
    }

    public void setCredit_account_id(int credit_account_id) {
        this.credit_account_id = credit_account_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Transaction() {
    }

    public Transaction(int id, int debit_account_id, int credit_account_id, int type, double amount, String description, String created_at) {
        this.id = id;
        this.debit_account_id = debit_account_id;
        this.credit_account_id = credit_account_id;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.created_at = created_at;
    }
}
