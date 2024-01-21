package de.telran.homeWork.hw_20;

import java.util.regex.Pattern;

public class Main {
    /*
  Создать статический метод который принимает на вход три параметра:
login, password и confirmPassword.
Login должен содержать только латинские буквы, цифры и знак подчеркивания.
Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям,
необходимо выбросить WrongLoginException.
Password должен содержать только латинские буквы, цифры и знак подчеркивания.
Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
– один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
Обработка исключений проводится в вызывающем методе. Используем multi-catch block.
Метод возвращает true, если значения верны или false в другом случае.*/
    public static void main(String[] args) {

        boolean flag = registration("qwe_123", "123", "123");
        System.out.println(flag);
    }

    private static boolean registration(String login, String password, String confirmPassword) {
        try {
            String regEx = "\\w{1,20}";
            if (!Pattern.matches(regEx, login)) throw new WrongLoginException();
            if (!Pattern.matches(regEx, password) || !password.equals(confirmPassword))
                throw new WrongPasswordException();

        } catch (WrongLoginException le) {
            System.out.println("Wrong login! ");
            return false;
        } catch (WrongPasswordException pe) {
            System.out.println("Wrong password! ");
            return false;
        }
        return true;
    }
}
