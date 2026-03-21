package JavaSwing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class TreeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree Example");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("C");
        DefaultMutableTreeNode d = new DefaultMutableTreeNode("D");

        root.add(a);
        root.add(b);
        root.add(c);
        root.add(d);

        JTree tree = new JTree(root);
        frame.add(new JScrollPane(tree));
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
