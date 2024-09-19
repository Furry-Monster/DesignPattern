package org.DesignPattern.Sturcture.Composite;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class ElementNode implements Node {
    private String name;
    private List<Node> children;
    public ElementNode(String name) {
        this.name = name;
    }

    @Override
    public Node add(Node n) {
        children.add(n);
        return this;
    }

    @Override
    public List<Node> getChildren() {
        return children;
    }

    @Override
    public String toXML() {
        String start = "<" + name + ">\n";
        String end = "</" + name + ">\n";
        StringJoiner sj = new StringJoiner("", start, end);
        children.forEach(node -> {
            sj.add(node.toXML() + "\n");
        });
        return sj.toString();
    }
}
