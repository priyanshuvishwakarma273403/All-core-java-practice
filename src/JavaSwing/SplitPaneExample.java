package JavaSwing;

import javax.swing.*;

public class SplitPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SplitPaneExample");

        JTextArea area = new JTextArea();
        area.setText("Left Panel");
        JTextArea area2 = new JTextArea();
        area2.setText("Right Panel");

        JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,area,area2);
        pane.setDividerLocation(150);

        frame.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400,400);
        frame.setVisible(true);


    }
}
