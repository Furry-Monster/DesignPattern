package org.DesignPattern.Behavior.Command.commands;

import org.DesignPattern.Behavior.Command.TextEditor;

public class CopyCommand implements Command {
    private TextEditor textEditor;

    public CopyCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public boolean execute() {
        textEditor.copy();
        return true;
    }
}
