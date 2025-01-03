package org.example;

public class BinaryTree {
    public String[] arr;
    public int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
    }

    public boolean isFull() {
        if(arr.length - 1 == lastUsedIndex) {
            return true;
        }
        return false;
    }

    public void insert(String value) {
        if(!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("The value of " + value + " has been inserted");
        } else {
            System.out.println("The BT is full");
        }
    }

    public void preOrder(int index) {
        if(index > lastUsedIndex) {
            return;
        }
        System.out.println(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    public void levelOrder() {
        for(int i = 1; i <= lastUsedIndex; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public int search(String value) {
        for(int i = 1; i <= lastUsedIndex; i++) {
            if(arr[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
