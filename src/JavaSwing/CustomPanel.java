package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.fillOval(50, 50, 100, 100);

        g2.setColor(Color.RED);
        g2.drawString("Custom Drawing!", 80, 180);

    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.add(new CustomPanel());
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
