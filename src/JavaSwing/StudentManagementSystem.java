package JavaSwing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StudentManagementSystem  extends JFrame implements ActionListener {
    private JTextField nameField, ageField, courseField;
    private JButton addbutton, loadbutton, clearbutton;
    private JTable table;
    private DefaultTableModel model;

    private static final String url = "jdbc:mysql://localhost:3306/Practice";
    private static final String user = "root";
    private static final String password = "pop99558$$";

    public StudentManagementSystem() throws SQLException {
        setTitle("Student Management System");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel input = new JPanel(new GridLayout(4, 2, 10, 10));
        input.add(new JLabel("Name:"));
        nameField = new JTextField();
        input.add(nameField);

        input.add(new JLabel("Age:"));
        ageField = new JTextField();
        input.add(ageField);

        input.add(new JLabel("Course:"));
        courseField = new JTextField();
        input.add(courseField);

        addbutton = new JButton("Add Student");
        loadbutton = new JButton("Load Student");
        clearbutton = new JButton("Clear Student");

        input.add(addbutton);
        input.add(loadbutton);
        input.add(clearbutton);

        add(input, BorderLayout.NORTH);

        model = new DefaultTableModel(new String[]{"ID", "Name", "Age", "Course"}, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        addbutton.addActionListener(this);
        loadbutton.addActionListener(this);
        clearbutton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addbutton) {
            addStudents();
        } else if (e.getSource() == loadbutton) {
            loadStudents();
        } else if (e.getSource() == clearbutton) {
            clearFields();

        }
    }

    private void addStudents() {
        String name = nameField.getText();
        String age = ageField.getText();
        String course = courseField.getText();

        if (name.isEmpty() || age.isEmpty() || course.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO students (name,age,course) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, Integer.parseInt(age));
            ps.setString(3, course);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Student Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
            loadStudents();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }
    private void loadStudents(){
        model.setRowCount(0);
        try(Connection con = DriverManager.getConnection(url,user,password)){
            String query = "Select * from students ";
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query);
           while(rs.next()){
               model.addRow(new Object[]{
                       rs.getInt("ID"),
                       rs.getString("Name"),
                       rs.getInt("Age"),
                       rs.getString("Course")
               });
           }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void clearFields(){
        nameField.setText("");
        ageField.setText("");
        courseField.setText("");
    }
    public static void main(String[] args) throws SQLException {
        new StudentManagementSystem().setVisible(true);

    }
}
