package JavaSwing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableMVC {
    public static void main(String[] args) {
        JFrame frame=new JFrame("JTableMVC");
         String [] column = {"ID","Name","Age"};
         DefaultTableModel model = new DefaultTableModel(column,0);
         model.addRow(new Object[]{1,"Priyanshu",12});
         model.addRow(new Object[]{2,"Ankit",13});
         model.addRow(new Object[]{3,"Faiz",14});

         JTable table=new JTable(model);
         frame.add(new JScrollPane(table));
         frame.setSize(400,400);
         frame.setLocationRelativeTo(null);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);

    }
}
