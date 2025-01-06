package org.example;

import org.example.BinaryHeap.BinaryHeap;
import org.example.BinarySearchTree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinaryHeap newBH = new BinaryHeap(10);
        newBH.insert(10, "Min");
        newBH.insert(5, "Min");
        newBH.insert(15, "Min");
        newBH.insert(20, "Min");
        newBH.insert(1, "Min");
        newBH.insert(12, "Min");
        newBH.levelOrder();
    }

}