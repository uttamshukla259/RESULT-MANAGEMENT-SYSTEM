/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagementSystem;

import ConnectionProvider.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ankit
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RollNo = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        FatherName = new javax.swing.JLabel();
        Course = new javax.swing.JLabel();
        Branch = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        roll = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        branch = new javax.swing.JComboBox<>();
        course = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD STUDENTS");
        setMaximumSize(new java.awt.Dimension(564, 455));
        setMinimumSize(new java.awt.Dimension(564, 455));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RollNo.setBackground(new java.awt.Color(204, 204, 255));
        RollNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RollNo.setText("ROLL NO");
        getContentPane().add(RollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 30));

        Gender.setBackground(new java.awt.Color(204, 183, 181));
        Gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Gender.setText("GENDER");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, 30));

        FatherName.setBackground(new java.awt.Color(204, 204, 255));
        FatherName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FatherName.setText("FATHER'S NAME");
        getContentPane().add(FatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, 30));

        Course.setBackground(new java.awt.Color(204, 204, 255));
        Course.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Course.setText("COURSE");
        getContentPane().add(Course, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 30));

        Branch.setBackground(new java.awt.Color(0, 255, 0));
        Branch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Branch.setForeground(new java.awt.Color(51, 51, 51));
        Branch.setText("BRANCH");
        getContentPane().add(Branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 30));

        Name.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Name.setText("NAME");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, 30));
        getContentPane().add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 170, 30));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 170, 30));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 170, 30));

        branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPUTER SCIENCE", "CIVIL", "MECHANICAL", "ELECTRICAL", "CHEMICAL" }));
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 170, 30));
        branch.getAccessibleContext().setAccessibleName("");

        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B-TECH" }));
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 170, 30));
        course.getAccessibleContext().setAccessibleName("");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE ", "FEMALE", "RATHER NOT SAY" }));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 110, 170, 30));
        gender.getAccessibleContext().setAccessibleName("");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 120, 50));

        Submit.setBackground(new java.awt.Color(204, 204, 255));
        Submit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Submit.setText("SUBMIT");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 120, 50));

        Cancel.setBackground(new java.awt.Color(204, 204, 255));
        Cancel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Cancel.setText("CANCEL");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 120, 50));

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/maple-leaf-border-background-orange-watercolor-autumn-season_53876-128735.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -70, 740, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        int flag = JOptionPane.showConfirmDialog(null, "Do you want to Exit", "submit", JOptionPane.YES_NO_OPTION);
        if (flag == 0) {
            this.setVisible(false);
            AdminHomePage frame = new AdminHomePage();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_CancelActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String Name = name.getText();
        String Roll = roll.getText();
        String Gender = (String) gender.getSelectedItem();
        String Fname = fname.getText();
        String Course = (String) course.getSelectedItem();
        String Branch = (String) branch.getSelectedItem();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('" + Name + "','" + Roll + "','" + Gender + "','" + Fname + "','" + Course + "','" + Branch + "');");
            JOptionPane.showMessageDialog(null, "Sucessfully added.");
            this.setVisible(false);
            AddStudent frame = new AddStudent();
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);   
        AddStudent frame =new AddStudent();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Branch;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel Course;
    private javax.swing.JLabel FatherName;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel RollNo;
    private javax.swing.JButton Submit;
    private javax.swing.JComboBox<String> branch;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name;
    private javax.swing.JTextField roll;
    // End of variables declaration//GEN-END:variables
}