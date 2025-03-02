import java.awt.Color;

import javax.swing.*; 

public class CollegeManagement extends JFrame {

    public CollegeManagement()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,1000,800);



        //---Menu Bar--------------
        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem open= new JMenuItem("Open");
        JMenuItem exit= new JMenuItem("Exit");
        file.add(open);
        file.add(exit);
        menuBar.add(file);

        JMenu student = new JMenu("Student");
        JMenuItem info = new JMenuItem("Info");
        student.add(info);
        menuBar.add(student);

        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");
        help.add(about);
        menuBar.add(help);
        
       
        



        //----------------Student Registration Field-----------------------
        JLabel stdRes = new JLabel("Student Registration");
        stdRes.setBounds(100,10,150,30);
        panel.add(stdRes);

        JLabel name = new JLabel("Full Name:");
        name.setBounds(10,50,80,30);
        panel.add(name);
        
        JTextField namField = new JTextField();
        namField.setBounds(80,55,200,20);
        panel.add(namField);

        JLabel add = new JLabel("Address:");
        add.setBounds(10,80,80,30);
        panel.add(add);

        JTextField addField = new JTextField();
        addField.setBounds(80,85,200,20);
        panel.add(addField);

        JLabel age = new JLabel("age:");
        age.setBounds(10,110,80,30);
        panel.add(age);

        JTextField ageField = new JTextField();
        ageField.setBounds(80,115,200,20);
        panel.add(ageField);

        JLabel email = new JLabel("Email:");
        email.setBounds(10,140,80,30);
        panel.add(email);

        JTextField emaField = new JTextField();
        emaField.setBounds(80,145,200,20);
        panel.add(emaField);

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(10,170,80,30);
        panel.add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(70,170,70,30);
        panel.add(male);

        JRadioButton feMale = new JRadioButton("Female");
        feMale.setBounds(150,170,80,30);
        panel.add(feMale);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(230,170,80,30);
        panel.add(other);


        //------------------Departmemt Field--------------------
        JLabel depart = new JLabel("Department");
        depart.setBounds(400,40,100,30);
        panel.add(depart);

        String []departmentList = {"Science","Management","Arts","Computer Science"};
        JComboBox departmemnBox = new JComboBox<>(departmentList);
        departmemnBox.setBounds(400,70,120,20);
        panel.add(departmemnBox);


        //----Courses--------
        JLabel course = new JLabel("Course");
        course.setBounds(600,40,100,30);
        panel.add(course);

        String []courses = {"Java","Mobile Programming","Economics","Networking System"};
        JList list = new JList<>(courses);
        

        JScrollPane pane = new JScrollPane(list);
        pane.setBounds(600,70,150,40);
        panel.add(pane);

      
        
        //----Hobbies--------------
        JLabel hobbies = new JLabel("Hobbies:");
        hobbies.setBounds(500,150,80,30);
        panel.add(hobbies);

        JCheckBox sports = new JCheckBox("Sports");
        sports.setBounds(580,150,70,30);
        panel.add(sports);

        JCheckBox music = new JCheckBox("Sports");
        music.setBounds(650,150,70,30);
        panel.add(music);

        JCheckBox dance = new JCheckBox("dance");
        dance.setBounds(720,150,70,30);
        panel.add(dance);

        JCheckBox arts = new JCheckBox("Sports");
        arts.setBounds(790,150,70,30);
        panel.add(arts);
       


        //----register button---
        JButton btn  = new JButton("Register");
        btn.setBounds(380,250,100,40);
        btn.setBackground(Color.CYAN);
        panel.add(btn);




        //--------------------table-----------------------
        String data[][]= {{"Ram Magar","Baneshwor","21","ram@gmail.com","male","Science"},
                          {"Sita Thapa","Bhaktapur","20","sita@gmail.com","female","Computer Science"},
                          {"Gita Shrestha","Lalitpur","23","gita@gmail.com","female","Arts"},
                          {"Hari Pandey","Kirtipur","25","hari@gmail.com","male","Management"},};
        String column[]={"Name","Address","Age","Email","Gender","Department"};
        JTable table  = new JTable(data,column);

        JScrollPane tabPane= new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        tabPane.setBounds(10,350,700,100);



        add(tabPane);
        setJMenuBar(menuBar);
        add(panel);
        setSize(1000,800);
        setLayout(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("College Management System(Sandesh Gharti Magar)");
    }
    public static void main(String[] args) {
        CollegeManagement c = new CollegeManagement();
    }
}
