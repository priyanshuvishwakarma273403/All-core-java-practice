package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(4, 1, 10, 10)); // 4 rows, 1 column

        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Submit");
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                if (name.isEmpty()) {
                    textArea.setText("Please enter your name first!");
                } else {
                    textArea.setText("Hello, " + name + "!\nWelcome to Java Swing 💫");
                }
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(new JScrollPane(textArea));

        frame.setVisible(true);
    }
}
