package de.telran.practic.library;

import de.telran.practic.library.entity.Book;
import de.telran.practic.library.entity.Genre;
import de.telran.practic.library.entity.Library;
import de.telran.practic.library.entity.User;

public class Main {
    /*
Задание:
1) Создать свою репозиторию в гитхабе -> https://github.com/
2) перенести код с папки library проекта https://github.com/MoshkaBortmanStar/oop-lecture
3) Реализвать TODO (Обязательно методы ->  findBooksByTitle и removeUser в классе Library., остальное по желанию).
Хорошо бы сделать журнал в классе библиотека.
4) прислать мне ссылку на ВАШ проект в гите с дополненным кодом от вас (пункт 1), на платформе.
P.S. Если не получится создать проект, в гит и расшарить (поделиться им) его
(видимость проекта обязательно должна быть public), то можно прислать мне архив в дискорд.
 Тогда при выполнении задания на платформе, зафиксируйте, отправлен архив в дискорде.
 По вопросам можно обращаться ко мне в Discord -> moshkaborman
 */
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Принцесса марса", "Эдгар Берроуз", 1912, Genre.FANTASY, true));
        library.addBook(new Book("Боги марса", "Эдгар Берроуз", 1913, Genre.FANTASY, true));
        library.addBook(new Book("Владыка марса", "Эдгар Берроуз", 1913, Genre.FANTASY, true));

        User user1 = new User("Миша", "Михайлов", 20);
        library.registerUser(user1);
        Book book1 = library.findBook("Боги марса");

        library.giveBookToUser(user1, book1);
        library.acceptBookFromUser(user1, book1);

        System.out.println();
        System.out.println("Записи логов:");
        System.out.println(library.getLogger());
    }
}
