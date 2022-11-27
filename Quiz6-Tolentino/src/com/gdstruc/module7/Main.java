package com.gdstruc.module7;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        // traverse the tree (in-order)
        System.out.println("In-order (left, root, right): ");
        tree.traverseInOrder();
        System.out.println("\n");

        // traverse the tree (in-order) in descending order
        System.out.println("In-order Descending (right, root, left): ");
        tree.traverseInOrderDescending();

        // gets the min and max value of the tree
        System.out.println("Maximum Value: " + tree.maxValue(tree.getRoot()));
        System.out.println("Minimum Value: " + tree.minValue(tree.getRoot()));
    }

}