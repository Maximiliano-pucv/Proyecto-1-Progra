/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

/**
 *
 * @author frans
 */
public class VentanaMostrar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMostrar
     */
    private everySede sede;
    public VentanaMostrar(everySede sede) {
        initComponents();
        this.sede = sede;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mostrarSedes = new javax.swing.JButton();
        mostrarCiudadanos = new javax.swing.JButton();
        mostrarSedesYCiudadanos = new javax.swing.JButton();
        mostrarSedeYCiudadano = new javax.swing.JButton();
        regresarMenú = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Elija la opción que desea realizar");

        mostrarSedes.setText("Mostrar Sedes");
        mostrarSedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarSedesMouseClicked(evt);
            }
        });
        mostrarSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSedesActionPerformed(evt);
            }
        });

        mostrarCiudadanos.setText("Mostrar Ciudadanos");
        mostrarCiudadanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarCiudadanosMouseClicked(evt);
            }
        });
        mostrarCiudadanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCiudadanosActionPerformed(evt);
            }
        });

        mostrarSedesYCiudadanos.setText("Mostrar todas las Sedes y sus Ciudadanos");
        mostrarSedesYCiudadanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarSedesYCiudadanosMouseClicked(evt);
            }
        });
        mostrarSedesYCiudadanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSedesYCiudadanosActionPerformed(evt);
            }
        });

        mostrarSedeYCiudadano.setText("Mostrar Sede y sus Ciudadanos");
        mostrarSedeYCiudadano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarSedeYCiudadanoMouseClicked(evt);
            }
        });
        mostrarSedeYCiudadano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSedeYCiudadanoActionPerformed(evt);
            }
        });

        regresarMenú.setText("Volver al menú ");
        regresarMenú.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMenúMouseClicked(evt);
            }
        });
        regresarMenú.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarMenúActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(158, 295, Short.MAX_VALUE)
                .addComponent(regresarMenú)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarSedeYCiudadano)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(mostrarSedesYCiudadanos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(mostrarCiudadanos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(mostrarSedes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(mostrarSedes)
                .addGap(18, 18, 18)
                .addComponent(mostrarCiudadanos)
                .addGap(18, 18, 18)
                .addComponent(mostrarSedeYCiudadano)
                .addGap(18, 18, 18)
                .addComponent(mostrarSedesYCiudadanos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(regresarMenú)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSedesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarSedesActionPerformed

    private void mostrarCiudadanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCiudadanosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarCiudadanosActionPerformed

    private void mostrarSedeYCiudadanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSedeYCiudadanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarSedeYCiudadanoActionPerformed

    private void mostrarSedesYCiudadanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSedesYCiudadanosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarSedesYCiudadanosActionPerformed

    private void regresarMenúActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarMenúActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarMenúActionPerformed

    private void mostrarSedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSedesMouseClicked
        // TODO add your handling code here:
        VentanaSedes ventana = new VentanaSedes(sede);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_mostrarSedesMouseClicked

    private void mostrarCiudadanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarCiudadanosMouseClicked
        // TODO add your handling code here:
        //VentanaCiudadanos ventana = new VentanaCiudadanos(sede);
        //ventana.setVisible(true);
        //dispose();
    }//GEN-LAST:event_mostrarCiudadanosMouseClicked

    private void mostrarSedeYCiudadanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSedeYCiudadanoMouseClicked
        // TODO add your handling code here:
        //VentanaSedeYCiudadanos ventana = new VentanaSedeYCiudadanos(sede);
        //ventana.setVisible(true);
        //dispose();
    }//GEN-LAST:event_mostrarSedeYCiudadanoMouseClicked

    private void mostrarSedesYCiudadanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSedesYCiudadanosMouseClicked
        // TODO add your handling code here:
        //VentanaSedesYCiudadanos ventana = new VentanaSedesYCiudadanos(sede);
        //ventana.setVisible(true);
        //dispose();
    }//GEN-LAST:event_mostrarSedesYCiudadanosMouseClicked

    private void regresarMenúMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMenúMouseClicked
        // TODO add your handling code here:
        VentanaInicial ventana = new VentanaInicial(sede);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarMenúMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                everySede sede = new everySede();
                new VentanaMostrar(sede).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrarCiudadanos;
    private javax.swing.JButton mostrarSedeYCiudadano;
    private javax.swing.JButton mostrarSedes;
    private javax.swing.JButton mostrarSedesYCiudadanos;
    private javax.swing.JButton regresarMenú;
    // End of variables declaration//GEN-END:variables
}
