package dsw.rudok.app.gui.swing.view;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class StatusBar extends JPanel {

    public LocalDateTime now = null;
    private JTextField tfDate;

    public StatusBar() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        tfDate = new JTextField("Datum i vreme: " + sdf.format(new Date()));
        tfDate.setEditable(false);


        add(tfDate);

    }



}
