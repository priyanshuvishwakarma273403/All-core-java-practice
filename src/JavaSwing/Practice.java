package JavaSwing;
import javax.swing.*;
import java.awt.*;

public class Practice {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);


        JButton button = new JButton("Submit");
        button.setBounds(300,200,100,50);
        frame.add(button);

        frame.setVisible(true);
    }
}
