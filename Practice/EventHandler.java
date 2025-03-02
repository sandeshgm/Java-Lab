import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventHandler extends JFrame {
    public EventHandler()
    {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,600,600);
        

        JLabel label1 = new JLabel("Username:");
        label1.setBounds(50, 50, 100, 30);
        panel.add(label1);

        JTextField field1 = new JTextField();
        field1.setBounds(125, 55, 200, 20);
        panel.add(field1);

        JLabel label2 = new JLabel("Email:");
        label2.setBounds(50, 82, 100, 30);
        panel.add(label2);

        JTextField field2 = new JTextField();
        field2.setBounds(125, 87, 200, 20);
        panel.add(field2);

        JLabel label3 = new JLabel("Password:");
        label3.setBounds(50, 110, 100, 30);
        panel.add(label3);

        JPasswordField field3 = new JPasswordField();
        field3.setBounds(125, 117, 200, 20);
        panel.add(field3);

        JLabel label4 = new JLabel("re-password:");
        label4.setBounds(50, 145, 100, 30);
        panel.add(label4);

        JPasswordField field4 = new JPasswordField();
        field4.setBounds(125, 150, 200, 20);
        panel.add(field4);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(160,300,150,100);
        panel.add(textArea);

        JButton signup = new JButton("Sign up");
        signup.setBounds(160,200,100,40);
        signup.setBackground(Color.green);
        panel.add(signup);

        //---action listener
    
        signup.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent e){
                String username = field1.getText();
                String email = field2.getText();
                String password = new String(field3.getPassword());

            textArea.setText("username: " + username + "\n" 
            +"email: " + email + "\n" 
            +"Password: " + password);

            }
        });
            
                
            
        

        add(panel);
        setLayout(null);
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventHandler e = new EventHandler();
    }

    
}