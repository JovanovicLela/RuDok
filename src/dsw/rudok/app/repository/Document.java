package dsw.rudok.app.repository;

import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.node.RuNodeComposite;

import java.util.ArrayList;


public class Document extends RuNodeComposite {

  public Document(String name, RuNode parent){
      super(name,parent);
  }
  private ArrayList<Page> pages = new ArrayList<>();
    private ArrayList<Diagram> diagrams = new ArrayList<Diagram>();


   @Override
    public void addChild(RuNode child){
      if(child != null && child instanceof Page){
          Page page = (Page) child;
          // dodatak

         // page.setName("Page" + String.valueOf(pages.size()));
          pages.add(page);

          if(!this.getChildren().contains(page)){
              this.getChildren().add(page);
          }
      }
   }

    @Override
    public void removeChild(RuNode child) {
        if(child != null && child instanceof Page){
            Page page = (Page) child;
            if(!this.getChildren().contains(page)){
                this.getChildren().remove(page);
            }
        }

    }
    public void addDiagram(Diagram diagram){
        diagrams.add(diagram);
        diagram.setName(this.getName()+" - Diagram  - GrafiÄ�ki editor:"+String.valueOf(diagrams.size()));

    }


    @Override
    public String getName() {
        return super.getName();
    }



    public int getDiagramIndex(Diagram diagram) {
        return diagrams.indexOf(diagram);
    }

    public int getDiagramCount() {
        return diagrams.size();
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public ArrayList<Diagram> getDiagrams() {
        return diagrams;
    }

    @Override
    public void update() {
        notifyAll();
    }
}
