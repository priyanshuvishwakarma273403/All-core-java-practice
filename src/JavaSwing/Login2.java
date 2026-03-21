package JavaSwing;

import javax.swing.*;

public class Login2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm();
            JFrame frame = new JFrame("My form");
            frame.setLayout(null);

            JLabel username = new JLabel("Username");
            JLabel password = new JLabel("Password");
            JTextField usernameField = new JTextField();
            JPasswordField passwordField = new JPasswordField();
            JButton loginButton = new JButton("Login");

            username.setBounds(50, 50, 100, 30);
            password.setBounds(50, 100, 100, 30);
            usernameField.setBounds(150, 50, 150, 30);
            passwordField.setBounds(150, 100, 150, 30);
            loginButton.setBounds(150, 150, 100, 30);

            frame.add(username);
            frame.add(password);
            frame.add(usernameField);
            frame.add(passwordField);
            frame.add(loginButton);

            loginButton.addActionListener(e -> {
                String user = usernameField.getText();
                String pass = passwordField.getText();

                if(user.equalsIgnoreCase("Toxic") && pass.equals("12345")) {
                    JOptionPane.showMessageDialog(frame, "Welcome Login Successfully");
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Wrong Username or Password");
                }
            });
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
