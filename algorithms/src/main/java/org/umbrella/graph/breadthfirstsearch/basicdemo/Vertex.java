package org.umbrella.graph.breadthfirstsearch.basicdemo;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private final List<Vertex> adjacentVertices = new ArrayList<>();

    public Vertex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjacentVertices() {
        return adjacentVertices;
    }

    public void addNeighbour(Vertex adjacentVertex) {
        this.adjacentVertices.add(adjacentVertex);
    }

    @Override
    public String toString() {
        return "Vertex{" + "name='" + name + '\'' + '}';
    }
}
