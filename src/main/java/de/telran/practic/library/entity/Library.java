package de.telran.practic.library.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private final ArrayList<Book> books;
    private final Map<Integer, User> users;
    private final StringBuilder logger = new StringBuilder();

    public Library() {
        books = new ArrayList<>();
        users = new HashMap<>();
    }

    public String getLogger() {
        return logger.toString();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга \"" + book.getTitle() + "\" добавлена в библиотеку ");
    }

    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Кинага \"" + book.getTitle() + "\" удалена ");
        } else {
            System.out.println("Книги нет у нас !!!");
        }
    }


    public void registerUser(User user) {
        if (users.containsKey(user.getId())) {
            System.out.println("Пользователь уже есть с таким айди" + user.getName());
        } else {
            users.put(user.getId(), user);
        }
    }

    public void removeUser(User user) {
        if (users.containsKey(user.getId())) {
            System.out.println("Нет такого пользователя с id:" + user.getId());
        }
        users.remove(user.getId());
        System.out.println("Пользователя с id:" + user.getId() + " удалён!");
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Книга \"" + title + "\" найдена в библиотеке");
                return book;
            }
        }
        System.out.println("Книги \"" + title + "\" нет в нашей библиотеки");
        return null;
    }


    public void giveBookToUser(User user, Book book) {
        if (!users.containsKey(user.getId())) {
            System.out.println("Пользователь не зарегистрирован и не может брать книги ");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Книга не доступна в данный момент! ");
            return;
        }
        user.borrowBook(book);
        book.setAvailable(false);

        logger.append("get book:").append("user_id:").append(user.getId()).append(", book: ").append(book).append("\n");

        System.out.printf("%s взял почитать книгу: \"%s, %d, жанр: %S\"\n", user.getName(), book.getTitle(), book.getYear(), book.getGenre());
    }

    public void acceptBookFromUser(User user, Book book) {
        if (user.returnBook(book)) {
            books.remove(book);
            book.setAvailable(true);

            System.out.printf("%s вернул книгу: \"%s, %d, жанр: %S\"\n", user.getName(), book.getTitle(), book.getYear(), book.getGenre());
            logger.append("return book:").append("user_id:").append(user.getId()).append(", book: ").append(book).append("\n");

        } else {
            System.out.println(user.getName() + "не брал эту книгу: " + book);
        }
    }
}
