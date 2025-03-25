/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.sena.examplejdbc.view;

import co.edu.sena.examplejdbc.bd.DBEmployeeType;
import co.edu.sena.examplejdbc.controllers.EmployeeTypeController;
import co.edu.sena.examplejdbc.controllers.IEmployeeTypeController;
import co.edu.sena.examplejdbc.model.EmployeeType;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anfeles
 */
public class JFrameEmployeeType extends javax.swing.JFrame {
    private IEmployeeTypeController employeeTypeController = new EmployeeTypeController();
    
    /**
     * Creates new form JFrameEmployeeType
     */
    public JFrameEmployeeType() {
        initComponents();
        fillTable();
    }
    
    public void fillTable()
    {
        try {
            DefaultTableModel model = new DefaultTableModel();
            jTableEmployeeTypes.setModel(model);
            model.addColumn("Id");
            model.addColumn("Descripción");
            
            String[] rows =new String[2];
            List<EmployeeType> types = employeeTypeController.findAll();
            for (EmployeeType type : types) {
                rows[0] = String.valueOf(type.getId());
                rows[1] = type.getDescript();
                model.addRow(rows);
            }
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelDescript = new javax.swing.JLabel();
        jTextFieldDescript = new javax.swing.JTextField();
        jButtonInsert = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployeeTypes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de empleado");

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Tipos de empleado");

        jLabelDescript.setText("Descripción:");

        jButtonInsert.setBackground(new java.awt.Color(0, 204, 102));
        jButtonInsert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInsert.setText("Crear");
        jButtonInsert.setMaximumSize(new java.awt.Dimension(81, 22));
        jButtonInsert.setMinimumSize(new java.awt.Dimension(81, 22));
        jButtonInsert.setPreferredSize(new java.awt.Dimension(81, 22));
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jLabelId.setText("Id:");

        jButtonUpdate.setBackground(new java.awt.Color(0, 204, 255));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Modificar");
        jButtonUpdate.setEnabled(false);

        jButtonDelete.setBackground(new java.awt.Color(255, 51, 51));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Eliminar");
        jButtonDelete.setEnabled(false);
        jButtonDelete.setMaximumSize(new java.awt.Dimension(81, 22));
        jButtonDelete.setMinimumSize(new java.awt.Dimension(81, 22));
        jButtonDelete.setPreferredSize(new java.awt.Dimension(81, 22));

        jButtonClean.setBackground(new java.awt.Color(153, 153, 153));
        jButtonClean.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonClean.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClean.setText("Limpiar");
        jButtonClean.setMaximumSize(new java.awt.Dimension(81, 22));
        jButtonClean.setMinimumSize(new java.awt.Dimension(81, 22));
        jButtonClean.setPreferredSize(new java.awt.Dimension(81, 22));
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jTableEmployeeTypes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEmployeeTypes.setGridColor(new java.awt.Color(204, 255, 255));
        jTableEmployeeTypes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableEmployeeTypes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addComponent(jLabelDescript, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(jButtonUpdate)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonClean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldDescript, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitle)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescript)
                    .addComponent(jTextFieldDescript, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        try {
            EmployeeType employeeType = new EmployeeType();
            employeeType.setDescript(jTextFieldDescript.getText());
            employeeTypeController.insert(employeeType);            
            MessageUtils.showInfoMessage("Tipo de empleado creado exitosamente");
            fillTable();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        clear();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    public void clear()
    {
        jTextFieldId.setText("");
        jTextFieldDescript.setText("");
        jTableEmployeeTypes.clearSelection();
        jButtonInsert.setEnabled(true);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
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
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEmployeeType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelDescript;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployeeTypes;
    private javax.swing.JTextField jTextFieldDescript;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables
}
