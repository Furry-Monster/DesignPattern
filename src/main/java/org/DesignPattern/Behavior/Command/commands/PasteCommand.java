package org.DesignPattern.Behavior.Command.commands;

import org.DesignPattern.Behavior.Command.TextEditor;

public class PasteCommand implements Command {
    private TextEditor editor;

    public PasteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public boolean execute() {
        editor.paste();
        return true;
    }
}
