package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class BasicPractice {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Swing Example Flow Layout");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,15,15));

        ImageIcon image=new ImageIcon("icon/about.png");
        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(Color.DARK_GRAY);

        JLabel label=new JLabel("Enter your name:");
        frame.add(label);

        ImageIcon image1=new ImageIcon("icon/about.png");
        frame.setIconImage(image1.getImage());
        label.setBounds(40,20,50,50);
        label.setIcon(image1);


        JTextField textField=new JTextField(15);
        frame.add(textField);

        JButton button=new JButton("Submit");
        frame.add(button);

        JTextArea textArea=new JTextArea(8,25);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane=new JScrollPane(textArea);
        frame.add(scrollPane);

        button.addActionListener(e -> {
            String name=textField.getText().trim();
            if(name.isEmpty()){
                textArea.setText("Please enter your name");
            }
            else{
                textArea.setText("Hello "+name+"!"+"\nWelcome to java swing");
            }
        });
        frame.setVisible(true);
    }
}
