package JavaSwing;

import javax.swing.*;

public class ProgressBar {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Progress Bar Example");
        JProgressBar progressBar = new JProgressBar(0,100);

        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        frame.add(progressBar);
        frame.setSize(300,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        for(int i = 0 ;i<=100;i++){
            progressBar.setValue(i);
            Thread.sleep(100);
        }
    }
}
