package com.gdstruc.module7;

public class Node {
    private int data;
    private Node rightChild;
    private Node leftChild;

    public Node(int _data) {
        data = _data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {     // left subtree
            if (leftChild == null) {
                leftChild = new Node(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {                  // right subtree
            if (rightChild == null) {
                rightChild = new Node(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder() {
        // left subtree
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }

        // print current node (root or subtree)
        System.out.println("Data: " + data);

        // right subtree
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    // traverse the tree (in-order) in descending order
    public void traverseInOrderDescending() {
        // since the new pattern is RIGHT, ROOT, LEFT
        // right subtree
        if (rightChild != null) {
            rightChild.traverseInOrderDescending();
        }

        System.out.println("Data: " + data);

        // left subtree
        if (leftChild != null) {
            leftChild.traverseInOrderDescending();
        }

    }

    public Node get(int value) {
        if (value == data) {
            return this;
        }

        if (value < data) {
            if (leftChild != null) {
                return  leftChild.get(value);
            }
        }
        else {
            if (rightChild != null) {
                return  rightChild.get(value);
            }
        }

        return null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }


    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
