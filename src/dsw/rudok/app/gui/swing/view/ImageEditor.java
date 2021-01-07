package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.slot.Slot;

import javax.swing.*;
import java.awt.*;

public class ImageEditor extends JDialog {
    public ImageEditor(Frame owner, String title, boolean modal, Slot slot) {
        super(owner, title, modal);
    }
}