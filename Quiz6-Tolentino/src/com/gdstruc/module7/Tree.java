package com.gdstruc.module7;

public class Tree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }
    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    // traverse the tree (in-order) in descending order
    public void traverseInOrderDescending() {
        if (root != null) {
            root.traverseInOrderDescending();
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return  null;
    }

    // gets the rightmost leaf to get the maximum value
    public int maxValue(Node node)
    {
        Node current = node;
        while (current.getRightChild() != null){
            current = current.getRightChild();
        }
        return current.getData();
    }

    // gets the leftmost leaf to get the minimum value
    public int minValue(Node node)
    {
        Node current = node;
        while (current.getLeftChild() != null){
            current = current.getLeftChild();
        }
        return current.getData();
    }
}

