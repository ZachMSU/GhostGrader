package interfaces.editClass;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lilong
 */
public class EditSelectedClass extends javax.swing.JDialog {

    private AddStudent addStudent;
    private RemoveStudent removeStudent;    
    private AddAssignment addAssignment;    
    public String actionStatus = "Closing";
    public DefaultTableModel tableModel;
    
    

    //private CreateCategory createCategory;
    /**
     * Creates new form ClassRoom
     */
    public EditSelectedClass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        actionPerform();
    }
    
    public EditSelectedClass(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        actionPerform();
    }
    
    private void actionPerform() {
        addStudent = new AddStudent(this, true);
        addStudent.setLocation(550, 300);
        removeStudent = new RemoveStudent(this, true);
        removeStudent.setLocation(550, 300);
        addAssignment = new AddAssignment(this, true);
        tableModel = (DefaultTableModel)assignmentTable.getModel();
        //createCategory = new CreateCategory(this, true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        assignmentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        createMenu = new javax.swing.JMenu();
        Category_CreateMenu = new javax.swing.JMenuItem();
        studentMenu = new javax.swing.JMenu();
        addNewStudentMenu = new javax.swing.JMenuItem();
        RemoveStudentMenu = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        assignmentMenu = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Class Room");
        setBackground(java.awt.Color.darkGray);

        assignmentTable.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        assignmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Grade", "Feedback"
            }
        ));
        jScrollPane1.setViewportView(assignmentTable);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setText("Class Name");

        jButton1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton1.setText("Save");

        jButton2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton2.setText("Go Back");

        jMenu5.setText("File");

        jMenuItem12.setText("Save");
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Load");
        jMenu5.add(jMenuItem13);

        menuBar.add(jMenu5);

        createMenu.setText("Create");

        Category_CreateMenu.setText("Category");
        Category_CreateMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Category_CreateMenuActionPerformed(evt);
            }
        });
        createMenu.add(Category_CreateMenu);

        menuBar.add(createMenu);

        studentMenu.setText("Student");

        addNewStudentMenu.setText("Add");
        addNewStudentMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentMenuActionPerformed(evt);
            }
        });
        studentMenu.add(addNewStudentMenu);

        RemoveStudentMenu.setText("Remove");
        RemoveStudentMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveStudentMenuActionPerformed(evt);
            }
        });
        studentMenu.add(RemoveStudentMenu);
        studentMenu.add(jSeparator3);

        jMenuItem6.setText("Edit");
        studentMenu.add(jMenuItem6);

        menuBar.add(studentMenu);

        assignmentMenu.setText("Assignment");

        jMenuItem5.setText("Add");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        assignmentMenu.add(jMenuItem5);

        jMenuItem7.setText("Remove");
        assignmentMenu.add(jMenuItem7);
        assignmentMenu.add(jSeparator4);

        jMenuItem8.setText("Edit");
        assignmentMenu.add(jMenuItem8);

        menuBar.add(assignmentMenu);

        jMenu3.setText("Exam");

        jMenuItem9.setText("Add");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Remove");
        jMenu3.add(jMenuItem10);
        jMenu3.add(jSeparator1);

        jMenuItem11.setText("Edit");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        menuBar.add(jMenu3);

        jMenu4.setText("GhostStudent");
        menuBar.add(jMenu4);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 476, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(37, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        addAssignment.setVisible(true);
        if (addAssignment.actionStatus.equals("Add")) {
 
        }
       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void Category_CreateMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Category_CreateMenuActionPerformed
        this.setVisible(false);
        CreateCategory createCategory = new CreateCategory(this, true);
        createCategory.setVisible(true);
        if (createCategory.actionStatus.equals("Add")) {
            JMenu newMenu = new JMenu();
            newMenu.setText(createCategory.getCategoryName());
            menuBar.add(newMenu);
        }
        this.setVisible(true);
    }//GEN-LAST:event_Category_CreateMenuActionPerformed

    private void addNewStudentMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentMenuActionPerformed
        this.setVisible(false);
        addStudent.setVisible(true);               
        this.setVisible(true);
    }//GEN-LAST:event_addNewStudentMenuActionPerformed
    
    private void RemoveStudentMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveStudentMenuActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);        
        removeStudent.setVisible(true);
        Object selectedStudent = removeStudent.comboModel.getSelectedItem();
        int removeRow = removeStudent.comboModel.getIndexOf(selectedStudent);
        removeStudent.comboModel.removeElement(selectedStudent);
        tableModel.removeRow(removeRow);
        this.setVisible(true);
        
    }//GEN-LAST:event_RemoveStudentMenuActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditSelectedClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSelectedClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSelectedClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSelectedClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                EditSelectedClass dialog = new EditSelectedClass(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Category_CreateMenu;
    private javax.swing.JMenuItem RemoveStudentMenu;
    private javax.swing.JMenuItem addNewStudentMenu;
    private javax.swing.JMenu assignmentMenu;
    private javax.swing.JTable assignmentTable;
    private javax.swing.JMenu createMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu studentMenu;
    // End of variables declaration//GEN-END:variables
}
