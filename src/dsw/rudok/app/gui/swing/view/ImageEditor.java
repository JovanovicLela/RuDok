package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.slot.Slot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ImageEditor extends JDialog {

    private JPanel panel;
    private JLabel lbl;
    private JButton btnImport;
    private Content content;

    public ImageEditor(Frame owner, String title, boolean modal, Slot slot) {
        super(owner, title, modal);

        ImageIcon img = new ImageIcon(getClass().getResource("images/edit.png"));
        this.setIconImage(img.getImage());

        content = new Content();
        setSize(new Dimension(320, 320));
        setJMenuBar(content);
        this.setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        lbl = new JLabel();
        lbl.setPreferredSize(new Dimension(60, 60));
        btnImport = new JButton("Import image");
        btnImport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                int dialog = jfc.showSaveDialog(null);
                if (dialog == JFileChooser.APPROVE_OPTION) {
                    File file = jfc.getSelectedFile();
                    String path = file.getAbsolutePath();
                    lbl.setIcon(scale(path));
                }
            }
        });

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(btnImport, BorderLayout.NORTH);
        panel.add(lbl, BorderLayout.CENTER);

        this.add(panel, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }
    public class Content extends JMenuBar{
        public Content() {
            JMenu file = new JMenu("File");
            file.add("Save content");
            add(file);
        }
    }
    public ImageIcon scale(String path){

        Image image = new ImageIcon(path).getImage();
        Image newI = image.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);

        return  new ImageIcon(newI);
    }
}