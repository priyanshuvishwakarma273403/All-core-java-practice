package JavaSwing;

import javax.swing.*;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Example");

        String [][] data ={
            {"101", "Priyanshu", "A"},
            {"102", "Ankit", "A"},
            {"103", "Faiz", "A"}
        };
        String [] column ={"ID", "Name", "Grade"};
        JTable table = new JTable(data,column);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
