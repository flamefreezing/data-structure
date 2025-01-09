package org.example.Graph.Weight;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {

    public ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void dijkstra(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(this.nodeList);
        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            for (WeightedNode neighbor : currentNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                        neighbor.distance = currentNode.distance + currentNode.weightMap.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        for(WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " +  nodeToCheck.name + ", distance: " + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }

    }

    private void pathPrint(WeightedNode nodeToCheck) {
        if(nodeToCheck.parent != null) {
            pathPrint(nodeToCheck.parent);
        }
        System.out.print(nodeToCheck.name + " ");
    }

    public void addWeightedEdge(int i, int j, int w) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightMap.put(second, w);
    }
}
