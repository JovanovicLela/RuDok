package dsw.rudok.app.gui.swing.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StatusBar extends JPanel {

    public LocalDateTime now = null;
    private JTextField tfDate;

    public StatusBar() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        tfDate = new JTextField("Date and time: " + sdf.format(new Date()));
        tfDate.setEditable(true);


        new Timer(1000, new ActionListener() // setujemo menjanje vremena u donjem levom uglu prozora
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String formatDateTime = now.format(formatter);
                tfDate.setText("Date and time: " + formatDateTime);
            }
        }).start();


        add(tfDate);

    }



}
