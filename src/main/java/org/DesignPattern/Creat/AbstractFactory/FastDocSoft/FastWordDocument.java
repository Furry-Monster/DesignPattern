package org.DesignPattern.Creat.AbstractFactory.FastDocSoft;

import org.DesignPattern.Creat.AbstractFactory.WordDocument;

import java.io.IOException;
import java.nio.file.Path;

public class FastWordDocument implements WordDocument {
    public FastWordDocument(String md) {
    }

    @Override
    public void save(Path path) throws IOException {

    }
}
