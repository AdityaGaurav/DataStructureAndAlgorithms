package com.ds.binarysearchtree;

public class BSTTest {
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(4);
        Node n3 = new Node(3);
        Node n4 = new Node(1);
        Node n5 = new Node(3);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        BST insert = new BST();
        insert.insertNode(n2,n6);
        insert.insertNode(n2,n3);
        insert.insertNode(n2,n4);
        insert.insertNode(n2,n5);
        insert.insertNode(n2,n1);
        insert.insertNode(n2,n7);
        System.out.println(insert.contains(n2,n7));
        System.out.println(n2);
    }
}
