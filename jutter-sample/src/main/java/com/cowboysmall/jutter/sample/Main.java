package com.cowboysmall.jutter.sample;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import java.awt.Font;

public class Main {

    public static String getLookAndFeelClassName(String nameSnippet) {

        String className = null;

        UIManager.LookAndFeelInfo[] plafs = UIManager.getInstalledLookAndFeels();

        for (UIManager.LookAndFeelInfo info : plafs) {

            String name = info.getName();
            System.out.println(name);

            if (name.contains(nameSnippet)) {

                className = info.getClassName();
            }
        }
        return className;
    }

    public static void main(String[] args) {



        JFrame frame = new JFrame("Title");
        frame.setFont(new Font("Arial", Font.PLAIN, 12));
        frame.setJMenuBar(getJMenuBar());

        try {

//            String className = getLookAndFeelClassName("GTK");
//            UIManager.setLookAndFeel(className);
            UIManager.setLookAndFeel("com.bulenkov.darcula.DarculaLaf");

        } catch(Exception ignored){}

        frame.setSize(1600, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JMenuBar getJMenuBar() {

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem recentItem = new JMenuItem("Recent Projects");
        JMenuItem closeItem = new JMenuItem("Close Project");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(recentItem);
        fileMenu.add(closeItem);

        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        return menuBar;
    }
}
