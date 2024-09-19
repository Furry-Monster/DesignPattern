package org.DesignPattern.Creat.AbstractFactory.FastDocSoft;

import org.DesignPattern.Creat.AbstractFactory.HtmlDocument;

import java.io.IOException;
import java.nio.file.Path;

public class FastHtmlDocument implements HtmlDocument {
    public FastHtmlDocument(String md) {

    }

    @Override
    public String toHtml() {
        return "";
    }

    @Override
    public void save(Path path) throws IOException {

    }
}

