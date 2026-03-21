package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm();

        JFrame frame = new JFrame("Login Form");
        frame.setLayout(null);

        JLabel label = new JLabel("Username");
        JLabel password = new JLabel("Password");
        JTextField textField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton login = new JButton("Login");

        label.setBounds(50, 50, 100, 30);
        password.setBounds(50, 100, 100, 30);
        textField.setBounds(150, 50, 150, 30);
        passwordField.setBounds(150, 100, 150, 30);
        login.setBounds(150, 150, 100, 30);

        frame.add(label);
        frame.add(password);
        frame.add(textField);
        frame.add(passwordField);
        frame.add(login);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 String user = textField.getText();
                 String pass = new String(passwordField.getPassword());

                 if(user.equals("admin") && pass.equals("1234")) {
                     JOptionPane.showMessageDialog(frame, "Welcome Login Successfully");
                 } else{
                     JOptionPane.showMessageDialog(frame, "Wrong Username or Password");
                 }
            }
        });

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        });
    }
}
