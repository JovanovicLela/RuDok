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

        img1 = new ImageIcon(getClass().getResource("blueIcon.png"));
        Image image1 = img1.getImage();
        Image newImg1 = image1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        img1 = new ImageIcon(newImg1);

        lelaSl = new JLabel(img1);
        lelaOpis = new JLabel("<html>Lela Jovanović <br/>ljovanovic5919rn@raf.rs</html>");
        lelaOpis.setForeground(Color.BLACK);
        lelaOpis.setFont(new Font("Times New Roman", Font.PLAIN, 21));

        img2 = new ImageIcon(getClass().getResource("redIcon.png"));
        Image image2 = img2.getImage();
        Image newImg2 = image2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        img2 = new ImageIcon(newImg2);

        andrijanaSl = new JLabel(img2);
        andrijanaOpis = new JLabel("<html>Andrijana Dimić <br/>adimic7820rn@raf.rs</html>");
        andrijanaOpis.setForeground(Color.BLACK);
        andrijanaOpis.setFont(new Font("Times New Roman", Font.PLAIN, 21));

        add(lelaSl);
        add(lelaOpis);
        add(andrijanaSl);
        add(andrijanaOpis);

        setLayout(new GridLayout(2, 2, 10, 10));
        getContentPane().setBackground(Color.lightGray);
        setResizable(false);
        setVisible(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);




    }
}
