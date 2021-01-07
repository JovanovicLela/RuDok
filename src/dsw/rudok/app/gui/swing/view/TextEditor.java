package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.slot.Slot;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JDialog {

    private Slot slot;
    private JTextPane textPane;
    private JToolBar tb;

    public TextEditor(Frame owner, String title, boolean modal, Slot slot) {
        super(owner, title, modal);

        this.slot = slot;
        this.textPane = new JTextPane();
        this.setLayout(new BorderLayout());
        this.setSize(350, 310);
        setLocationRelativeTo(owner);

        ImageIcon img = new ImageIcon(getClass().getResource("images/edit.png"));
        this.setIconImage(img.getImage());

        if (slot.getContent() != null)
            textPane.setText(slot.getContent());

        tb = new JToolBar();
        tbInitialise(tb);

        this.add(tb, BorderLayout.NORTH);
        this.add(textPane, BorderLayout.CENTER);
    }

    private void tbInitialise(JToolBar tb){

        Icon icon = new ImageIcon(getClass().getResource("images/edit.png"));
           JButton btnS = new JButton(icon); //save

        icon = new ImageIcon(getClass().getResource("images/underline.png"));
        JButton btnU = new JButton(icon); // underline

        icon = new ImageIcon(getClass().getResource("images/italic.png"));
        JButton btnI = new JButton(icon); // italic

        icon = new ImageIcon(getClass().getResource("images/bold.png"));
        JButton btnB = new JButton(icon); // bold

        btnU.addActionListener(new StyledEditorKit.UnderlineAction());
        btnB.addActionListener(new StyledEditorKit.BoldAction());
        btnI.addActionListener(new StyledEditorKit.ItalicAction());

        tb.add(btnB);
        tb.add(btnI);
        tb.add(btnU);
        tb.addSeparator();
        tb.add(btnS);

        btnS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slot.setName((textPane.getText()));
            }
        });

    }
}
