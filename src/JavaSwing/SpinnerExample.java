package JavaSwing;

import javax.swing.*;

public class SpinnerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpinnerExample");
        SpinnerModel value = new SpinnerNumberModel(0,0,100,2);
        JSpinner spinner = new JSpinner(value);
        frame.add(spinner);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        }
    }
