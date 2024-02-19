package com.okayhak;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreadthFirstSearchTest {

    @Test
    public void testBFS() {
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);

        assertEquals("[0, 1, 2, 4, 3, 5, 6]", BreadthFirstSearch.search(graph, 0).toString());
    }

    @Test
    public void testBFSDisconnectedGraph() {
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        assertEquals("[0, 1, 2]", BreadthFirstSearch.search(graph, 0).toString());
        assertEquals("[4, 5]", BreadthFirstSearch.search(graph, 4).toString());
    }
}
