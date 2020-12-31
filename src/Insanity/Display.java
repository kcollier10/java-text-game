package Insanity;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
    Font fontTitle = new Font("Times New Roman", Font.PLAIN, 50);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 25);
    JPanel mainTextPanel;
    JTextArea mainTextArea;
    JPanel choiceButtons;
    JButton choice1, choice2, choice3, choice4;

    TitleScreenHandler tsHandler = new TitleScreenHandler();

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
        panelTitle.add(labelTitle);
//        bucket.add(panelTitle);
        bucket.add(panelTitle, BorderLayout.PAGE_START);

        panelButton = new JPanel();
        panelButton.setBounds(300, 400, 200, 100);
        panelButton.setBackground(Color.blue);


        labelButton = new JButton("START!");
        labelButton.setSize(50, 50);
        labelButton.setFont(normalFont);
        labelButton.setBackground(Color.black);
        labelButton.setForeground(Color.black);
        labelButton.setText("Click me to start!");
        panelButton.add(labelButton);
        labelButton.addActionListener(tsHandler);
        // when this is clicked, tsHandler will be called


        bucket.add(panelButton);
//        bucket.add(panelButton, BorderLayout.PAGE_END);
    }

    public void GameDisplay() {
        bucket.remove(panelButton);
        bucket.remove(panelTitle);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.green);
        bucket.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.green);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        // text-wrapping - if text is too long, it is wrapped automatically

        mainTextPanel.add(mainTextArea);

        choiceButtons = new JPanel();
        choiceButtons.setBounds(250, 350, 100, 50);
        choiceButtons.setBackground(Color.BLACK);
        bucket.add(choiceButtons);
        choiceButtons.setLayout(new GridLayout(4,1));
//        choiceButtons.setSize(50, 50);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.BLACK);
        choice1.setSize(50, 50);
        choice1.setForeground(Color.green);
        choice1.setFont(normalFont);
        choiceButtons.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.green);
        choice2.setFont(normalFont);
        choiceButtons.add(choice2);

        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.green);
        choice3.setFont(normalFont);
        choiceButtons.add(choice3);

        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.BLACK);
        choice4.setForeground(Color.green);
        choice4.setFont(normalFont);
        choiceButtons.add(choice4);

    }

    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            // default style to use handler
            GameDisplay();
        }

    }
}
