import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Button;


import javax.swing.*;
// The javax.swing.JFrame class is a type of container which inherits the java.awt.Frame class
// "JPanel, a part of Java Swing package, is a container that can store a group of components. The main task of JPanel is to organize components, various layouts can be set in JPanel which provide better organisation of components, however it does not have a title bar." -geeksforgeeks

public class Display {

    JFrame window;
    Container bucket;
    JPanel panelTitle;
    JLabel labelTitle;
    JPanel panelButton;
    JButton labelButton;
    Font fontTitle = new Font("Times New Roman", Font.PLAIN, 28);

    public static void main(String[] args) {

        new Display();
    }

    public Display() {
        // creates window, sets window size, sets background color
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.pack();
        // can use the JFrame default layout or set to null for custom layout
        // default is called border layout and can position elements in five different regions (top, bottom, left, right, center)
        // each region can only contain ONE component in border layout!
        window.setLayout(new BorderLayout());
        window.setVisible(true);
        bucket = window.getContentPane();

        panelTitle = new JPanel();
        // creating a new panel for adding game content to
        panelTitle.setBounds(100, 100, 600, 150);
        panelTitle.setBackground(Color.black);
        JLabel labelTitle = new JLabel("My label");
        labelTitle.setText("Don't Lose Your Marbles!");
        labelTitle.setForeground(Color.white);
        labelTitle.setFont(fontTitle);

        panelButton = new JPanel();
        panelButton.setBounds(300, 400, 200, 100);
        panelButton.setBackground(Color.blue);

        labelButton = new JButton("START!");
        labelButton.setBackground(Color.black);
        labelButton.setForeground(Color.black);
        labelButton.setText("Click me to start!");


        panelButton.add(labelButton);
        panelTitle.add(labelTitle);
        bucket.add(panelTitle);
        bucket.add(panelButton);
    }
}
