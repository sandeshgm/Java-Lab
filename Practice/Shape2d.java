import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shape2d extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponents(g);

        g.setColor(Color.RED);
        g.fillRect(50,50,100,60);

        g.setColor(Color.GREEN);
        g.fillOval(80,50,100,80);
        
        
        g.drawRect(0,0,300,200); // only outline of rectangle
        


        
       
        
    }
    public static void main(String[] args) {

        
        JFrame myFrame= new JFrame("Shape");
        myFrame.setSize(500,500);
        myFrame.add(new Shape2d());
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocationRelativeTo(null);
        
       
    }
}
