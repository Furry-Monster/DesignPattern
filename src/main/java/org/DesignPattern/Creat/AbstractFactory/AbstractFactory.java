package org.DesignPattern.Creat.AbstractFactory;

public interface AbstractFactory {
    HtmlDocument createHtmlDocument(String md);

    WordDocument createWordDocument(String md);
}
