package Project4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentForm extends JFrame implements ActionListener {
    JTextField nameField, courseField, gradeField;
    JButton addBtn, viewBtn, deleteBtn;
    JTextArea output;
    StudentDAO dao = new StudentDAO();

    public StudentForm() {
        setTitle("Student Form");
        setSize(500, 500);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);
        add(nameField);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 100, 100, 30);
        add(courseLabel);

        courseField = new JTextField();
        courseField.setBounds(150, 100, 200, 30);
        add(courseField);

        JLabel gradeLabel = new JLabel("Grade:");
        gradeLabel.setBounds(50, 150, 100, 30);
        add(gradeLabel);

        gradeField = new JTextField();
        gradeField.setBounds(150, 150, 200, 30);
        add(gradeField);

        addBtn = new JButton("Add Student");
        addBtn.setBounds(50, 200, 140, 30);
        addBtn.addActionListener(this);
        add(addBtn);

        viewBtn = new JButton("View All");
        viewBtn.setBounds(200, 200, 100, 30);
        viewBtn.addActionListener(this);
        add(viewBtn);

        deleteBtn = new JButton("Delete");
        deleteBtn.setBounds(310, 200, 100, 30);
        deleteBtn.addActionListener(this);
        add(deleteBtn);

        output = new JTextArea();
        output.setBounds(50, 250, 360, 150);
        add(output);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            String name = nameField.getText();
            String course = courseField.getText();
            String grade = gradeField.getText();
            dao.addStudent(new Student(name, course, grade));
            JOptionPane.showMessageDialog(this, "Student Added Successfully");

        } else if (e.getSource() == viewBtn) {
            List<Student> list = dao.getAllStudents();
            output.setText("");
            for (Student s : list) {
                output.append(s.getId() + " | " + s.getName() + " | " + s.getCourse() + " | " + s.getGrade() + "\n");
            }
        } else if (e.getSource() == deleteBtn) {
            String idStr = JOptionPane.showInputDialog("Enter ID to delete:");
            dao.deleteStudent(Integer.parseInt(idStr));
            JOptionPane.showMessageDialog(this, "Deleted Successfully!");
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(()-> {
            new StudentForm();
        });
    }
}
