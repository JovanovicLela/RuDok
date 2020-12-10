package dsw.rudok.app.core;

import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.Workspace;

public interface Repository {
    Workspace getWorkspace();
    void addProject(Project project);
}
