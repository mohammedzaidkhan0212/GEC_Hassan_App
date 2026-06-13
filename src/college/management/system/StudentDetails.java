package college.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends JFrame implements ActionListener {
    JTable table;
    JComboBox<String> branchBox;
    JButton search, addStudent, update, cancel;

    StudentDetails() {
        setLayout(null);

        JLabel heading = new JLabel("Branchwise Student Details");
        heading.setBounds(300, 20, 400, 30);
        heading.setFont(new Font("serif", Font.BOLD, 28));
        add(heading);

        JLabel branchLabel = new JLabel("Select Branch:");
        branchLabel.setBounds(50, 80, 150, 30);
        branchLabel.setFont(new Font("serif", Font.BOLD, 20));
        add(branchLabel);

        String[] branches = {"CSE", "ECE", "AIML", "ME", "CE"};
        branchBox = new JComboBox<>(branches);
        branchBox.setBounds(200, 80, 150, 30);
        branchBox.setBackground(Color.WHITE);
        add(branchBox);

        search = new JButton("Search");
        search.setBounds(400, 80, 120, 30);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        add(search);

        addStudent = new JButton("Add Student");
        addStudent.setBounds(550, 80, 150, 30);
        addStudent.setBackground(Color.BLACK);
        addStudent.setForeground(Color.WHITE);
        addStudent.addActionListener(this);
        add(addStudent);

        update = new JButton("Update");
        update.setBounds(50, 600, 120, 30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);

        cancel = new JButton("Cancel");
        cancel.setBounds(200, 600, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        table = new JTable();
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(50, 150, 800, 400);
        add(sp);

        setSize(900, 700);
        setLocation(350, 50);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            String branch = (String) branchBox.getSelectedItem();

            try {
                Conn c = new Conn();
                String query = "SELECT * FROM student4 WHERE branch = '" + branch + "'";
                ResultSet rs = c.statement.executeQuery(query);

                table.setModel(DbUtils.resultSetToTableModel(rs)); // Populate the JTable
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == addStudent) {
            new AddStudent();
            setVisible(false);
        } else if (e.getSource() == update) {
            // Get selected row
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                // Retrieve roll number of the selected student
                String rollNo = table.getValueAt(selectedRow, 2).toString();

                // Open the update dialog
                new UpdateStudent(); // Create an UpdateStudent class for this functionality
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a student to update.");
            }
        } else if (e.getSource() == cancel) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StudentDetails();
    }
}