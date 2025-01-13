package org.example;

import org.example.DivideAndConquer.ZeroOneKnapsack;
import org.example.Greedy.ActivitySelection.Activity;
import org.example.Greedy.ActivitySelection.ActivitySelection;
import org.example.Greedy.CoinChange.CoinChangeProblem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZeroOneKnapsack zo = new ZeroOneKnapsack();
        int[] profits = {31, 26, 17, 72};
        int[] weights = {3, 1, 2, 5};
        int maxProfit = zo.knapsack(profits, weights, 7);
        System.out.println(maxProfit);

    }
}