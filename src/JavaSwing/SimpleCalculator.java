package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField num1Field , num2Field,num3Field,resultField;
    private JButton addButton,subButton,multiButton,divButton,clearButton;
     public SimpleCalculator()  {
         setTitle(" Simple Calculator");
         setSize(350,250);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new GridLayout(6,2,10,10));

         JLabel label = new JLabel("Enter First Number:");
         JLabel label2 = new JLabel("Enter Second Number:");
         JLabel label3 = new JLabel("Result:");

         num1Field = new JTextField();
         num2Field = new JTextField();
         num3Field = new JTextField();
         resultField = new JTextField();
         resultField.setEditable(false);

         addButton = new JButton("Add");
         subButton = new JButton("Subtract");
         multiButton = new JButton("Multiply");
         divButton = new JButton("Divide");
         clearButton = new JButton("Clear");

         addButton.addActionListener(this);
         subButton.addActionListener(this);
         multiButton.addActionListener(this);
         divButton.addActionListener(this);
         clearButton.addActionListener(this);

         add(label);
         add(num1Field);
         add(label2);
         add(num2Field);
         add(label3);
         add(resultField);
         add(addButton);
         add(subButton);
         add(multiButton);
         add(divButton);
         add(clearButton);

         setLocationRelativeTo(null);
         setVisible(true);

     }

    @Override
    public void actionPerformed(ActionEvent e) {
         try{
             double num1 = Double.parseDouble(num1Field.getText());
             double num2 = Double.parseDouble(num2Field.getText());
             double result = 0;

             if(e.getSource() == addButton){
                 result = num1 + num2;
             }
             else if(e.getSource() == subButton){
                 result = num1 - num2;
             }
             else if(e.getSource() == multiButton){
                 result = num1 * num2;
             }
             else if(e.getSource() == divButton){
                 result = num1 / num2;
             }
             else if(e.getSource() == clearButton){
                 resultField.setText("");
             }
            num1Field.setText("");
             num2Field.setText("");
             resultField.setText("");
             resultField.setText(String.valueOf(result));
             return;
         }
         catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Please enter a Valid Number!");
         }
         catch (ArithmeticException ex){
             JOptionPane.showMessageDialog(this,"Error: " + "Please enter a Valid Number!");
         }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
