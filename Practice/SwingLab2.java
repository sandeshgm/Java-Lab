import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingLab2 extends JFrame {

    public SwingLab2()
    {

        String[] cities = {"Kathmandu","Lalitpur","Bhaktapur","Butwal","Chitwan"};
        JComboBox cbox = new JComboBox(cities); 
        cbox.setBounds(30,50,100,20);

        //---------------checkbox in java----------------

        JCheckBox ckbox1 = new JCheckBox("Mo-Mo");
        ckbox1.setBounds(30,80,80,20);

        JCheckBox ckbox2 = new JCheckBox("Chawmin");
        ckbox2.setBounds(110,80,80,20);

        JCheckBox ckbox3 = new JCheckBox("Burger");
        ckbox3.setBounds(200,80,80,20);

        JCheckBox ckbox4 = new JCheckBox("Pizza");
        ckbox4.setBounds(280,80,80,20);




        //---------------radio button in java---------------


        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Serif", Font.BOLD,20));
        gender.setForeground(Color.GRAY);
        gender.setBounds(30,120,80,20);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(30,150,80,20);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(110,150,80,20);




        //----------------list field in java---------------------

        String[] sports = {"Cricket","Football","Volleyball","Basketball","Baseball"};
        JList myJList = new JList(sports);
        myJList.setBounds(30,200,100,150);




        //-------------------Menu bar in java---------------

        JMenuBar menuBar = new JMenuBar();  //Main menu bar

        JMenu fileMenu = new JMenu("File"); //Menu options
        JMenuItem newfile = new JMenuItem("New File");
        JMenu saveMenu = new JMenu("Save");  //file menu items
        //JMenuItem saveAs = new JMenuItem("Save as");
        
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("Save as");


        JMenu selectionMenu = new JMenu("Selection");
        JMenu openMenu = new JMenu("Open");

        JMenu runMenu = new JMenu("Run"); //menu options
        JMenuItem debug = new JMenuItem("Debug");//run menu items
        debug.setEnabled(false);
        JMenuItem compile = new JMenuItem("Compile");
        

        

        //----adding menu options in menu bar
        menuBar.add(fileMenu);
        menuBar.add(selectionMenu);
        menuBar.add(openMenu);
        menuBar.add(runMenu);
        

        //--adding menu items in file menu
        fileMenu.add(newfile);
        fileMenu.add(saveMenu);

        
        //------sub menu item in save menue
        saveMenu.add(save);
        saveMenu.add(saveAs);



        //--adding run items in run menu
        runMenu.add(debug);
        runMenu.add(compile);




        //-------------------Table---------------------

        String[] column = {"Name", "Faculty","Age"};
        String[][] data = {{"Ram","BCA","21"},{"Sita","CSIT","20"},
                          {"Gita","BBM","23"},{"Shyam","BCA","24"},
                          {"Hari","BBM","22"},
                          {"Gita","BCA","20"},
                          {"Laxman","BCA","19"}
                        };
        JTable table = new JTable(data, column);

        JScrollPane pane= new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pane.setBounds(450,80,400,100);



        //----------------
        JLabel label = new JLabel("Hello World!");
        label.setBounds(450,200,450,150);

        Font myFont = new Font("Chiller",Font.BOLD,40);
        label.setFont(myFont);
        label.setForeground(Color.RED);

        //---------adding components-------
        add(ckbox1);
        add(ckbox2);
        add(ckbox3);
        add(ckbox4);
        add(male);
        add(female);
        add(myJList);
        add(pane);
        add(gender);
        add(label);
        
       
        add(cbox);

        
        setJMenuBar(menuBar);
        setLayout(null);
        setSize(1080,800);
        setTitle("Swing Lab2");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        
        SwingLab2 l2 = new SwingLab2();
    }
}
