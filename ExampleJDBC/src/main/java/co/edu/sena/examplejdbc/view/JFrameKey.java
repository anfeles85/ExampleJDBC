/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.sena.examplejdbc.view;

import co.edu.sena.examplejdbc.controllers.IKeyController;
import co.edu.sena.examplejdbc.controllers.KeyController;
import co.edu.sena.examplejdbc.model.Key;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anfeles
 */
public class JFrameKey extends javax.swing.JFrame {
    private IKeyController keyController = new KeyController();
    
    /**
     * Creates new form JFrameEmployeeType
     */
    public JFrameKey() {
        initComponents();
        fillTable();
    }
    
    public void fillTable()
    {
        try {
            DefaultTableModel model = new DefaultTableModel();
            jTableKeys.setModel(model);
            model.addColumn("Id");
            model.addColumn("Nombre");
            model.addColumn("Aula");
            
            String[] rows =new String[3];
            List<Key> keys = keyController.findAll();
            for (Key key : keys) {
                rows[0] = String.valueOf(key.getId());
                rows[1] = key.getName();
                rows[2] = key.getRoom();
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
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jButtonInsert = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKeys = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRoom = new javax.swing.JTextField();
        jLabelCount = new javax.swing.JLabel();
        jTextFieldCount = new javax.swing.JTextField();
        jLabelObservation = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaObservation = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de empleado");
        setResizable(false);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Llaves");

        jLabelName.setText("Nombre:");

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
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(255, 51, 51));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Eliminar");
        jButtonDelete.setEnabled(false);
        jButtonDelete.setMaximumSize(new java.awt.Dimension(81, 22));
        jButtonDelete.setMinimumSize(new java.awt.Dimension(81, 22));
        jButtonDelete.setPreferredSize(new java.awt.Dimension(81, 22));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

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

        jTableKeys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableKeys.setGridColor(new java.awt.Color(204, 255, 255));
        jTableKeys.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableKeys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKeysMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableKeys);

        jLabel1.setText("Aula:");

        jLabelCount.setText("Cantidad:");

        jLabelObservation.setText("Observación:");

        jTextAreaObservation.setColumns(20);
        jTextAreaObservation.setLineWrap(true);
        jTextAreaObservation.setRows(5);
        jScrollPane2.setViewportView(jTextAreaObservation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jTextFieldRoom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldName)
                            .addComponent(jTextFieldCount, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                        .addGap(20, 20, 20)))
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jButtonUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jButtonClean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitle)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCount)
                    .addComponent(jTextFieldCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObservation)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        try {
            Key key = new Key();
            key.setName(jTextFieldName.getText().toUpperCase());
            key.setRoom(jTextFieldRoom.getText());
            key.setCount(Integer.parseInt(jTextFieldCount.getText()));
            key.setObservation(jTextAreaObservation.getText());
            keyController.insert(key);            
            MessageUtils.showInfoMessage("Llave creada exitosamente");
            fillTable();
            clear();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        clear();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jTableKeysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKeysMouseClicked
        int rowSelected = jTableKeys.getSelectedRow();
        if(rowSelected != -1)
        {   
            try {
                jTextFieldId.setText(jTableKeys.getValueAt(rowSelected, 0).toString());
                jTextFieldName.setText(jTableKeys.getValueAt(rowSelected, 1).toString());
                jTextFieldRoom.setText(jTableKeys.getValueAt(rowSelected, 2).toString());
                
                Key myKey = keyController.findById(Integer.parseInt(jTextFieldId.getText()));
                jTextFieldCount.setText(String.valueOf(myKey.getCount()));
                jTextAreaObservation.setText(myKey.getObservation());
                
                jButtonInsert.setEnabled(false);
                jButtonDelete.setEnabled(true);
                jButtonUpdate.setEnabled(true);
            } catch (Exception e) {
                MessageUtils.showErrorMessage(e.getMessage());
            }  
        }
    }//GEN-LAST:event_jTableKeysMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try {
            Key key = new Key();
            key.setId(Integer.parseInt(jTextFieldId.getText()));
            key.setName(jTextFieldName.getText().toUpperCase());
            key.setRoom(jTextFieldRoom.getText());
            key.setCount(Integer.parseInt(jTextFieldCount.getText()));
            key.setObservation(jTextAreaObservation.getText());
            keyController.update(key);            
            MessageUtils.showInfoMessage("Llave actualizada exitosamente");
            fillTable();
            clear();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int option = JOptionPane.showConfirmDialog(rootPane, 
                                            "Está seguro de eliminar el registro?", "Confirmación", 
                                            JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION)
            {
                keyController.delete(Integer.parseInt(jTextFieldId.getText()));
                MessageUtils.showInfoMessage("Llave eliminado exitosamente");
                fillTable();                
            }    
            clear();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    public void clear()
    {
        jTextFieldId.setText("");
        jTextFieldName.setText("");
        jTextFieldRoom.setText("");
        jTextFieldCount.setText("");
        jTextAreaObservation.setText("");
        jTableKeys.clearSelection();
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
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameKey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCount;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelObservation;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableKeys;
    private javax.swing.JTextArea jTextAreaObservation;
    private javax.swing.JTextField jTextFieldCount;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldRoom;
    // End of variables declaration//GEN-END:variables
}
