package de.telran.homeWork.hw_10;

import java.util.Objects;

public class Agreement {
    private int id;
    private int account_id;
    private int product_id;
    private double interest_rate;
    private int status;
    private double sum;
    private String created_at;
    private String updated_at;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agreement agreement = (Agreement) o;
        return id == agreement.id;
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

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
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

    public Agreement() {
    }

    public Agreement(int id, int account_id, int product_id, double interest_rate, int status, double sum, String created_at, String updated_at) {
        this.id = id;
        this.account_id = account_id;
        this.product_id = product_id;
        this.interest_rate = interest_rate;
        this.status = status;
        this.sum = sum;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
