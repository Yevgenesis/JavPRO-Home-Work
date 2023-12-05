package de.telran.homeWork.hw_10;

import java.util.Objects;

public class Manager {
    private int id;
    private String first_name;
    private String last_name;
    private int status;
    private String created_at;
    private String updated_at;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return id == manager.id;
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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public Manager() {
    }

    public Manager(int id, String first_name, String last_name, int status, String created_at, String updated_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
