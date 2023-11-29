/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Cliente;
import negocio.Controlador;
import util.RHException;

/**
 *
 * @author Santiago
 */
public class RegistroCliente extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroCliente() {
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

        nombresInput = new javax.swing.JTextField();
        apellidosInput = new javax.swing.JTextField();
        apellidosLabel = new javax.swing.JLabel();
        nombresLabel = new javax.swing.JLabel();
        registroLabel = new javax.swing.JLabel();
        confirmarInput = new javax.swing.JTextField();
        telefonoInput = new javax.swing.JTextField();
        correoInput = new javax.swing.JTextField();
        contrasenaInput = new javax.swing.JTextField();
        correoLabel = new javax.swing.JLabel();
        contrasenaLabel = new javax.swing.JLabel();
        confirmarLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        crearCuentaButton = new javax.swing.JButton();
        crearCuentaButton1 = new javax.swing.JButton();
        tipoDocLabel = new javax.swing.JLabel();
        tipoDocumentoComboBox = new javax.swing.JComboBox<>();
        numeroDocLabel = new javax.swing.JLabel();
        numeroDocInput = new javax.swing.JTextField();
        container = new javax.swing.JLabel();
        backdround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombresInput.setToolTipText("");
        getContentPane().add(nombresInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 196, -1));
        getContentPane().add(apellidosInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 196, -1));

        apellidosLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        apellidosLabel.setText("Apellidos");
        getContentPane().add(apellidosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        nombresLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        nombresLabel.setText("Nombres");
        getContentPane().add(nombresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        registroLabel.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        registroLabel.setText("Registro");
        getContentPane().add(registroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));
        getContentPane().add(confirmarInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 196, -1));

        telefonoInput.setToolTipText("");
        getContentPane().add(telefonoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 196, -1));
        getContentPane().add(correoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 196, -1));
        getContentPane().add(contrasenaInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 196, -1));

        correoLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        correoLabel.setText("Correo electrónico");
        correoLabel.setToolTipText("");
        getContentPane().add(correoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        contrasenaLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        contrasenaLabel.setText("Contraseña");
        getContentPane().add(contrasenaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        confirmarLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        confirmarLabel.setText("Confirmar contraseña");
        getContentPane().add(confirmarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        telefonoLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        telefonoLabel.setText("Teléfono");
        getContentPane().add(telefonoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        crearCuentaButton.setBackground(new java.awt.Color(255, 102, 102));
        crearCuentaButton.setForeground(new java.awt.Color(255, 255, 255));
        crearCuentaButton.setText("Cancelar");
        crearCuentaButton.setActionCommand("Crear cuenta");
        getContentPane().add(crearCuentaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 196, -1));

        crearCuentaButton1.setBackground(new java.awt.Color(51, 102, 255));
        crearCuentaButton1.setForeground(new java.awt.Color(255, 255, 255));
        crearCuentaButton1.setText("Crear cuenta");
        crearCuentaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(crearCuentaButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 196, -1));

        tipoDocLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tipoDocLabel.setText("Tipo documento");
        getContentPane().add(tipoDocLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        tipoDocumentoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "CE", "TI" }));
        getContentPane().add(tipoDocumentoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 196, -1));

        numeroDocLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        numeroDocLabel.setText("Número de documento");
        getContentPane().add(numeroDocLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));
        getContentPane().add(numeroDocInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 196, -1));

        container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/img/panel.png"))); // NOI18N
        container.setMaximumSize(new java.awt.Dimension(464, 412));
        container.setMinimumSize(new java.awt.Dimension(464, 412));
        container.setOpaque(true);
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 464, 412));

        backdround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/img/background_1.png"))); // NOI18N
        backdround.setToolTipText("");
        getContentPane().add(backdround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1148, 514));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void crearCuentaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaButton1ActionPerformed

        Cliente cliente = new Cliente();

        cliente.setNombre(nombresInput.getText());
        cliente.setApellido(apellidosInput.getText());
        cliente.setTipoID(tipoDocumentoComboBox.getSelectedItem().toString());
        cliente.setIdCliente(Integer.parseInt(numeroDocInput.getText()));
        cliente.setTelefono(Integer.parseInt(telefonoInput.getText()));
        cliente.setCorreo(correoInput.getText());
        cliente.setPassword(contrasenaInput.getText());

        try {
            Controlador controlador = new Controlador();
            if (controlador.registroCliente(cliente)) {
                JOptionPane.showMessageDialog(null, "Se ha registrado el cliente satisfactoriamente.");
            }
        } catch (RHException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se ha registrado el cliente.");
            Logger.getLogger(RegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_crearCuentaButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosInput;
    private javax.swing.JLabel apellidosLabel;
    private javax.swing.JLabel backdround;
    private javax.swing.JTextField confirmarInput;
    private javax.swing.JLabel confirmarLabel;
    private javax.swing.JLabel container;
    private javax.swing.JTextField contrasenaInput;
    private javax.swing.JLabel contrasenaLabel;
    private javax.swing.JTextField correoInput;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JButton crearCuentaButton;
    private javax.swing.JButton crearCuentaButton1;
    private javax.swing.JTextField nombresInput;
    private javax.swing.JLabel nombresLabel;
    private javax.swing.JTextField numeroDocInput;
    private javax.swing.JLabel numeroDocLabel;
    private javax.swing.JLabel registroLabel;
    private javax.swing.JTextField telefonoInput;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JLabel tipoDocLabel;
    private javax.swing.JComboBox<String> tipoDocumentoComboBox;
    // End of variables declaration//GEN-END:variables
}
