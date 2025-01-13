package org.example.DivideAndConquer;

public class HouseRobber {

    public int maxMoneyRecursive(int[] HouseNetWorth, int currentIndex) {
        if(currentIndex >= HouseNetWorth.length) return 0;

        int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyRecursive(HouseNetWorth, currentIndex + 2);
        int skipCurrentHouse = maxMoneyRecursive(HouseNetWorth, currentIndex + 1);

        return Math.max(stealCurrentHouse, skipCurrentHouse);
    }
}
