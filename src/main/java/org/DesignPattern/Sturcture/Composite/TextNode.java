package org.DesignPattern.Sturcture.Composite;

import java.util.Collections;
import java.util.List;

public class TextNode implements Node {
    private String text;

    public TextNode(String text) {
        this.text = text;
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
        return text;
    }
}
