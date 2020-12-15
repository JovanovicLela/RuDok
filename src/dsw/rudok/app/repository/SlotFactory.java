package dsw.rudok.app.repository;

public class SlotFactory {

    public static Slot createSlot(String slotName, Page page, int x, int y , int width, int height, SlotType slotType){
     switch(slotType)

    {
        case CIRCLE:
            return new SlotCircle(slotName, page, x, y, width, height);
        case RECTANGLE:
            return new SlotRectangle(slotName, page, x, y, width, height);
        case TRIANGLE:

            ///zavrsiti
            return null;
    }
    return null;

    }
  public enum SlotType {
      CIRCLE, RECTANGLE, TRIANGLE;
  }

}
