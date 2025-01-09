package com.cowboysmall.jutter.sample;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class FlowLayoutDemo {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(FlowLayoutDemo::createAndShowGUI);
    }


    //_________________________________________________________________________

    private static void createAndShowGUI() {

        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
//        pane.setPreferredSize(new Dimension(800, 450));



        JPanel blue = new JPanel();
        blue.setPreferredSize(new Dimension(350, 100));
        blue.setBackground(Color.blue);
        pane.add(blue);

        JPanel yellow = new JPanel();
        yellow.setPreferredSize(new Dimension(300, 100));
        yellow.setBackground(Color.yellow);
        pane.add(yellow);

        JPanel cyan = new JPanel(new BorderLayout());
        cyan.setPreferredSize(new Dimension(300, 100));
        cyan.setBackground(Color.cyan);
        pane.add(cyan);

        JPanel green = new JPanel();
        green.setPreferredSize(new Dimension(350, 100));
        green.setBackground(Color.green);
        pane.add(green);

        JPanel red = new JPanel();
        red.setPreferredSize(new Dimension(560, 100));
        red.setBackground(Color.red);
        pane.add(red);



        // Show the Frame
        JFrame frame = new JFrame("Layout Demo");
        frame.setSize(new Dimension(960, 540));
//        frame.getContentPane().add(pane, BorderLayout.CENTER);
        frame.setContentPane(pane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

//        frame.pack();
        frame.setVisible(true);
    }
}
