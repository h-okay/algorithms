package com.okayhak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreadthFirstSearch {
    public static List<Integer> search(Graph g, Integer start) {
        List<Integer> traversal = new ArrayList<>();
        Map<Integer, Boolean> visited = new HashMap<>();
        List<Integer> queue = new ArrayList<>();

        queue.add(start);
        visited.put(start, true);

        while (!queue.isEmpty()) {
            Integer node = queue.remove(0);
            traversal.add(node);

            for (Integer neighbor : g.getNodes().getOrDefault(node, new ArrayList<>())) {
                if (!visited.getOrDefault(neighbor, false)) {
                    visited.put(neighbor, true);
                    queue.add(neighbor);
                }
            }
        }
        return traversal;
    }
}
