package org.example.Greedy.Knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void knapsack(ArrayList<KnapsackItem> items, int capacity) {
        Comparator<KnapsackItem> comparator = new Comparator<KnapsackItem>() {
            @Override
            public int compare(KnapsackItem o1, KnapsackItem o2) {
                return o2.getRatio() > o1.getRatio() ? 1 : -1 ;
            }
        };

        Collections.sort(items, comparator);

        int usedCapacity = 0;
        double totalValue = 0;

        for(KnapsackItem item: items) {
            if (usedCapacity + item.getWeight() <= capacity) {
                usedCapacity += item.getWeight();
                System.out.println("Taken: " + item);
                totalValue += item.getValue();
            } else {
                int usedWeight = capacity - usedCapacity;
                double value = item.getRatio() * usedWeight;
                usedCapacity += usedWeight;
                totalValue += value;
            }
            if (usedCapacity == capacity) break;
        }
    }
}
