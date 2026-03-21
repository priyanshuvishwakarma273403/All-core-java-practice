package JavaSwing;

import javax.swing.*;

public class JToolbarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JToolbarExample");

        JToolBar toolbar = new JToolBar();
        JButton button1 = new JButton("New");
        JButton button2 = new JButton("Save");
        JButton button3 = new JButton("Exit!");

        toolbar.add(button1);
        toolbar.add(button2);
        toolbar.add(button3);

        frame.add(toolbar,"North");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
