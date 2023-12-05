package de.telran.homeWork.hw_8.arrayListTasks;

import java.util.*;

public class Main {
    /*
    a)
    Найти сумму всех элементов ArrayList.
    Найти среднее значение элементов LinkedList.
    Перебрать ArrayList и вывести все элементы на экран.
    Перебрать LinkedList и найти самую длинную строку.
    Создать ArrayList с объектами вашего собственного класса и вывести их на экран.


    b)
    Перебрать ArrayList и найти наименьший элемент.
    Перебрать LinkedList и найти наибольший элемент.
    Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
    Перебрать LinkedList и найти первое вхождение определенной строки.
    Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.


    c)
    Перебрать ArrayList и удалить все четные числа.
    Перебрать LinkedList и заменить все элементы, кратные 3, на нули.
    Перебрать ArrayList и объединить все элементы в одну строку.
    Перебрать LinkedList и удалить все элементы, содержащие определенную подстроку.
    Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.


    d)
    Перебрать ArrayList и найти сумму квадратов всех элементов.
    Перебрать LinkedList и вычислить произведение всех элементов.
    Перебрать ArrayList и найти самую короткую строку.
    Перебрать LinkedList и заменить все гласные буквы в каждой строке на символ '*'.
    Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.


    e)
    Перебрать ArrayList и найти второй по величине элемент.
    Перебрать LinkedList и вывести все элементы в обратном порядке.
    Перебрать ArrayList и вывести все строки, содержащие только буквы.
    Перебрать LinkedList и найти самую длинную строку, не содержащую пробелов.
    Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.


    f)
    Перебрать ArrayList и найти наибольшую возрастающую последовательность элементов.
    Перебрать LinkedList и удалить все дубликаты элементов.
    Перебрать ArrayList и создать новый список, содержащий только уникальные строки.
    Перебрать LinkedList и объединить все строки в одну с использованием разделителя.
    Создать LinkedList с объектами вашего собственного класса и отсортировать их по нескольким критериям.
    */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 2, 3, 3, 5, 6, 7, 8));
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(12, 234, 4, 87, 90));
        ArrayList<String> arrayStrList = new ArrayList<>(Arrays.asList("one", "two", "three", "an", "four", "five"));
        LinkedList<String> linkedStrList = new LinkedList<>(Arrays.asList("hi", "hola", "hello", "Привет"));


//    Найти сумму всех элементов ArrayList.
        int sum = 0;
        for (int el : arrayList) {
            sum += el;
        }
        System.out.println("Сумма всех элементов: " + sum);

//    Найти среднее значение элементов LinkedList.
        sum = 0;
        for (int el : linkedList) {
            sum += el;
        }
        System.out.println("Среднее значение: " + sum / linkedList.size());

//    Перебрать ArrayList и вывести все элементы на экран.
        for (int el : arrayList) {
            System.out.print(el + ", ");
        }
        System.out.println();


//    Перебрать LinkedList и найти самую длинную строку.
        String maxLenString = linkedStrList.get(0);
        for (String word : linkedStrList) {
            if (maxLenString.length() < word.length()) maxLenString = word;
        }
        System.out.println("Самая длинная строка: " + maxLenString);


//   Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
        ArrayList<MyClass> myClasses = new ArrayList<>();
        myClasses.add(new MyClass("one"));
        myClasses.add(new MyClass("two"));
        myClasses.add(new MyClass("three"));

        for (MyClass aClass : myClasses) {
            System.out.println(aClass);
        }

//    Перебрать ArrayList и найти наименьший элемент.
        int minElement = arrayList.get(0);
        for (int el : arrayList) {
            minElement = Math.min(el, minElement);
        }
        System.out.println("Наименьший элемент: " + minElement);

//    Перебрать LinkedList и найти наибольший элемент.
        int maxElement = linkedList.get(0);
        for (int el : linkedList) {
            maxElement = Math.max(el, maxElement);
        }
        System.out.println("Наибольший элемент: " + maxElement);

//    Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
        char symbol = 't';
        int charCount = 0;
        for (String word : arrayStrList) {
            char tempChar = word.toLowerCase().charAt(0);
            if (symbol == tempChar) charCount++;
        }
        System.out.println("Количество элементов, начинающихся с буквы '" + symbol + "' = " + charCount);


