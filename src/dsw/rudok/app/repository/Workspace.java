package dsw.rudok.app.repository;

import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.node.RuNodeComposite;

import java.util.ArrayList;

public class Workspace extends RuNodeComposite{

    //kolekcija projekata, dodato novo
    private ArrayList<Project> projects = new ArrayList<Project>();


    public Workspace(String name) {
        super(name, null);
    }

    @Override
    public void addChild(RuNode child) {
        if(child != null && child instanceof Project){
            Project project = (Project) child;
            if(!this.getChildren().contains(project)){
                this.getChildren().add(project);
                projects.add(project); // dodato novo
            }
        }

    }

    @Override
    public void removeChild(RuNode child) {
        if(child != null && child instanceof Project){
            Project project = (Project) child;
            if(this.getChildren().contains(project)){
                this.getChildren().remove(project);
            }
        }

    }
    public void addProject(Project project){
        projects.add(project);
        project.setName("Project - Graficki editor"+projects.size());
    }

    public int getProjectsCount() {
        return projects.size();
    }
    public Project getProject(int index) {
        return projects.get(index);
    }

    public int getProjectIndex(Project project) {
        return projects.indexOf(project);
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    @Override
    public void update() {
        this.notifyAll();
    }
}
