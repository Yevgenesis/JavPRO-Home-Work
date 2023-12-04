package de.telran.homeWork.hw_9.myArrays;

import de.telran.homeWork.hw_8.uniDirectionIntLinkedList.UniDirectionalIntLinkedList;
import org.w3c.dom.Node;

import java.util.Iterator;

public class UniIterLinkedList extends UniDirectionalIntLinkedList implements Iterator {

//  Наследовался от класса UniDirectionalIntLinkedList, имплементировал интерфейс Iterator,
//  добавил метод Итератор и переопределил методы remove

    private Node cursor;

    private UniIterLinkedList(Node first) {
        super(first);
    }

    public UniIterLinkedList() {
    }

    public UniIterLinkedList iterator(){
        return new UniIterLinkedList(first);
    }


    @Override
    public boolean hasNext() {
        if (first == null) return false;
        if (cursor == null || cursor.next != null) return true;
        return false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            if (cursor == null) cursor = first;
            else cursor = cursor.next;
            return cursor.item;
        }
        return null;
    }

    @Override
    public void remove() {
        if(first == cursor){
            first = first.next;
            cursor = first;
        }
        Node currentNode = first;

        while (currentNode.next != cursor) currentNode = currentNode.next;

        if (cursor.next == null) currentNode.next = null;
        else currentNode.next = currentNode.next.next;

        size--;
    }

}
