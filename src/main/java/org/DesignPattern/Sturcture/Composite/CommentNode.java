package org.DesignPattern.Sturcture.Composite;

import java.util.Collections;
import java.util.List;

public class CommentNode implements Node {
    private String comment;

    public CommentNode(String comment) {
        this.comment = comment;
    }

    @Override
    public Node add(Node n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Node> getChildren() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toXML() {
        return "<!-- " + comment + " -->";
    }
}
