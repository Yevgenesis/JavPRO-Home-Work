package de.telran.practic.library.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Book {

    private String title;
    private String author;
    private int year;
    private Genre genre;
    @Setter
    private boolean isAvailable;

    @Override
    public String toString() {
        return "название: " + title +
                ", автор: " + author +
                ", год: " + year +
                ", жанр: " + genre +
                ", наличие книги: " + isAvailable;
    }
}
