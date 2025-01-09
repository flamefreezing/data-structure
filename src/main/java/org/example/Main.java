package org.example;

import org.example.Graph.AdjacencyList.Graph;
import org.example.Graph.AdjacencyList.GraphNode;
import org.example.Graph.Weight.WeightedGraph;
import org.example.Graph.Weight.WeightedNode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();

        nodeList.add(new WeightedNode("A", 1));
        nodeList.add(new WeightedNode("B", 2));
        nodeList.add(new WeightedNode("C", 3));
        nodeList.add(new WeightedNode("D", 4));
        nodeList.add(new WeightedNode("E", 5));
        nodeList.add(new WeightedNode("F", 6));
        nodeList.add(new WeightedNode("G", 7));

        WeightedGraph newGraph = new WeightedGraph(nodeList);

        newGraph.addWeightedEdge(0, 1, 2);
        newGraph.addWeightedEdge(0, 2, 5);
        newGraph.addWeightedEdge(1, 2, 6);
        newGraph.addWeightedEdge(1, 3, 1);
        newGraph.addWeightedEdge(1, 4, 3);
        newGraph.addWeightedEdge(2, 5, 8);
        newGraph.addWeightedEdge(2, 4, 4);
        newGraph.addWeightedEdge(4, 6, 9);
        newGraph.addWeightedEdge(5, 6, 7);
        System.out.println("Printing dijkstra from source: A");
        newGraph.dijkstra(nodeList.get(0));
    }
}