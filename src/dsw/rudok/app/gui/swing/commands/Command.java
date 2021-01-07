package dsw.rudok.app.gui.swing.commands;

import java.io.Serializable;

public abstract class Command implements Serializable {

    public abstract void doCommand();

    public abstract void undoCommand();

    public abstract void redoCommand();
}
