package de.telran.practic.backLog;

import java.util.HashSet;

public class LoopNode {
    public static void main(String[] args) {
        Node m1 = new Node(1);
        Node m2 = new Node(2);
        Node m3 = new Node(3);
        Node m4 = new Node(4);
        Node m5 = new Node(5);
        Node m6 = new Node(6);
        Node m7 = new Node(7);

        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next = m5;
        m5.next = m6;
        m6.next = m2;

        HashSet<Node> nodeSet = new HashSet<>();
        Node temp = m1;
        while (true) {
            boolean flag = nodeSet.add(temp);
            temp = temp.next;

            if (!flag) break;

        }

    }

    public static boolean isLoop(Node node) {
        boolean flag = false;

        HashSet<Node> nodeSet = new HashSet<>();
        nodeSet.add(node);

        return flag;
    }

}
