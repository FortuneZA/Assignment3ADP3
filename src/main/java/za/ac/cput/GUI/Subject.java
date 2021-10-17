package za.ac.cput.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Subject extends JFrame implements ActionListener{

    private JPanel panelNorth;
    private JPanel panelCenter;
    private JPanel panelSouth;
    private JLabel lblHeading;
    private JLabel lblStudentId;
    private JTextField txtStudentId;
    private JLabel lblFirstName;
    private JTextField txtFirstName;
    private JLabel lblLastName;
    private JTextField txtLastName;
    private JLabel lblStudentEmail;
    private JTextField txtStudentEmail;
    private JLabel lblCourseID;
    private JTextField txtCourseID;
    private JButton btnCreate ;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnExit;
    private Font ft1, ft2, f3;

    public Subject() {
        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        lblHeading = new JLabel("New Student");
        lblStudentId = new JLabel("Student Id: ");
        txtStudentId = new JTextField();
        lblFirstName = new JLabel("First Name: ");
        txtFirstName = new JTextField();
        lblLastName = new JLabel("Lastname: ");
        txtLastName = new JTextField();
        lblStudentEmail = new JLabel("Student Email: ");
        txtStudentEmail = new JTextField();
        lblCourseID = new JLabel("CourseID: ");
        txtCourseID = new JTextField();

        btnCreate = new JButton("Create");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnExit = new JButton("Exit");

        ft1 = new Font("Arial", Font.BOLD, 32);
        ft2 = new Font("Arial", Font.PLAIN, 20);

    }

    public void setGUI() {
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(5, 2));
        panelSouth.setLayout(new GridLayout(1, 4));
        panelNorth.add(lblHeading);
        lblHeading.setFont(ft1);
        lblHeading.setForeground(Color.RED);
        panelNorth.setBackground(Color.LIGHT_GRAY);
        panelCenter.setBorder(new EmptyBorder(70, 0, 0, 70));

        lblStudentId.setFont(ft2);
        lblStudentId.setHorizontalAlignment(JLabel.RIGHT);
        txtStudentId.setHorizontalAlignment(JTextField.LEFT);
        txtStudentId.setFont(ft2);
        lblStudentId.setBounds(30,15, 100,30);
        panelCenter.add(lblStudentId);
        panelCenter.add(txtStudentId);

        lblFirstName.setFont(ft2);
        lblFirstName.setHorizontalAlignment(JLabel.RIGHT);
        txtFirstName.setFont(ft2);
        panelCenter.add(lblFirstName);
        panelCenter.add(txtFirstName);


        lblLastName.setFont(ft2);
        lblLastName.setHorizontalAlignment(JLabel.RIGHT);
        txtLastName.setFont(ft2);
        panelCenter.add(lblLastName);
        panelCenter.add(txtLastName);

        lblStudentEmail.setFont(ft2);
        lblStudentEmail.setHorizontalAlignment(JLabel.RIGHT);
        txtStudentEmail.setFont(ft2);
        panelCenter.add(lblStudentEmail);
        panelCenter.add(txtStudentEmail);

        lblCourseID.setFont(ft2);
        lblCourseID.setHorizontalAlignment(JLabel.RIGHT);
        txtCourseID.setFont(ft2);
        panelCenter.add(lblCourseID);
        panelCenter.add(txtCourseID);
        panelCenter.setBackground(new Color(218,219, 219));
        panelSouth.setBackground(new Color(218,219, 219));


        btnCreate.setFont(ft2);
        btnUpdate.setFont(ft2);
        btnDelete.setFont(ft2);
        btnExit.setFont(ft2);
        panelSouth.setBorder(new EmptyBorder(100, 200, 100, 100));

        panelSouth.add(btnCreate);
        panelSouth.add(btnUpdate);
        panelSouth.add(btnDelete);
        panelSouth.add(btnExit);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCreate.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnExit.addActionListener(this);
        this.pack();
        this.setSize(600, 600);
        this.setVisible(true);
    }
    private void resetForm() {
        txtStudentId.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtStudentEmail.setText("");
        txtCourseID.setText("");
        txtStudentId.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Create")) {
//          Student student = new Student(
//                                         txtFirstName.getText(),
//                                         txtLastName.getText(),
//                                         txtStudentEmail.getText(),
//                                           txtCourseID.getText());
//               student.submit();
//               resetForm();
        }

        else if (e.getActionCommand().equals("Update")) {
            resetForm();
        }
        else if (e.getActionCommand().equals("Delete")) {

        }
        else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }

    }
    public static void main(String[] args) {
        new Subject().setGUI();
    }


}
