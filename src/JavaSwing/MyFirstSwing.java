package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class MyFirstSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toxic");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JLabel label = new JLabel("Hello World");
         JButton button = new JButton("Click Me");
         label.setIcon(new ImageIcon("icon/download.jpg"));
         button.setForeground(Color.white);
         button.setBackground(Color.blue);
         frame.setLayout(null);
         label.setBounds(100, 50, 300, 100);
         button.setBounds(100, 100, 100, 30);

         JTextArea textArea = new JTextArea("Hello World");
         textArea.setBounds(100, 100, 150, 30);
         textArea.setEditable(false);
         frame.add(textArea);
         String [] str = {"Java","Python","C++"};
         JComboBox combo = new JComboBox(str);
         combo.setBounds(100, 300, 150, 30);
         frame.add(combo);



         String [] cities = {"Delhi","Mumbai","UttarPradesh"};
         JList list = new JList(cities);
         list.setBounds(100, 200, 150, 60);
         frame.add(list);

         frame.setLayout(new FlowLayout(FlowLayout.CENTER));




            frame.add(label);
            frame.add(button);

            button.addActionListener( e -> {
                System.out.println("Button clicked");
            });
         frame.setVisible(true);
    }
}
