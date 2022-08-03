package com.needsfornerds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Clock extends JFrame {

    private JLabel clockLabel;

    public Clock() {

        super.setTitle("DateTime Clock");
        super.setSize(500, 200);
        super.setLocation(500, 100);
        super.setVisible(true);
    }

    public void createGUI() {

        clockLabel = new JLabel("Clock is ticking");
        clockLabel.setFont(new Font("Calibre", Font.BOLD, 30));
        this.add(clockLabel);
    }

    public void setClock() {

        Timer timer =  new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toString();
                clockLabel.setText(dateTime);
            }
        });

        timer.start();
    }
}
