package com.cowboysmall.jutter.sample.swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import java.awt.Font;

public class Demo1 {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(Demo1::createAndShowGUI);
    }


    //_________________________________________________________________________

    private static void createAndShowGUI() {

        JFrame frame = new JFrame("Title");
        frame.setFont(new Font("Arial", Font.PLAIN, 16));

        try {

            // String className = getLookAndFeelClassName("GTK");
            String className = "com.bulenkov.darcula.DarculaLaf";
            UIManager.setLookAndFeel(className);


        } catch (Exception ignored) {
        }

        frame.setJMenuBar(getJMenuBar());
        frame.setSize(1600, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    private static JMenuBar getJMenuBar() {

        JMenu fileMenu = new JMenu("File");


        JMenuItem newItem = new JMenuItem("New");
        fileMenu.add(newItem);

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        JMenuItem recentItem = new JMenuItem("Recent Projects");
        fileMenu.add(recentItem);

        JMenuItem closeItem = new JMenuItem("Close Project");
        fileMenu.add(closeItem);

        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);


        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);

        return menuBar;
    }

    private static String getLookAndFeelClassName(String nameSnippet) {

        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
            if (info.getName().contains(nameSnippet))
                return info.getClassName();
        return null;
    }
}
