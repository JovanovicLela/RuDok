package dsw.rudok.app.repository;

import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.node.RuNodeComposite;


public class Document extends RuNodeComposite {

  public Document(String name, RuNode parent){
      super(name,parent);
  }

   @Override
    public void addChild(RuNode child){
      if(child != null && child instanceof Page){
          Page page = (Page) child;
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

    @Override
    public void update() {
        notifyAll();
    }
}
