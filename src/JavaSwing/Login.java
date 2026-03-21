package JavaSwing;

import Project4.StudentForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login  implements ActionListener {
    JFrame jf;
    JLabel heading,email,password;
    JTextField temail;
    JPasswordField tpassword;
    JButton jb;
    Login(){
        jf=new JFrame("Login Form");
        jf.setSize(400,400);
        jf.setResizable(false);
        jf.getContentPane().setBackground(Color.BLACK);

        Font f1 = new Font("Arial", Font.BOLD, 14);
        Font f2 = new Font("monospace", Font.PLAIN, 14);

        heading = new  JLabel("Student Login Form");
        heading.setBounds(60, 50, 300, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);

        email = new  JLabel("Email     :");
        email.setBounds(50, 120, 150, 40);
        email.setFont(f1);
        email.setForeground(Color.white);

        temail = new JTextField();
        temail.setBounds(150, 125, 200, 30);
        temail.setFont(f2);
        temail.setForeground(Color.GRAY);

        password = new JLabel("Password :");
        password.setBounds(50, 170, 150, 40);
        password.setFont(f1);
        password.setForeground(Color.WHITE);

        tpassword = new JPasswordField();
        tpassword.setBounds(150, 170, 200, 30);
        tpassword.setFont(f2);
        tpassword.setForeground(Color.GRAY);

        jb = new JButton("Submit");
        jb.setBounds(190, 220, 100, 30);
        jb.addActionListener(this);

        jf.add(heading);jf.add(email);jf.add(temail);
        jf.add(password);jf.add(tpassword);jf.add(jb);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        String email = temail.getText();
        char[] password = tpassword.getPassword();
        String pass = String.valueOf(password);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","pop99558$$");
            String query = "select * from student_form where email=? And password=?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1,email);
            pst.setString(2,pass);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(jf,"Student Login Form Successfully");
               jf.dispose(); //for close
               new StudentForm();
            }
            else {
                JOptionPane.showMessageDialog(jf,"Invalid Email or Password");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        } catch (SQLException ex) {
            System.out.println("SQLException");
        }
    }
}
