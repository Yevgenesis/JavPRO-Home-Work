package de.telran.homeWork.hw_10;

import java.util.Objects;

public class Product {
    private int id;
    String name;
    private int status;
    private int currency_code;
    private double interest_rate;
    private int limit;
    private String created_at;
    private String updated_at;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(int currency_code) {
        this.currency_code = currency_code;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Product() {
    }

    public Product(int id, String name, int status, int currency_code, double interest_rate, int limit, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.currency_code = currency_code;
        this.interest_rate = interest_rate;
        this.limit = limit;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
