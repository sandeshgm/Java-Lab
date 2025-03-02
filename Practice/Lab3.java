import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Lab3 extends JFrame{

    private JLabel label1,label2,res;
    private JTextField field1, field2, result;
    private JButton calc;
    
    public Lab3(){

        label1 = new JLabel("Num1:");
        label1.setBounds(50,25,50,20);
        add(label1);      

        label2 = new JLabel("Num2:");
        label2.setBounds(50,70,50,20);
        add(label2);

        field1 = new JTextField();
        field1.setBounds(100,25,120,25);
        add(field1);

        field2 = new JTextField();
        field2.setBounds(100,70,120,25);
        add(field2);


        res = new JLabel("Rersult:");
        res.setBounds(70,120,50,30);
        add(res);

        result = new JTextField();
        result.setBounds(120,120,100,25);
        result.setBackground(Color.LIGHT_GRAY);
        add(result);


        calc = new JButton("Calculate");
        calc.setBounds(120,160,100,30);
        calc.setBackground(Color.CYAN);
        add(calc);


        calc.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());

                int sum = num1 + num2;
                result.setText(String.valueOf(sum));
            }
        });

        calc.addMouseListener(new MouseAdapter() {
    
            public void  mouseReleased(MouseEvent e){
                
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());

                int sub = num1 - num2;
                result.setText(String.valueOf(sub));
            }
        });


        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Lab:3 (Sandesh Gharti Magar)");


    }

    
    public static void main(String[] args) {
        new Lab3();
    }
    
}
