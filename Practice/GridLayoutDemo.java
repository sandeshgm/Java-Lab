import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class GridLayoutDemo extends JFrame {

    //----------------------CardLayput,BoxLayput,SpringLayput,Grouplayout------------------------
    
    public GridLayoutDemo()
    {

        JButton btn1 = new JButton("Button 1");
   

        JButton btn2 = new JButton("Button 2");
     

        JButton btn3 = new JButton("Button 3");
      

        JButton btn4 = new JButton("Button 4");
   

        JButton btn5 = new JButton("Button 5");
      

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        



        setLayout(new GridLayout(3,2,10,10));
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Border Layout Demo");
    }
    public static void main(String[] args) {
        GridLayoutDemo g = new GridLayoutDemo();
    }
}

