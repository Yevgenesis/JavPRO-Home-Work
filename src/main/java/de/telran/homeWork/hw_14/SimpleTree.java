package de.telran.homeWork.hw_14;

public class SimpleTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(1, "Node1");
        binaryTree.insert(3, "Node3");
        binaryTree.insert(2, "Node2");
        binaryTree.insert(4, "Node4");
        binaryTree.insert(6, "Node6");
        binaryTree.insert(0, "Node0");

        binaryTree.print();
        Node root = binaryTree.getRoot();


        // ищем Node2, алгоритм Breadth First Search
        Node res1 = Util.breadthFirstSearch(root, 2);
        System.out.println(res1);

        // ищем Node4, алгоритм Depth first search
        Node res2 = Util.depthInorderStack(root, 4);
        System.out.println(res2);
    }

}
