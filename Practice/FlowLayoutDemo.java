import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class FlowLayoutDemo extends JFrame {

    public FlowLayoutDemo()

    {
        //JPanel panel = new JPanel();

        JButton btn1 = new JButton("Button 1");
        //panel.add(btn1);

        JButton btn2 = new JButton("Button 2");
        //panel.add(btn2);

        JButton btn3 = new JButton("Button 3");
        //panel.add(btn3);

        JButton btn4 = new JButton("Button 4");
       // panel.add(btn4);

        JButton btn5 = new JButton("Button 5");
        //panel.add(btn5);

        JButton btn6 = new JButton("Button 6");
        //panel.add(btn6);

        JButton btn7 = new JButton("Button 7");
        //panel.add(btn7);


        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);


        //add(panel);

        
        setLayout(new FlowLayout());
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Flow Layout Demo");
    }

    public static void main(String[] args) {
        FlowLayoutDemo f = new FlowLayoutDemo();
    }
}
