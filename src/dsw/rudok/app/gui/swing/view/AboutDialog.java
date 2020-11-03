package dsw.rudok.app.gui.swing.view;

import javax.swing.*;
import java.awt.*;

public class AboutDialog  extends JDialog {

    private ImageIcon img1, img2;
    private JLabel lelaOpis, andrijanaOpis;
    private JLabel lelaSl, andrijanaSl ;

    public  AboutDialog(){

        setTitle("About info");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 3, screenHeight / 2);
        setLocationRelativeTo(null);


    }
}
