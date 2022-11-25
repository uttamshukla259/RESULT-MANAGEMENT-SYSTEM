/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagementSystem;

import javax.swing.JOptionPane;


/**
 *
 * @author ankit
 */
public class AdminHomePage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomePage
     */
    public AdminHomePage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddResult = new javax.swing.JButton();
        ListStudent = new javax.swing.JButton();
        removeResult = new javax.swing.JButton();
        ListStudentResult = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        AddStudent = new javax.swing.JButton();
        UpdateStudent1 = new javax.swing.JButton();
        UpdateStudent2 = new javax.swing.JButton();
        removeStudent = new javax.swing.JButton();
        Logout1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN HOMEPAGE");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddResult.setBackground(new java.awt.Color(204, 255, 204));
        AddResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-search-30.png"))); // NOI18N
        AddResult.setText("ADD RESULTS");
        AddResult.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        AddResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddResultActionPerformed(evt);
            }
        });
        getContentPane().add(AddResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 270, 60));

        ListStudent.setBackground(new java.awt.Color(204, 255, 204));
        ListStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-checklist-30.png"))); // NOI18N
        ListStudent.setText("LIST STUDENTS");
        ListStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListStudent.setDisabledIcon(null);
        ListStudent.setDisabledSelectedIcon(null);
        ListStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 270, 60));

        removeResult.setBackground(new java.awt.Color(204, 255, 204));
        removeResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-delete-30.png"))); // NOI18N
        removeResult.setText("REMOVE RESULT");
        removeResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeResultActionPerformed(evt);
            }
        });
        getContentPane().add(removeResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 270, 60));

        ListStudentResult.setBackground(new java.awt.Color(204, 255, 204));
        ListStudentResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListStudentResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-grade-24.png"))); // NOI18N
        ListStudentResult.setText("LIST STUDENTS RESULTS");
        ListStudentResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListStudentResult.setDisabledIcon(null);
        ListStudentResult.setDisabledSelectedIcon(null);
        ListStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentResultActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudentResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 270, 60));

        EXIT.setBackground(new java.awt.Color(255, 204, 204));
        EXIT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-logout-50.png"))); // NOI18N
        EXIT.setText("EXIT");
        EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT.setDisabledIcon(null);
        EXIT.setDisabledSelectedIcon(null);
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 220, 90));

        AddStudent.setBackground(new java.awt.Color(204, 255, 204));
        AddStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-student.png"))); // NOI18N
        AddStudent.setText("ADD STUDENTS");
        AddStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddStudent.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(AddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 270, 60));

        UpdateStudent1.setBackground(new java.awt.Color(204, 255, 204));
        UpdateStudent1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateStudent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-edit student.png"))); // NOI18N
        UpdateStudent1.setText("UPDATE STUDENT'S RESULT");
        UpdateStudent1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateStudent1.setDisabledIcon(null);
        UpdateStudent1.setDisabledSelectedIcon(null);
        UpdateStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudent1ActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateStudent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 270, 60));

        UpdateStudent2.setBackground(new java.awt.Color(204, 255, 204));
        UpdateStudent2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateStudent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-edit student.png"))); // NOI18N
        UpdateStudent2.setText("UPDATE STUDENT'S DETAILS");
        UpdateStudent2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateStudent2.setDisabledIcon(null);
        UpdateStudent2.setDisabledSelectedIcon(null);
        UpdateStudent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudent2ActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateStudent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 270, 60));

        removeStudent.setBackground(new java.awt.Color(204, 255, 204));
        removeStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-delete-30.png"))); // NOI18N
        removeStudent.setText("REMOVE STUDENT");
        removeStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentActionPerformed(evt);
            }
        });
        getContentPane().add(removeStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 270, 60));

        Logout1.setBackground(new java.awt.Color(255, 204, 204));
        Logout1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-logout-50.png"))); // NOI18N
        Logout1.setText("LOGOUT");
        Logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout1.setDisabledIcon(null);
        Logout1.setDisabledSelectedIcon(null);
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });
        getContentPane().add(Logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 220, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/schoolPic2.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 670));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -150, 700, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        int flag=JOptionPane.showConfirmDialog(null,"DO YOU CLOSE THE APPLICATION?","exit",JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_EXITActionPerformed
 
    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        // TODO add your handling code here:
        AddStudent frame=new AddStudent();
        this.setVisible(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_AddStudentActionPerformed

    private void AddResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddResultActionPerformed
        // TODO add your handling code here:
        AddResult frame=new AddResult();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_AddResultActionPerformed

    private void ListStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentActionPerformed
        // TODO add your handling code here:
        ListStudent frame=new ListStudent();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_ListStudentActionPerformed

    private void removeResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeResultActionPerformed
        // TODO add your handling code here:
               removeResult frame=new removeResult();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_removeResultActionPerformed

    private void ListStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentResultActionPerformed
        // TODO add your handling code here:
          ListStudentResult frame=new ListStudentResult();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_ListStudentResultActionPerformed

    private void UpdateStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudent1ActionPerformed
      this.setVisible(false);
      UpdateStudent frame=new UpdateStudent();
      frame.setVisible(true);
        
    }//GEN-LAST:event_UpdateStudent1ActionPerformed

    private void UpdateStudent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudent2ActionPerformed
  this.setVisible(false);
  UpdateStudentDetails frame=new UpdateStudentDetails();
  frame.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_UpdateStudent2ActionPerformed

    private void removeStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentActionPerformed
      this.setVisible(false);
      RemoveStudent frame=new RemoveStudent();
      frame.setVisible(true);
    }//GEN-LAST:event_removeStudentActionPerformed

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
        // TODO add your handling code here:
          int flag = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO EXIT ", "SUBMIT", JOptionPane.YES_NO_OPTION);
        if (flag == 0) {
        this.setVisible(false);
        Home frame=new Home();
        frame.setVisible(true);
    }//GEN-LAST:event_Logout1ActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddResult;
    private javax.swing.JButton AddStudent;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton ListStudent;
    private javax.swing.JButton ListStudentResult;
    private javax.swing.JButton Logout1;
    private javax.swing.JButton UpdateStudent1;
    private javax.swing.JButton UpdateStudent2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removeResult;
    private javax.swing.JButton removeStudent;
    // End of variables declaration//GEN-END:variables
}