package org.umbrella.graph.depthfirstsearch.basicdemo;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addNeighbour(b);
        a.addNeighbour(f);
        a.addNeighbour(g);

        b.addNeighbour(a);
        b.addNeighbour(c);
        b.addNeighbour(d);

        c.addNeighbour(b);

        d.addNeighbour(b);
        d.addNeighbour(e);

        f.addNeighbour(a);

        g.addNeighbour(a);
        g.addNeighbour(h);

        h.addNeighbour(g);
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.travers(List.of(a));

        System.out.println("Recursive version");
        DepthFirstSearchWithRecursive depthFirstSearchWithRecursive = new DepthFirstSearchWithRecursive();
        depthFirstSearchWithRecursive.travers(List.of(a));
    }
}
