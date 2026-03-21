package JavaSwing;

import javax.swing.*;

public class JfileChooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File chooser example");
        JButton button = new JButton("Select File");
        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);
            if(result == JFileChooser.APPROVE_OPTION){
                String filepath = fileChooser.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(frame, "Selected file: " + filepath);
            }
        });
        JOptionPane.showMessageDialog(null, "Hello, User!");
        String name = JOptionPane.showInputDialog("Enter your name:");
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?");

        frame.add(button);
        frame.setSize(300,200);
        frame.setLayout(null);
        button.setBounds(80,80,123,30);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
