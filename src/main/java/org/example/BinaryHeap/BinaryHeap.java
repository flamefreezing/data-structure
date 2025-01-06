package org.example.BinaryHeap;

public class BinaryHeap {
    public int[] arr;
    public int sizeOfTree;

    public BinaryHeap(int size) {
        this.arr = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap has been created");
    }

    public boolean isEmpty() {
        return this.sizeOfTree == 0;
    }

    public Integer peek() {
        return !isEmpty() ? arr[1] : null;
    }

    public void levelOrder() {
        for(int i = 1; i <= sizeOfTree; i++) {
            System.out.println(arr[i]);
        }
    }

    public void heapifyBottomToTop(int index, String heapType) {
       int parent = index / 2;
       if (index <= 1) {
           return;
       }

       if (heapType == "Min") {
           if(arr[index] < arr[parent]) {
               int tmp = arr[index];
               arr[index] = arr[parent];
               arr[parent] = tmp;
           }
       } else if (heapType == "Max") {
           if(arr[index] > arr[parent]) {
               int tmp = arr[index];
               arr[index] = arr[parent];
               arr[parent] = tmp;
           }
       }

        heapifyBottomToTop(parent, heapType);
    }

    public void insert(int value, String heapType) {
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, heapType);
    }

    public void deleteBH() {
        arr = null;
    }
}
