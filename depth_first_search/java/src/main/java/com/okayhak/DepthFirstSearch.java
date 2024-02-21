package com.okayhak;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DepthFirstSearch {
    public static void search(Graph g, Integer value, Map<Integer, Boolean> discovered, List<Integer> traversal) {
        discovered.put(value, true);
        traversal.add(value);

        for (Integer neighbour : g.getNodes().getOrDefault(value, new ArrayList<>())) {
            if (!discovered.getOrDefault(neighbour, false)) {
                search(g, neighbour, discovered, traversal);
            }
        }
    }
}
