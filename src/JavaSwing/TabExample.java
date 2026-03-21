package JavaSwing;

import javax.swing.*;

public class TabExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tab Example");
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        panel.add(new JLabel("This is Home Tab!"));
        panel1.add(new JLabel("This is Setting Tab!"));
        panel2.add(new JLabel("Hello boss!"));
        panel3.add(new JLabel("Hello World!"));
        panel4.add(new JLabel("Hello Jemes Goslin!"));

        tabbedPane.add("Home", panel);
        tabbedPane.add("Setting", panel1);
        tabbedPane.add("About", panel2);
        tabbedPane.add("Cut", panel3);
        tabbedPane.add("Move", panel4);

        frame.add(tabbedPane);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
