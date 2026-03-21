package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Student Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(100,10,300,30);
        frame.add(title);

        JLabel name = new JLabel("Full Name: ");
        name.setBounds(50,60,100,25);
        frame.add(name);

        JTextField nameField = new JTextField();
        nameField.setBounds(180,60,200,25);
        frame.add(nameField);

        JLabel gender = new JLabel("Gender: ");
        gender.setBounds(50,100,100,25);
        frame.add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(180,100,80,25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(260,100,100,25);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);
        frame.add(male);
        frame.add(female);

        JLabel course = new JLabel("Course: ");
        course.setBounds(50,140,100,25);
        frame.add(course);

        String []  courses = {"B.Tech","B.Sc","BCA","MBA"};
        JComboBox<String> courseComboBox = new JComboBox<>(courses);
        courseComboBox.setBounds(180,140,200,25);
        frame.add(courseComboBox);

        JLabel year = new JLabel("Year: ");
        year.setBounds(50,180,100,25);
        frame.add(year);

        String [] years = {"1st Year", "2nd Year", "3rd Year","4th Year"};
        JComboBox<String> yearComboBox = new JComboBox<>(years);
        yearComboBox.setBounds(180,180,200,25);
        frame.add(yearComboBox);

       JLabel contact = new JLabel("Contact No: ");
       contact.setBounds(50,220,100,25);
       frame.add(contact);

       JTextField contactField = new JTextField();
       contactField.setBounds(50,220,200,25);
       frame.add(contactField);

       JLabel emailLabel = new JLabel("Email ID: ");
       emailLabel.setBounds(50,260,100,25);
       frame.add(emailLabel);

       JTextField email = new JTextField();
       email.setBounds(180,260,200,25);
       frame.add(email);

       JTextField skill = new JTextField("Skills:");
       skill.setBounds(50,300,100,25);
       frame.add(skill);

       JCheckBox java = new JCheckBox("Java");
       java.setBounds(180,300,80,25);
       JCheckBox python = new JCheckBox("Python");
       python.setBounds(260,300,100,25);
       JCheckBox web = new JCheckBox("Web Dev");
       web.setBounds(360,300,100,25);
       frame.add(java);
       frame.add(python);
       frame.add(web);

       JLabel address = new JLabel("Address: ");
       address.setBounds(50,340,100,25);
       frame.add(address);

       JTextArea addressArea = new JTextArea();
       addressArea.setBounds(180,340,200,80);
       addressArea.setLineWrap(true);
       addressArea.setWrapStyleWord(true);
       frame.add(addressArea);

       JButton submit = new JButton("Submit");
       submit.setBounds(180,450,100,30);
       frame.add(submit);

       JButton clearButton = new JButton("Clear");
       clearButton.setBounds(270,450,100,30);
       frame.add(clearButton);

       submit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String name = nameField.getText();
               String gender =male.isSelected() ? "Male" : female.isSelected() ?  "Male":"Not Selected";
               String course = courseComboBox.getSelectedItem().toString();
               String year = yearComboBox.getSelectedItem().toString();
               String contact = contactField.getText();
               String email = emailLabel.getText();

               String skills ="";
               if(java.isSelected()) skills+="Java";
               if(python.isSelected()) skills+="Python";
               if(web.isSelected()) skills+="Web Dev";

               String address = addressArea.getText();
               JOptionPane.showMessageDialog(frame,"Student Registration Form has been created Successfully/n/n"+
                       "Name: "+name+"\nGender: "+gender+"\nCourse: "+course+"\nYear: "+year+
                       "\nContact: "+contact+"\nEmail: "+email+"\nSkills: "+skills+"\nAddress"+address);
           }
       });
       clearButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               nameField.setText("");
               contactField.setText("");
               email.setText("");
               addressArea.setText("");
               gender.setText("");
               java.setSelected(false);
               python.setSelected(false);
               web.setSelected(false);
               courseComboBox.setSelectedIndex(0);
               yearComboBox.setSelectedIndex(0);
           }
       });
        frame.setVisible(true);
    }
}
