/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swinglab1;

import javax.swing.*;
import java.awt.*;

public class SwingLab1 extends JFrame
{
    public SwingLab1()
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        
        JLabel label1 = new JLabel("Username");
        panel.add(label1);
        
        JTextField textField1 = new JTextField(20);
        panel.add(textField1);
        
        JPasswordField label2 = new JPasswordField("Password");
        panel.add(label2);
        
        JTextField textField2 = new JTextField(20);
        panel.add(textField2);
        
        JTextArea area = new JTextArea(2,10);
        panel.add(area);
        
        JButton button = new JButton("Click me");
        panel.add(button);
        
        add(panel);
        
        //by deffault layout is in a horizontal way or flow layout
        setSize(800,800);
        setResizable(false);
        setTitle("Swing Demo1");  
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        
       SwingLab1 lab1 = new SwingLab1();
       
    }
}