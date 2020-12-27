package dsw.rudok.app.repository;

import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.node.RuNodeComposite;
import dsw.rudok.app.repository.slot.Slot;

import java.util.ArrayList;


public class Document extends RuNodeComposite {

  public Document(String name, RuNode parent){
      super(name,parent);
  }
  private ArrayList<Page> pages = new ArrayList<>();
    private ArrayList<Slot> slots = new ArrayList<Slot>();


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
    public void addSlot(Slot slot){
        slots.add(slot);
        slot.setName(this.getName()+" - Slot  - GrafiÄ�ki editor:"+ String.valueOf(slots.size()));

    }


    @Override
    public String getName() {
        return super.getName();
    }

    public int getSlotIndex(Slot slot) {
        return slots.indexOf(slot);
    }

    public int getSlotCount() {
        return slots.size();
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public ArrayList<Slot> getDiagrams() {
        return slots;
    }

    @Override
    public void update() {
        notifyAll();
    }
}
