package JDBC;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CrudOperation extends JFrame {

    // Database Connection Details
    private static final String URL = "jdbc:mysql://localhost:3306/achs";
    private static final String USER = "root";
    private static final String PASSWORD = "#@sandesh1721@#";

    // Labels
    JLabel name, address, age, gender, faculty;

    // Input Fields
    JTextField nameField, addressField, ageField;

    // Buttons
    JButton addBtn, updateBtn, deleteBtn;

    // Dropdown
    JComboBox<String> facultyBox;

    // Radio Buttons for Gender
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;

    // Table Model and Table
    JTable table;
    DefaultTableModel model;
    JScrollPane pane;

    public CrudOperation() {
        // Frame Settings
        setSize(1000, 600);
        setLayout(null);
        getContentPane().setBackground(new Color(173, 216, 230));
        setTitle("Crud Operation: College");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Name Label
        name = new JLabel("Name:");
        name.setBounds(25, 30, 60, 30);
        name.setFont(new Font("Serif", Font.BOLD, 14));
        add(name);

        // Name Input Field
        nameField = new JTextField();
        nameField.setBounds(100, 30, 200, 30);
        add(nameField);

        // Address Label
        address = new JLabel("Address:");
        address.setBounds(25, 70, 60, 30);
        address.setFont(new Font("Serif", Font.BOLD, 14));
        add(address);

        // Address Input Field
        addressField = new JTextField();
        addressField.setBounds(100, 70, 200, 30);
        add(addressField);

        // Age Label
        age = new JLabel("Age:");
        age.setBounds(25, 110, 50, 30);
        age.setFont(new Font("Serif", Font.BOLD, 14));
        add(age);

        // Age Input Field
        ageField = new JTextField();
        ageField.setBounds(100, 110, 200, 30);
        add(ageField);

        // Gender Label
        gender = new JLabel("Gender:");
        gender.setBounds(25, 150, 60, 30);
        gender.setFont(new Font("Serif", Font.BOLD, 14));
        add(gender);

        // Gender Radio Buttons
        genderMale = new JRadioButton("Male");
        genderMale.setBounds(100, 150, 75, 30);
        genderMale.setBackground(new Color(173, 216, 230));

        genderFemale = new JRadioButton("Female");
        genderFemale.setBounds(170, 150, 100, 30);
        genderFemale.setBackground(new Color(173, 216, 230));

        // Grouping Gender Buttons
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);

        add(genderMale);
        add(genderFemale);

        // Faculty Label
        faculty = new JLabel("Faculty:");
        faculty.setBounds(25, 190, 60, 30);
        faculty.setFont(new Font("Serif", Font.BOLD, 14));
        add(faculty);

        // Faculty Dropdown
        String[] facultyList = { "BCA", "CSIT", "BBM" };
        facultyBox = new JComboBox<>(facultyList);
        facultyBox.setBounds(100, 190, 80, 25);
        facultyBox.setBackground(new Color(173, 200, 200));
        add(facultyBox);

        // Buttons
        addBtn = new JButton("Add");
        addBtn.setBounds(50, 280, 90, 35);
        addBtn.setFont(new Font("Courier New", Font.BOLD, 16));
        addBtn.setBackground(new Color(34, 230, 34));
        addBtn.setForeground(Color.WHITE);
        add(addBtn);

        updateBtn = new JButton("Update");
        updateBtn.setBounds(150, 300, 90, 35);
        updateBtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
        updateBtn.setBackground(new Color(200, 230, 34));
        updateBtn.setForeground(Color.BLACK);
        add(updateBtn);

        deleteBtn = new JButton("Delete");
        deleteBtn.setBounds(250, 280, 100, 35);
        deleteBtn.setFont(new Font("Courier New", Font.BOLD, 16));
        deleteBtn.setBackground(new Color(210, 34, 34));
        deleteBtn.setForeground(Color.WHITE);
        add(deleteBtn);

        // Table Setup
        String[] columnNames = { "RollNo", "Name", "Age", "Address", "Gender", "Faculty" };
        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);
        table.setRowHeight(25);

        pane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pane.setBounds(420, 25, 550, 400);
        add(pane);

        // Button Action: Add to Database
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                    PreparedStatement psmt = connection.prepareStatement(
                            "INSERT INTO studentsinfo(name, age, address, gender, faculty) VALUES(?, ?, ?, ?, ?)");

                    psmt.setString(1, nameField.getText());
                    psmt.setInt(2, Integer.parseInt(ageField.getText())); // Fixing Data Type Issue
                    psmt.setString(3, addressField.getText());
                    psmt.setString(4, genderMale.isSelected() ? "Male" : "Female");
                    psmt.setString(5, facultyBox.getSelectedItem().toString());

                    psmt.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Record Added Successfully!");
                    fetchData();
                    psmt.close();

                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Database Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        updateBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow(); // Get selected row index
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Please select a row to update!", "Update Error",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int rollNo = (int) model.getValueAt(selectedRow, 0);
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                    PreparedStatement psmt = connection.prepareStatement(
                            "UPDATE studentsinfo set name=?, age=?,address=?,gender=?,faculty=? where rollNo=? ");

                    psmt.setString(1, nameField.getText());
                    psmt.setInt(2, Integer.parseInt(ageField.getText())); // Fixing Data Type Issue
                    psmt.setString(3, addressField.getText());
                    psmt.setString(4, genderMale.isSelected() ? "Male" : "Female");
                    psmt.setString(5, facultyBox.getSelectedItem().toString());
                    psmt.setInt(6, rollNo);

                    psmt.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Record Updated Successfully!");
                    fetchData();
                    psmt.close();


                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Database Error",
                            JOptionPane.ERROR_MESSAGE);

                }
            }
        });


        deleteBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow(); // Get selected row index
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Please select a row to update!", "Update Error",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                    
                }
                int rollNo = (int) model.getValueAt(selectedRow, 0);


                try {
                    
                    Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);

                    PreparedStatement psmt = connection.prepareStatement("DELETE FROM studentsinfo where rollNo=?");

                    psmt.setInt(1, rollNo);

                    psmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record delated Successfully!");

                    fetchData();
                    psmt.close();


                    

                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Database Error",
                    JOptionPane.ERROR_MESSAGE);

                }
            }

            
        });

        setVisible(true);
    }

    public void fetchData() {
        model.setRowCount(0);
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement psmt = connection.prepareStatement("SELECT * FROM studentsinfo");
            ResultSet rs = psmt.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[] { rs.getInt("rollNo"),
                        rs.getString("name"),
                        rs.getString("age"),
                        rs.getString("address"),
                        rs.getString("gender"),
                        rs.getString("faculty")
                });
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        CrudOperation cr = new CrudOperation();
        cr.fetchData();
        
    }
}
