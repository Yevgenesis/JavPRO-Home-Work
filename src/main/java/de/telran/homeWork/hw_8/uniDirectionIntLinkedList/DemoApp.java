package de.telran.homeWork.hw_8.uniDirectionIntLinkedList;

public class DemoApp {
    public static void main(String[] args) {
        UniDirectionalIntLinkedList myLinkedList = new UniDirectionalIntLinkedList();
        myLinkedList.add(11);
//        myLinkedList.add(13);
//        myLinkedList.addFirst(100);
//        myLinkedList.add(111);
//        myLinkedList.add(131);
//        myLinkedList.addLast(300);
//        myLinkedList.add(0,200);
//
//        System.out.println(myLinkedList);
//
//        System.out.println(myLinkedList.set(1,150));
//        System.out.println(myLinkedList.get(0));
//
//        System.out.println(myLinkedList.contains(300));
//        System.out.println(myLinkedList.indexOf(13));
//        System.out.println(myLinkedList.remove(0));


        System.out.println(myLinkedList.removeFirst());

//        System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList);

    }
}
