package dsw.rudok.app.repository;

import dsw.rudok.app.gui.swing.event.UpdateEvent;
import dsw.rudok.app.gui.swing.event.UpdateListener;
import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.node.RuNodeComposite;

import java.io.File;

public class Project extends RuNodeComposite implements UpdateListener {

    private File projectFile;
    private transient boolean changed;

    public Project(String name, RuNode parent) {
        super(name, parent);
        this.changed = false;
        this.projectFile = null;
    }

    @Override
    public void addChild(RuNode child) {
        if (child != null && child instanceof Document) {
            Document document = (Document) child;
            if (!this.getChildren().contains(document)) {
                this.getChildren().add(document);

            }
        }
    }

    @Override
    public void removeChild(RuNode child) {
        if (child != null && child instanceof Document) {
            Document document = (Document) child;
            if (this.getChildren().contains(document)) {
                this.getChildren().remove(document);

            }
        }

    }

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    public File getProjectFile() {
        return projectFile;
    }

    public void setProjectFile(File projectFile) {
        this.projectFile = projectFile;
    }

    @Override
    public void update() {
        notifyAll();
    }

    @Override
    public void updatePerformed(UpdateEvent e) {
        setChanged(true);
    }
}

