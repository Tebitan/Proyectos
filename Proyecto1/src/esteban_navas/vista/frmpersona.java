/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esteban_navas.vista;

/**
 *
 * @author Carolina
 */
public class frmpersona extends javax.swing.JFrame {

    /**
     * Creates new form Frmpersona
     */
    public frmpersona() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txtnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txtpriape = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txtsegape = new javax.swing.JTextField();
        Btn_adicionar = new javax.swing.JButton();
        Btn_Actualizar = new javax.swing.JButton();
        Btn_Report = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jtb_persona = new javax.swing.JTable();
        Btn_Deshabilitar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CRUD CON MVC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 60, -1));

        Txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtnomActionPerformed(evt);
            }
        });
        jPanel1.add(Txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("1ª Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 80, -1));

        Txtpriape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtpriapeActionPerformed(evt);
            }
        });
        jPanel1.add(Txtpriape, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("2ª Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 80, -1));

        Txtsegape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtsegapeActionPerformed(evt);
            }
        });
        jPanel1.add(Txtsegape, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, -1));

        Btn_adicionar.setText("ADICIONAR");
        jPanel1.add(Btn_adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, -1));

        Btn_Actualizar.setText("ACTUALIZAR");
        jPanel1.add(Btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 110, -1));

        Btn_Report.setText("REPORTE");
        jPanel1.add(Btn_Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 90, -1));

        Jtb_persona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Jtb_persona);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 150));

        Btn_Deshabilitar.setText("DESHABILITAR");
        jPanel1.add(Btn_Deshabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtpriapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtpriapeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtpriapeActionPerformed

    private void TxtsegapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtsegapeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtsegapeActionPerformed

    private void TxtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtnomActionPerformed

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
            java.util.logging.Logger.getLogger(frmpersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmpersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Actualizar;
    public javax.swing.JButton Btn_Deshabilitar;
    public javax.swing.JButton Btn_Report;
    public javax.swing.JButton Btn_adicionar;
    public javax.swing.JTable Jtb_persona;
    public javax.swing.JTextField Txtnom;
    public javax.swing.JTextField Txtpriape;
    public javax.swing.JTextField Txtsegape;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}