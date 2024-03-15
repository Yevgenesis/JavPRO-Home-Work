package de.telran.practic.backLog.test2;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book implements Cloneable {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }


    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
