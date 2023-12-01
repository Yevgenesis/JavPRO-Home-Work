package de.telran.homeWork.hw_8.unidirectionIntLinkedList;

public class UnidirectionalIntLinkedList {
    int size;
    private Node first;

    public void add(int element) {
        Node temp = new Node(element);
        if (first == null) { // проверка на пустой LinkedList
            first = temp;
        } else {
            Node currentNode = first;
            for (int i = 1; i < size; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = temp;
        }
        size++;
    }

    public void add(int index, int element) {
        if (index == 0) {
            addFirst(element);
        } else {
            Node temp = new Node(element);
            Node currentNode = first;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            temp.next = currentNode.next;
            currentNode.next = temp;
            size++;
        }
    }

    public void addFirst(int element) {
        Node temp = new Node(element);
        temp.next = first;
        first = temp;
        size++;

    }

    public void addLast(int element) {
        if (first == null) {
            addFirst(element);
        } else {
            Node temp = first;
            while (temp.next != null) temp = temp.next;

            temp.next = new Node(element);
            size++;
        }
    }

    public int get(int index) {
        if (first == null || index < 0 || index >= size) return -2147483648; // Пока не знаю как делать исключения

        Node temp = first;
        for (int i = 0; i < index; i++) temp = temp.next;
        return temp.item;
    }

    public int set(int index, int element) {
        if (first == null || index < 0 || index >= size) return -2147483648; // исключение

        Node temp = first;
        while (index != 0) {
            index--;
            temp = temp.next;
        }
        int deletedElement = temp.item;
        temp.item = element;
        return deletedElement;
    }

    public int remove(int index) {
        if (first == null) return -2147483648; // исключение

        int removingElement = first.item;
        Node currentNode = first;

        if (index == 0) {
            first = first.next;
        } else {
            for (int i = 1; i < index; i++) currentNode = currentNode.next;

            removingElement = currentNode.item;
            currentNode.next = currentNode.next.next;
        }
        size--;
        return removingElement;
    }

    public int removeFirst() {
        if (first == null) return -2147483648; // исключение

        int removedElement = first.item;
        first = first.next;
        return removedElement;
    }

    public int removeLast() {
        if (first == null) return -2147483648; // // исключение

        int element = first.item;
        if (first.next == null) { // Если один элемент в LinkedListe
            first = null;
        } else {
            Node prevNode = first;
            while (prevNode.next.next != null) {
                prevNode = prevNode.next;
            }
            element = prevNode.next.item;
            prevNode.next = null;
        }
        size--;
        return element;
    }

    public int indexOf(int element) {
        Node currentNode = first;
        for (int i = 0; i < size; i++) {
            if (currentNode.item == element) return i;
            currentNode = currentNode.next;
        }
        return -1;
    }

    public boolean contains(int element) {
        Node currentNode = first;

        while (currentNode != null) {
            if (currentNode.item == element) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    void clear() {
        first = null;
    }

    @Override
    public String toString() {
        StringBuilder linkArr = new StringBuilder();
        Node temp = first;
        System.out.print("[");
        while (temp != null) {
            linkArr.append(temp.item).append(", ");
            temp = temp.next;
        }
        return linkArr.substring(0, linkArr.length() - 2) + "]";
    }

    private class Node {
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
}
