package org.DesignPattern.Behavior.Visitor.visitors;

import java.io.File;

public class ClassFileCleanerVisitor implements Visitor {
    public void visitDir(File dir) {
    }

    public void visitFile(File file) {
        if (file.getName().endsWith(".class")) {
            System.out.println("Will clean class file: " + file);
        }
    }
}