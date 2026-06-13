package college.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddStudent extends JFrame implements ActionListener {
    JTextField textName, textFather,textempID,textAddress, textPhone, textEmail, textM10, textM12, textAadhar, textCetno,textCetrank, textIncome,textcaste;
    JLabel empText;
    JDateChooser cDob;
    JComboBox<String> courseBox, departmentBox;
    JButton submit, cancel;

    //Random ran = new Random();
    //long f1 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    AddStudent() {
        getContentPane().setBackground(new Color(128, 176, 255));

        JLabel heading = new JLabel("New Student Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50, 150, 100, 30);
        name.setFont(new Font("serif", Font.BOLD, 20));
        add(name);

        textName = new JTextField();
        textName.setBounds(200, 150, 150, 30);
        add(textName);

        JLabel fname = new JLabel("Father Name");
        fname.setBounds(400, 150, 200, 30);
        fname.setFont(new Font("serif", Font.BOLD, 20));
        add(fname);

        textFather = new JTextField();
        textFather.setBounds(600, 150, 150, 30);
        add(textFather);

        JLabel empID = new JLabel("Roll_no");
        empID.setBounds(50, 200, 200, 30);
        empID.setFont(new Font("serif", Font.BOLD, 20));
        add(empID);

        textempID = new JTextField();
        textempID.setBounds(200, 200, 150, 30);
        textempID.setFont(new Font("serif", Font.BOLD, 20));
        add(textempID);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(400, 200, 200, 30);
        dob.setFont(new Font("serif", Font.BOLD, 20));
        add(dob);

        cDob = new JDateChooser();
        cDob.setBounds(600, 200, 150, 30);
        add(cDob);

        JLabel address = new JLabel("Address");
        address.setBounds(50, 250, 200, 30);
        address.setFont(new Font("serif", Font.BOLD, 20));
        add(address);

        textAddress = new JTextField();
        textAddress.setBounds(200, 250, 150, 30);
        add(textAddress);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(400, 250, 200, 30);
        phone.setFont(new Font("serif", Font.BOLD, 20));
        add(phone);

        textPhone = new JTextField();
        textPhone.setBounds(600, 250, 150, 30);
        add(textPhone);

        JLabel email = new JLabel("Email");
        email.setBounds(50, 300, 200, 30);
        email.setFont(new Font("serif", Font.BOLD, 20));
        add(email);

        textEmail = new JTextField();
        textEmail.setBounds(200, 300, 150, 30);
        add(textEmail);

        JLabel m10 = new JLabel("class_X (%)");
        m10.setBounds(400, 300, 200, 30);
        m10.setFont(new Font("serif", Font.BOLD, 20));
        add(m10);

        textM10 = new JTextField();
        textM10.setBounds(600, 300, 150, 30);
        add(textM10);

        JLabel m12 = new JLabel("class_Xii (%)");
        m12.setBounds(50, 350, 200, 30);
        m12.setFont(new Font("serif", Font.BOLD, 20));
        add(m12);

        textM12 = new JTextField();
        textM12.setBounds(200, 350, 150, 30);
        add(textM12);

        JLabel aadharNo = new JLabel("Aadhar Number");
        aadharNo.setBounds(400, 350, 200, 30);
        aadharNo.setFont(new Font("serif", Font.BOLD, 20));
        add(aadharNo);

        textAadhar = new JTextField();
        textAadhar.setBounds(600, 350, 150, 30);
        add(textAadhar);

        JLabel qualification = new JLabel("Course");
        qualification.setBounds(50, 400, 200, 30);
        qualification.setFont(new Font("serif", Font.BOLD, 20));
        add(qualification);

        String[] course = {"BE"};
        courseBox = new JComboBox<>(course);
        courseBox.setBounds(200, 400, 150, 30);
        courseBox.setBackground(Color.WHITE);
        add(courseBox);

        JLabel department = new JLabel("Branch");
        department.setBounds(400, 400, 200, 30);
        department.setFont(new Font("serif", Font.BOLD, 20));
        add(department);

        String[] branches = {"CSE", "ECE", "AIML", "ME", "CE"};
        departmentBox = new JComboBox<>(branches);
        departmentBox.setBounds(600, 400, 150, 30);
        departmentBox.setBackground(Color.WHITE);
        add(departmentBox);

        JLabel Cetno = new JLabel("Cet No.");
        Cetno.setBounds(50,450,200,30);
        Cetno.setFont(new Font("serif",Font.BOLD,20));
        add(Cetno);

        textCetno = new JTextField();
        textCetno.setBounds(200,450,150,30);
        add(textCetno);

        JLabel Cetrank = new JLabel("Cet Rank");
        Cetrank.setBounds(400,450,200,30);
        Cetrank.setFont(new Font("serif",Font.BOLD,20));
        add(Cetrank);

        textCetrank = new JTextField();
        textCetrank.setBounds(600,450,150,30);
        add(textCetrank);

        JLabel Income = new JLabel("IncomeCert NO.");
        Income.setBounds(50,500,200,30);
        Income.setFont(new Font("serif",Font.BOLD,20));
        add(Income);

        textIncome = new JTextField();
        textIncome.setBounds(200,500,150,30);
        add(textIncome);

        JLabel caste = new JLabel("CasteCert No.");
        caste.setBounds(400,500,200,30);
        caste.setFont(new Font("serif",Font.BOLD,20));
        add(caste);

        textcaste = new JTextField();
        textcaste.setBounds(600,500,150,30);
        add(textcaste);

        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);

        setSize(900, 700);
        setLocation(350, 50);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String name = textName.getText();
            String fname = textFather.getText();
            String empid = empText.getText();
            String dob = ((JTextField) cDob.getDateEditor().getUiComponent()).getText();
            String address = textAddress.getText();
            String phone = textPhone.getText();
            String email = textEmail.getText();
            String x = textM10.getText();
            String xii = textM12.getText();
            String aadhar = textAadhar.getText();
            String course = (String) courseBox.getSelectedItem();
            String department = (String) departmentBox.getSelectedItem();
            String Cetno = textCetno.getText();
            String Cetrank = textCetrank.getText();
            String Income = textIncome.getText();
            String caste = textcaste.getText();

            if (!phone.matches("\\d{10}") || !aadhar.matches("\\d{12}")) {
                JOptionPane.showMessageDialog(null, "Invalid phone or aadhar number!");
                return;
            }

            try {
                String q = "INSERT INTO student4 (name, fname, rollno, dob, address, phone, email, class_X, class_Xii, aadhar, course, branch,Cetno,Cetrank,Income,caste) " +
                        "VALUES('" + name + "', '" + fname + "', '" + empid + "', '" + dob + "', '" + address + "', '" + phone + "', '" + email + "', '" +
                        x + "', '" + xii + "', '" + aadhar + "', '" + course + "', '" + department + "','" + Cetno + "','"+Cetrank+"','"+Income+"','"+caste+"' )";
                Conn c = new Conn();
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Student Added Successfully");
                setVisible(false);
                new StudentDetails();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddStudent();
    }
}