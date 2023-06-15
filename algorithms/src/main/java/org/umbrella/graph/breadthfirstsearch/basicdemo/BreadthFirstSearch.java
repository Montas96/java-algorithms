package org.umbrella.graph.breadthfirstsearch.basicdemo;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void travers(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()){
            // remove the first item
            Vertex currentVertex = queue.remove();
            System.out.println("Actual vertex is " + currentVertex.getName());
            for (Vertex vertex : currentVertex.getAdjacentVertexes()){
                if(!vertex.isVisited()) {
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
            }
        }

    }
}
