package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllSwingComponent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("All Swing Component");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));

        JLabel label = new JLabel("Enter your name:");
        frame.add(label);

        JTextField textField = new JTextField(15);
        frame.add(textField);

        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setEchoChar('*');
        frame.add(new JLabel("Enter your password:"));
        frame.add(passwordField);

        JButton button = new JButton("Submit");
        frame.add(button);

        JTextArea textArea = new JTextArea(5,25);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        JCheckBox checkBox = new JCheckBox("Java");
        JCheckBox checkBox1 = new JCheckBox("Python");
        JCheckBox checkBox2 = new JCheckBox("C++");
        frame.add(new JLabel("Select Your Skills"));
        frame.add(checkBox);
        frame.add(checkBox1);
        frame.add(checkBox2);

        JRadioButton radioButton = new JRadioButton("Male");
        JRadioButton radioButton1 = new JRadioButton("Female");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton);
        buttonGroup.add(radioButton1);
        frame.add(new JLabel("Gender"));
        frame.add(radioButton);
        frame.add(radioButton1);

        String [] countries = {"INDIA","USA","UK","CANADA"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        frame.add(new JLabel(" Select Country"));
        frame.add(comboBox);

        String [] languages ={"English","Hindi","French","German"};
        JList<String> list = new JList<>(languages);
        list.setVisibleRowCount(3);
        JScrollPane scrollPane1 = new JScrollPane(list);
        frame.add(new JLabel("Languages: "));
        frame.add(scrollPane1);

        String [][] data={{"1", "Priya", "Java"},
                {"2", "Rohit", "Python"},
                {"3", "Ankit", "C++"}};
        String [] column = {"ID", "Name","Skills"};
        JTable jTable = new JTable(data,column);
        JScrollPane scrollPane2 = new JScrollPane(jTable);
        jTable.setPreferredSize(new Dimension(300,100));
        frame.add(scrollPane2);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(open);
        file.add(exit);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        frame.setJMenuBar(menuBar);

        JProgressBar progressBar = new JProgressBar(0,100);
        progressBar.setValue(60);
        progressBar.setStringPainted(true);
        frame.add( new JLabel("Progress: "));
        frame.add(progressBar);

        JSlider slider = new JSlider(0,100,30);
        frame.add(new JLabel("Slider: "));
        frame.add(slider);

       button.addActionListener( new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               String name = textField.getText();
               String country =  comboBox.getSelectedItem().toString();
               textArea.setText("Hello "+name+ "\nYour Country "+country);
           }
       });
       frame.setVisible(true);
    }
}
