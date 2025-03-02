import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;


public class BorderLayoputDemo extends JFrame{
    public BorderLayoputDemo()
    {

        
        JButton northbtn = new JButton("North");
        add(northbtn, BorderLayout.NORTH);

        JButton southbtn = new JButton("South");
        add(southbtn, BorderLayout.SOUTH);

        JButton eastbtn = new JButton("East");
        add(eastbtn, BorderLayout.EAST);

        JButton westbtn = new JButton("West");
        add(westbtn, BorderLayout.WEST);

        JButton centerbtn = new JButton("Center");
        add(centerbtn, BorderLayout.CENTER);




        //setLayout(new BorderLayout());
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Border Layout Demo");
    }

    public static void main(String[] args) {
        new BorderLayoputDemo();
    }
    
}
