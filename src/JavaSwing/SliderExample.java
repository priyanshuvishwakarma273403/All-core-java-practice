package JavaSwing;

import javax.swing.*;

public class SliderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SliderExample");
        JLabel label = new JLabel("Volume : 0");

        JSlider slider = new JSlider(0,100,0);
        slider.addChangeListener(e -> {
            int value = slider.getValue();
            label.setText("Volume : " + value);
        });

        frame.setLayout(null);
        slider.setBounds(50, 50, 200, 50);
        label.setBounds(50, 100, 200, 30);

        frame.add(slider);
        frame.add(label);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
