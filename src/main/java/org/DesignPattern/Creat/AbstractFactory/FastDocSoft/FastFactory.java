package org.DesignPattern.Creat.AbstractFactory.FastDocSoft;

import org.DesignPattern.Creat.AbstractFactory.AbstractFactory;
import org.DesignPattern.Creat.AbstractFactory.HtmlDocument;
import org.DesignPattern.Creat.AbstractFactory.WordDocument;

public class FastFactory implements AbstractFactory {

    @Override
    public HtmlDocument createHtmlDocument(String md) {
        return new FastHtmlDocument(md);
    }

    @Override
    public WordDocument createWordDocument(String md) {
        return new FastWordDocument(md);
    }
}
