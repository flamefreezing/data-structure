package org.example.Search;

public class Searching {

    public static int linearSearch(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int middle = (start + end) / 2;

            if(arr[middle] == value) {
                return middle;
            } else if (arr[middle] < value) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}
