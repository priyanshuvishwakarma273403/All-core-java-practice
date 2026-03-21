package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Regiistraction implements ActionListener {
    JLabel heading;
    static JLabel username;
    JLabel email;
    JLabel address;
    JLabel course;
    JLabel mobileNumber;
    JLabel password;
    JTextField Tusername, Temail, Taddress, Tcourse, TmobileNumber;
    JPasswordField Tpassword;
    JButton button;

    Regiistraction() {
        JFrame frame = new JFrame();
        frame.setTitle("Student Registration Form");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.CYAN);

        heading = new JLabel("Student Registration Form");
        heading.setBounds(120, 30, 250, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 18));
        heading.setForeground(Color.blue);

        Font font = new Font("Arial", Font.BOLD, 14);
        Font font1 = new Font("monospace", Font.BOLD, 14);

        username = new JLabel("Username");
        username.setBounds(50, 80, 150, 40);
        username.setFont(font);
        username.setForeground(Color.blue);

        Tusername = new JTextField();
        Tusername.setBounds(150, 85, 200, 30);
        Tusername.setFont(font1);
        Tusername.setForeground(Color.GRAY);

        email = new JLabel("Email    :");
        email.setBounds(50, 120, 150, 40);
        email.setFont(font);
        email.setForeground(Color.blue);

        Temail = new JTextField();
        Temail.setBounds(150, 125, 200, 30);
        Temail.setFont(font1);
        Temail.setForeground(Color.GRAY);

        address = new JLabel("Address    :");
        address.setBounds(50, 160, 150, 40);
        address.setFont(font);
        address.setForeground(Color.blue);

        Taddress = new JTextField();
        Taddress.setBounds(150, 165, 200, 30);
        Taddress.setFont(font1);
        Taddress.setForeground(Color.GRAY);

        course = new JLabel("Course    :");
        course.setBounds(50, 200, 150, 40);
        course.setFont(font);
        course.setForeground(Color.blue);

        Tcourse = new JTextField();
        Tcourse.setBounds(150, 205, 200, 30);
        Tcourse.setFont(font1);
        Tcourse.setForeground(Color.GRAY);


        mobileNumber = new JLabel("Mobile No    :");
        mobileNumber.setBounds(50, 245, 150, 40);
        mobileNumber.setFont(font);
        mobileNumber.setForeground(Color.blue);

        TmobileNumber = new JTextField();
        TmobileNumber.setBounds(150, 250, 200, 30);
        TmobileNumber.setFont(font1);
        TmobileNumber.setForeground(Color.GRAY);

        password = new JLabel("Password    :");
        password.setBounds(50, 280, 150, 40);
        password.setFont(font);
        password.setForeground(Color.blue);

        Tpassword = new JPasswordField();
        Tpassword.setBounds(150, 285, 200, 30);
        Tpassword.setFont(font1);
        Tpassword.setForeground(Color.GRAY);

        button = new JButton("Register");
        button.setBounds(200, 345, 120, 30);
        button.setFont(font);
        button.setForeground(Color.white);
        button.setBackground(Color.blue);
        button.addActionListener(this);

        // Add components
        frame.add(heading);
        frame.add(username);
        frame.add(Tusername);
        frame.add(email);
        frame.add(Temail);
        frame.add(address);
        frame.add(Taddress);
        frame.add(course);
        frame.add(Tcourse);
        frame.add(mobileNumber);
        frame.add(TmobileNumber);
        frame.add(password);
        frame.add(Tpassword);
        frame.add(button);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> {
            new Regiistraction();
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String username = Tusername.getText();
            String email = Temail.getText();
            String address = Taddress.getText();
            String course = Tcourse.getText();
            String mobile = TmobileNumber.getText();
            char[] password = Tpassword.getPassword();
            String pass = String.valueOf(password);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pop99558$$");

            String query = "insert into student_form (username,email,address,course,mobileNumber,password) values (?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1,username);
            pst.setString(2,email);
            pst.setString(3,address);
            pst.setString(4,course);
            pst.setString(5,mobile);
            pst.setString(6,pass);

            int result = pst.executeUpdate();
            if(result > 0){
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Registration Successful");
            }
        }
        catch (SQLException | ClassNotFoundException e1 ){
            System.out.println(e1.getMessage());
        }
    }
}
