import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Layout {

    
    public static void main(String[] args) {
        
        JFrame myFrame = new JFrame("Lab1");

        JLabel label1 = new JLabel("Num1:");
        label1.setBounds(150,50,80,20);
        myFrame.add(label1);

        JTextField field1 = new JTextField();
        field1.setBounds(200,52,120,20);
        myFrame.add(field1);

        JLabel label2 = new JLabel("Num2:");
        label2.setBounds(150,90,80,20);
        myFrame.add(label2);

        JTextField field2 = new JTextField();
        field2.setBounds(200,92,120,20);
        myFrame.add(field2);

        JButton btn1 = new JButton("Add");
        btn1.setBounds(160,150,60,20);
        myFrame.add(btn1);
       
        JButton btn2 = new JButton("Sub");
        btn2.setBounds(270,150,60,20);
        myFrame.add(btn2);


        JLabel res1 = new JLabel("Result:");
        res1.setBounds(170,200,80,20);
        myFrame.add(res1);

        JTextField res2 = new JTextField();
        res2.setBounds(215,202,100,20);
        myFrame.add(res2);

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());
                int sum = num1 + num2;
                res2.setText(String.valueOf(sum));
            }
            
        });

        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());
                int sub = num1 - num2;
                res2.setText(String.valueOf(sub));
            }
            
        });
        


        myFrame.setLayout(null);;
        myFrame.setSize(600,500);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(false);
       // myFrame.getContentPane().setBackground(Color.cyan);
    }

    

   
}

// package com.mycompany.swinglab1;

// import javax.swing.*;
// import java.awt.*;

// public class SwingLab1 extends JFrame {
//     public SwingLab1() {
//         JPanel panel = new JPanel();
//         panel.setLayout(null);  // Disable default layout manager
//         panel.setBackground(Color.green);
//         panel.setBounds(0, 0, 800, 800);  // Set bounds to fill the frame

//         JLabel label1 = new JLabel("Username:");
//         label1.setBounds(50, 50, 100, 30);
//         panel.add(label1);

//         JTextField textField1 = new JTextField();
//         textField1.setBounds(150, 50, 200, 30);
//         panel.add(textField1);

//         JLabel label2 = new JLabel("Password:");
//         label2.setBounds(50, 100, 100, 30);
//         panel.add(label2);

//         JTextField textField2 = new JTextField();
//         textField2.setBounds(150, 100, 200, 30);
//         panel.add(textField2);

//         JTextArea area = new JTextArea();
//         area.setBounds(50, 150, 300, 50);
//         panel.add(area);

//         JButton button = new JButton("Click me");
//         button.setBounds(150, 220, 100, 30);
//         panel.add(button);

//         // Add panel to the frame
//         add(panel);
        
//         setLayout(null); // Set layout of JFrame to null
//         setSize(800, 800);
//         setResizable(false);
//         setTitle("Swing Demo1");
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         SwingLab1 lab1 = new SwingLab1();
//     }
// }
