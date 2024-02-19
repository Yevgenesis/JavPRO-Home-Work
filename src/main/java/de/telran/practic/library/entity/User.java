package de.telran.practic.library.entity;

import lombok.Getter;

import java.util.ArrayList;

public class User {

    private static int userCount;
    @Getter
    private final int id;
    private final String name;
    private final String lastName;
    private final int age;


    private ArrayList<Book> books;

    public User(String name, String lastName, int age) {
        userCount++;
        this.id = userCount;
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }


    public void borrowBook(Book book) {
        if (books == null) {
            books = new ArrayList<>();
        }

        if (book.isAvailable()) {
            books.add(book);
            book.setAvailable(false);

//            System.out.println("Читатель: "+this.name+" взял почитать книгу " + book);

        } else {
            System.out.println(book.getTitle() + "Книга недоступна");
        }
    }

    public boolean returnBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            book.setAvailable(true);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

}
