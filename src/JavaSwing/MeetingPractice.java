//package JavaSwing;
//
//import javax.swing.*;
//import java.awt.*;
//import java.io.File;
//import javax.swing.border.Border;
//import javax.swing.border.LineBorder;
//
//
//public class MeetingPractice {
//    public static void main(String[] args) {
//
//        SwingUtilities.invokeLater(() -> {
//            JLabel label = new JLabel();
//            JFrame frame = new JFrame();
//            frame.setLayout(null);
//
//            JTextArea text = new JTextArea("Brand Name: Toxic\n" +
//                    "Top Speed: 400 kmph\n" +
//                    "Color: Phantom Black\n" +
//                    "Engine: V8 (800 Horse Power)");
//
//            JButton buttonPlay = new JButton("▶ Play");
//            JButton buttonPause = new JButton("⏸ Pause");
//            JButton buttonStop = new JButton("⏹ Stop");
//
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setResizable(false);
//            frame.setSize(600, 500);
//            frame.setTitle("Cars");
//            frame.getContentPane().setBackground(Color.BLACK);
//            frame.getRootPane().setBorder(new LineBorder(Color.WHITE, 5));
//            frame.setLocationRelativeTo(null);
//
//            Border border = BorderFactory.createLineBorder(Color.WHITE, 3);
//            ImageIcon image2 = new ImageIcon("D:\\java\\Array\\icon\\download.jpg");
//
//            label.setText("Speed...");
//            label.setForeground(Color.WHITE);
//            label.setIcon(image2);
//            label.setHorizontalTextPosition(JLabel.CENTER);
//            label.setVerticalTextPosition(JLabel.TOP);
//            label.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 19));
//            label.setBackground(Color.BLACK);
//            label.setOpaque(true);
//            label.setBorder(border);
//            label.setVerticalAlignment(JLabel.CENTER);
//            label.setHorizontalAlignment(JLabel.CENTER);
//            label.setBounds(0, 0, 200, 130);
//
//            text.setBounds(210, 10, 360, 100);
//            text.setBackground(Color.BLACK);
//            text.setForeground(Color.WHITE);
//            text.setLineWrap(true);
//            text.setWrapStyleWord(true);
//            text.setEditable(false);
//            text.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 15));
//
//            buttonPlay.setBounds(100, 130, 100, 30);
//            buttonPause.setBounds(250, 130, 100, 30);
//            buttonStop.setBounds(400, 130, 100, 30);
//            buttonPlay.setForeground(Color.WHITE);
//            buttonPause.setForeground(Color.WHITE);
//            buttonStop.setForeground(Color.WHITE);
//            buttonPlay.setBackground(Color.DARK_GRAY);
//            buttonPause.setBackground(Color.DARK_GRAY);
//            buttonStop.setBackground(Color.DARK_GRAY);
//
//            // === VIDEO PANEL ===
//            JFXPanel jfx = new JFXPanel();
//            jfx.setBounds(50, 180, 500, 250);
//            frame.add(jfx);
//
//            frame.add(label);
//            frame.add(text);
//            frame.add(buttonPlay);
//            frame.add(buttonPause);
//            frame.add(buttonStop);
//
//            frame.setVisible(true);
//
//            // === SETUP VIDEO (only once) ===
//            Platform.runLater(() -> {
//                try {
//                    String videoPath = "D:\\java\\Array\\icon\\5991156-hd_1280_720_30fps.mp4";
//                    Media media = new Media(new File(videoPath).toURI().toString());
//                    MediaPlayer player = new MediaPlayer(media);
//                    MediaView view = new MediaView(player);
//
//                    // Proper auto-resize
//                    view.setPreserveRatio(true);
//
//                    StackPane pane = new StackPane(view);
//                    Scene scene = new Scene(pane, 500, 250, javafx.scene.paint.Color.BLACK);
//                    view.fitWidthProperty().bind(scene.widthProperty());
//                    view.fitHeightProperty().bind(scene.heightProperty());
//
//                    jfx.setScene(scene);
//
//                    // Force layout update
//                    Platform.runLater(() -> {
//                        scene.getRoot().applyCss();
//                        scene.getRoot().layout();
//                    });
//
//                    // === BUTTON ACTIONS ===
//                    buttonPlay.addActionListener(e -> Platform.runLater(player::play));
//                    buttonPause.addActionListener(e -> Platform.runLater(player::pause));
//                    buttonStop.addActionListener(e -> Platform.runLater(player::stop));
//
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            });
//        });
//    }
//}
