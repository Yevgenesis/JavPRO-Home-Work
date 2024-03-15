package de.telran.practic.backLog.treeTest;

class Leaf {
    int value;
    Leaf left;
    Leaf right;

    Leaf(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    Leaf root;

    Tree(int value) {
        this.root = new Leaf(value);
    }

    public void addLeaf(int value) {
        if (isLeaf(value)) throw new Error("Value " + value + "is present in tree");
        Leaf current = this.root;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = new Leaf(value);
                    break;
                } else current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new Leaf(value);
                    break;
                } else current = current.right;
            }
        }
    }

    public boolean isLeaf(int value) {
        Leaf current = this.root;
        while (true) {
            if (value == current.value) return true;
            if (value < current.value) {
                if (current.left == null) {
                    return false;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    return false;
                } else current = current.right;
            }
        }
    }

    public void removeLeaf(int value) {
        if (!isLeaf(value)) throw new Error("Value " + value + " is not present in tree");
        if (this.root.value == value) throw new Error("Can`t remove! Value " + value + " present in root ");
        Leaf current = this.root;
        while (true) {

            if (value < current.value) {
                if (current.left.value == value) {
                    current.left = null;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right.value == value) {
                    current.right = null;
                    break;
                } else current = current.right;
            }
        }
    }

    public int getCountLeafs() {
        Leaf current = this.root;
        return getRecLeafs(current);
    }

    private int getRecLeafs(Leaf leaf) {
        if (leaf == null) return 0;
        return 1 + getRecLeafs(leaf.left) + getRecLeafs(leaf.right);
    }

    public int getSumLeafsValue(Leaf leaf) {
        if (leaf == null) return 0;
        return leaf.value + getSumLeafsValue(leaf.left) + getSumLeafsValue(leaf.right);
    }

    public int getHeightOfTree(Leaf leaf) {
        if (leaf == null) return 0;
        return 1 + Math.max(getHeightOfTree(leaf.left), getHeightOfTree(leaf.right));
    }

}


public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(10);
        tree.addLeaf(12);
        tree.addLeaf(15);
        tree.addLeaf(8);
        tree.addLeaf(0);
        tree.addLeaf(5);
//        System.out.println(tree.root.left.left.right.value);
        System.out.println(tree.getHeightOfTree(tree.root));
    }


}
