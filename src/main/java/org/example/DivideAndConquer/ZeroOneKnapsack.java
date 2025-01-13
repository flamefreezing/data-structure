package org.example.DivideAndConquer;

public class ZeroOneKnapsack {

    private int knapsack(int[] profits, int[] weights, int capacity, int currentIndex) {
        if(capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length) {
            return 0;
        } else if (weights[currentIndex] < capacity) {
            int profitOne = profits[currentIndex] + knapsack(profits, weights, capacity - weights[currentIndex],  currentIndex + 1);
            int profitTwo = knapsack(profits, weights, capacity, currentIndex + 1);
            return Math.max(profitOne, profitTwo);
        } else {
            return 0;
        }
    }

    public int knapsack(int[] profits, int[] weights, int capacity) {
        return this.knapsack(profits, weights, capacity, 0);
    }
}
