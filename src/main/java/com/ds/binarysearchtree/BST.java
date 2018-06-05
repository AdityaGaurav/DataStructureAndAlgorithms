package com.ds.binarysearchtree;

public class BST {

    //Inserts Node
    void insertNode(Node head, Node toInsert) {
        if (head == null) throw new NullPointerException("");
        if (toInsert == null) throw new NullPointerException("");
        if (toInsert.getData() <= head.getData()) {
            if (head.getLeft() == null) {
                head.setLeft(toInsert);
            } else {
                insertNode(head.getLeft(), toInsert);
            }
        } else {
            if (head.getRight() == null) {
                head.setRight(toInsert);
            } else {
                insertNode(head.getRight(), toInsert);
            }
        }
    }

    boolean contains(Node head, Node toSearch) {
        if (head.getData() == toSearch.getData()) {
            return true;
        } else if (head.getData() > toSearch.getData()) {
            if (head.getLeft() == null) {
                return false;
            } else {
                return contains(head.getLeft(), toSearch);
            }
        } else {
            if (head.getRight() == null) {
                return false;
            } else {
                return contains(head.getRight(), toSearch);
            }
        }
    }
}