//    Перебрать LinkedList и найти первое вхождение определенной строки.
        String subStr = "lo";
        for (String word : linkedStrList) {
            if (word.contains(subStr)) {
                System.out.println("В слове'" + word + "' содержится подстрока '" + subStr + "', начинается с индекса: " + word.indexOf(subStr));
                break;
            }
        }

//    Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
        LinkedList<MyClass> myLinkedListClasses = new LinkedList<>();
        myLinkedListClasses.add(new MyClass(25));
        myLinkedListClasses.add(new MyClass(35));
        myLinkedListClasses.add(new MyClass(18));
        myLinkedListClasses.add(new MyClass(11));
        myLinkedListClasses.add(new MyClass(322));
        myLinkedListClasses.add(new MyClass(99));
        System.out.println(myLinkedListClasses);

        for (int i = 0; i < myLinkedListClasses.size(); i++) {
            if (myLinkedListClasses.get(i).num % 2 != 0) {
                myLinkedListClasses.remove(i); // удалить объекты с нечётными свойствами num,
                i--;
            }
        }
        System.out.println(myLinkedListClasses);


//    Перебрать ArrayList и удалить все четные числа.
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println(arrayList);


//    Перебрать LinkedList и заменить все элементы, кратные 3, на нули.
        LinkedList<Integer> myLinkedList = new LinkedList<>(Arrays.asList(12, 234, 4, 87, 90));
        System.out.println(myLinkedList);
        for (int i = 0; i < myLinkedList.size(); i++) {
            if (myLinkedList.get(i) % 3 == 0) myLinkedList.set(i, 0);
        }
        System.out.println(myLinkedList);


//    Перебрать ArrayList и объединить все элементы в одну строку.
        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        StringJoiner oneString = new StringJoiner(" ");
        for (String word : myArrayList) {
            oneString.add(word);
        }
        System.out.println(oneString);


//    Перебрать LinkedList и удалить все элементы, содержащие определенную подстроку.
        LinkedList<String> myLinkedStrList = new LinkedList<>(Arrays.asList("dogie", "solana", "ata", "bela", "cola"));
        System.out.println(myLinkedStrList);
        subStr = "la";
        for (int i = 0; i < myLinkedStrList.size(); i++) {
            if (myLinkedStrList.get(i).contains(subStr)) {
                myLinkedStrList.remove(i);
                i--;
            }
        }
        System.out.println(myLinkedStrList);


//    Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.
        ArrayList<MyClass> myArrayObj = new ArrayList<>();
        myArrayObj.add(new MyClass(25));
        myArrayObj.add(new MyClass(35));
        myArrayObj.add(new MyClass(18));
        myArrayObj.add(new MyClass(11));
        myArrayObj.add(new MyClass(322));
        myArrayObj.add(new MyClass(99));

        for (MyClass myClass : myArrayObj) {
            if (myClass.num % 9 == 0) {
                System.out.println(myClass);
            }
        }


//    Перебрать ArrayList и найти сумму квадратов всех элементов.
//    (10, 2, 3, 3, 5, 6, 7, 8)
        sum = 0;
        for (int el : arrayList) sum += el * el;
        System.out.println(sum);

//    Перебрать LinkedList и вычислить произведение всех элементов.
//    (12, 234, 4, 87, 90)
        int product = 1;
        for (int el : linkedList) {
            product *= el;
        }
        System.out.println(product);

//    Перебрать ArrayList и найти самую короткую строку.
//    ("one", "two", "three", "an", "four", "five")
        String minString = arrayStrList.get(0);

        for (String word : arrayStrList) {
            if (word.length() < minString.length()) minString = word;
        }
        System.out.println(minString);


//    Перебрать LinkedList и заменить все гласные буквы в каждой строке на символ '*'.
//    ("hi", "hola", "hello", "Привет")
        String[] vowel = {"a","e","i","o","u"};
        for (int i = 0; i<linkedStrList.size();i++){
            for (String sym : vowel) {
                linkedStrList.set(i, linkedStrList.get(i).replaceAll(sym, "*"));
            }
        }
        System.out.println(linkedStrList);


//    Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.

        LinkedList<Integer> myLinkList = new LinkedList<>(List.of(25, 35, 18, 11, 322, 99));
        Collections.sort(myLinkList);
        Collections.reverse(myLinkList);

    }

}

