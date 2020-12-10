package dsw.rudok.app.repository;

import dsw.rudok.app.core.Repository;

public class RepositoryImpl implements Repository{

    private Workspace root;


    @Override // novo dodato
    public void addProject(Project project) {
        getWorkspace().addProject(project);
     //   SwingUtilities.updateComponentTreeUI();

    }

    @Override
    public Workspace getWorkspace() {
        return root;
    }

    public RepositoryImpl() {
        root = new Workspace("Workspace");
    }

    public Workspace getRoot() {
        return root;
    }

    public void setRoot(Workspace root) {
        this.root = root;
    }


}
