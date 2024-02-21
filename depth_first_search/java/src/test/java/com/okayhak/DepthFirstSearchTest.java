package com.okayhak;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class DepthFirstSearchTest {

    @Test
    public void testDFS() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        List<Integer> expectedTraversal = Arrays.asList(0, 1, 3, 2, 4);
        List<Integer> traversal = new ArrayList<>();
        Map<Integer, Boolean> discovered = new HashMap<>();
        DepthFirstSearch.search(g, 0, discovered, traversal);
        assertEquals(expectedTraversal.toString(), traversal.toString());
    }

    @Test
    public void TestDisconnectedDFS() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(4, 5);
        g.addEdge(6, 7);
        g.addEdge(7, 8);
        g.addEdge(8, 9);
        g.addEdge(6, 9);
        g.addEdge(7, 9);

        List<Integer> expectedTraversal1 = Arrays.asList(0, 1, 3, 2, 4, 5);
        List<Integer> traversal1 = new ArrayList<>();
        Map<Integer, Boolean> discovered1 = new HashMap<>();
        DepthFirstSearch.search(g, 0, discovered1, traversal1);
        assertEquals(expectedTraversal1.toString(), traversal1.toString());

        List<Integer> expectedTraversal2 = Arrays.asList(6, 7, 8, 9);
        List<Integer> traversal2 = new ArrayList<>();
        Map<Integer, Boolean> discovered2 = new HashMap<>();
        DepthFirstSearch.search(g, 6, discovered2, traversal2);
        assertEquals(expectedTraversal2.toString(), traversal2.toString());
    }

}
