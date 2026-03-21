package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameMaking  {
    public JFrame jframe;
    JLabel jLabel;
    JTextField jTextField;
     public JFrameMaking(){
       jframe=new JFrame("This is jframe");
       jframe.setTitle("JFrameMaking");
       JTextArea jTextArea=new JTextArea();
       jTextArea.setBounds(20,120,300,300);
       jTextArea.setBackground(Color.CYAN);
       jTextArea.setForeground(Color.RED);
       jTextArea.setFont(new Font("Times New Roman",Font.BOLD,20));
       jframe.add(jTextArea);

       JButton jButton=new JButton("text Count");
       jButton.setBounds(250,45,100,20);
       jframe.add(jButton);
         JLabel jLabel=new JLabel("");
         jLabel.setBounds(20,50,100,20);
         jframe.add(jLabel);

       jButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String text=jTextField.getText();
               String array[] = text.split(" ");
               jLabel.setText("Total Char " +text.length()+"Total word "+array.length);

           }
       });


       JButton button = new JButton("Click Me");
       button.setBounds(130,40,100,30);

       JLabel label = new JLabel("this is a jFrame");
       label.setBounds(20,35,200,40);
       jframe.add(label);

       JTextField jTextField = new JTextField("");
       jTextField.setBounds(20,90,200,20);
       jframe.add(jTextField);
       button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               label.setText("SuccessFully click");
             jTextField.setText("Successfully click");
           }
       });


       jframe.add(button);
       jframe.setLayout(null);
       jframe.setSize(400,400);
       jframe.setVisible(true);
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
         new JFrameMaking();
    }
}
