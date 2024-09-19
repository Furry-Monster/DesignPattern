package org.DesignPattern.Sturcture.Composite;

import java.util.List;

public interface Node {
    Node add(Node n);
    List<Node> getChildren();
    String toXML();
}
