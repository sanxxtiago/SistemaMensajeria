/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Mensajero;
import negocio.Controlador;
import util.RHException;

/**
 *
 * @author Santiago
 */
public class RegistroMensajero extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroMensajero() {
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

        fNacimientoInput = new javax.swing.JTextField();
        nombresInput = new javax.swing.JTextField();
        seguridadInput = new javax.swing.JTextField();
        tipoDocLabel = new javax.swing.JLabel();
        numeroDocLabel = new javax.swing.JLabel();
        seguridadLabel = new javax.swing.JLabel();
        nombresLabel = new javax.swing.JLabel();
        registroLabel = new javax.swing.JLabel();
        disponibilidadInput = new javax.swing.JTextField();
        telefonoInput = new javax.swing.JTextField();
        correoInput = new javax.swing.JTextField();
        contrasenaInput = new javax.swing.JTextField();
        correoLabel = new javax.swing.JLabel();
        contrasenaLabel = new javax.swing.JLabel();
        tipoTransporteLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();
        crearCuentaButton = new javax.swing.JButton();
        apellidosLabel = new javax.swing.JLabel();
        apellidosInput = new javax.swing.JTextField();
        sexoComboBox = new javax.swing.JComboBox<>();
        numeroDocInput = new javax.swing.JTextField();
        fNacimientoLabel = new javax.swing.JLabel();
        nacionalidadLabel = new javax.swing.JLabel();
        nacionalidadInput = new javax.swing.JTextField();
        sexoLabel = new javax.swing.JLabel();
        tipoTransporteComboBox = new javax.swing.JComboBox<>();
        confirmarLabel = new javax.swing.JLabel();
        confirmarInput = new javax.swing.JTextField();
        disponibilidadLabel1 = new javax.swing.JLabel();
        tipoDocumentoComboBox = new javax.swing.JComboBox<>();
        container = new javax.swing.JLabel();
        backdround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(fNacimientoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 89, -1));

        nombresInput.setToolTipText("");
        getContentPane().add(nombresInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 196, -1));
        getContentPane().add(seguridadInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 196, -1));

        tipoDocLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tipoDocLabel.setText("Tipo documento");
        getContentPane().add(tipoDocLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        numeroDocLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        numeroDocLabel.setText("Número de documento");
        getContentPane().add(numeroDocLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        seguridadLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        seguridadLabel.setText("Seguridad social");
        getContentPane().add(seguridadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        nombresLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        nombresLabel.setText("Nombres");
        getContentPane().add(nombresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        registroLabel.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        registroLabel.setText("Registro mensajero");
        getContentPane().add(registroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));
        getContentPane().add(disponibilidadInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 196, -1));

        telefonoInput.setToolTipText("");
        getContentPane().add(telefonoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 196, -1));
        getContentPane().add(correoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 196, -1));
        getContentPane().add(contrasenaInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 196, -1));

        correoLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        correoLabel.setText("Correo electrónico");
        correoLabel.setToolTipText("");
        getContentPane().add(correoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        contrasenaLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        contrasenaLabel.setText("Contraseña");
        getContentPane().add(contrasenaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        tipoTransporteLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tipoTransporteLabel.setText("Tipo de trasporte");
        getContentPane().add(tipoTransporteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        telefonoLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        telefonoLabel.setText("Teléfono");
        getContentPane().add(telefonoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        cancelarButton.setBackground(new java.awt.Color(255, 102, 102));
        cancelarButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelarButton.setText("Atrás");
        cancelarButton.setActionCommand("Crear cuenta");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 90, -1));

        crearCuentaButton.setBackground(new java.awt.Color(51, 102, 255));
        crearCuentaButton.setForeground(new java.awt.Color(255, 255, 255));
        crearCuentaButton.setText("Crear cuenta");
        crearCuentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(crearCuentaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 100, -1));

        apellidosLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        apellidosLabel.setText("Apellidos");
        getContentPane().add(apellidosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));
        getContentPane().add(apellidosInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 196, -1));

        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H", "M", "O" }));
        getContentPane().add(sexoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 196, -1));
        getContentPane().add(numeroDocInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 196, -1));

        fNacimientoLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        fNacimientoLabel.setText("Fecha de nacimiento");
        getContentPane().add(fNacimientoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        nacionalidadLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        nacionalidadLabel.setText("Nacionalidad");
        getContentPane().add(nacionalidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));
        getContentPane().add(nacionalidadInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 196, -1));

        sexoLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        sexoLabel.setText("Sexo");
        getContentPane().add(sexoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        tipoTransporteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "B" }));
        getContentPane().add(tipoTransporteComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 196, -1));

        confirmarLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        confirmarLabel.setText("Confirmar contraseña");
        getContentPane().add(confirmarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));
        getContentPane().add(confirmarInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 196, -1));

        disponibilidadLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        disponibilidadLabel1.setText("Disponibilidad horaria");
        getContentPane().add(disponibilidadLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        tipoDocumentoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "CE", "TI" }));
        getContentPane().add(tipoDocumentoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 196, -1));

        container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/img/panel.png"))); // NOI18N
        container.setMaximumSize(new java.awt.Dimension(464, 412));
        container.setMinimumSize(new java.awt.Dimension(464, 412));
        container.setOpaque(true);
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 464, 460));

        backdround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/img/background_1.png"))); // NOI18N
        backdround.setToolTipText("");
        getContentPane().add(backdround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 514));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void crearCuentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaButtonActionPerformed

        Mensajero mensajero = new Mensajero();

        mensajero.setTipoId(tipoDocumentoComboBox.getSelectedItem().toString());
        mensajero.setIdMensajero(Integer.parseInt(numeroDocInput.getText()));
        mensajero.setNombre(nombresInput.getText());
        mensajero.setApellido(apellidosInput.getText());
        mensajero.setTelefono(Integer.parseInt(telefonoInput.getText()));
        mensajero.setF_nacimiento(fNacimientoInput.getText());
        mensajero.setNacionalidad(nacionalidadInput.getText());
        mensajero.setSexo(sexoComboBox.getSelectedItem().toString());
        mensajero.setCorreo(correoInput.getText());
        mensajero.setContrasena(contrasenaInput.getText());
        mensajero.setMedioTransporte(tipoTransporteComboBox.getSelectedItem().toString());
        mensajero.setCalificacionPromedio(0f);

        try {
            Controlador controlador = new Controlador();
            if (controlador.registroMensajero(mensajero)) {
                JOptionPane.showMessageDialog(null, "Se ha registrado el mensajero satisfactoriamente.");
            }
        } catch (RHException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se ha registrado el mensajero.");

            Logger.getLogger(RegistroMensajero.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_crearCuentaButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        Iniciosesion iniciarSesion = new Iniciosesion();
        iniciarSesion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroMensajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroMensajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroMensajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroMensajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroMensajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosInput;
    private javax.swing.JLabel apellidosLabel;
    private javax.swing.JLabel backdround;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField confirmarInput;
    private javax.swing.JLabel confirmarLabel;
    private javax.swing.JLabel container;
    private javax.swing.JTextField contrasenaInput;
    private javax.swing.JLabel contrasenaLabel;
    private javax.swing.JTextField correoInput;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JButton crearCuentaButton;
    private javax.swing.JTextField disponibilidadInput;
    private javax.swing.JLabel disponibilidadLabel1;
    private javax.swing.JTextField fNacimientoInput;
    private javax.swing.JLabel fNacimientoLabel;
    private javax.swing.JTextField nacionalidadInput;
    private javax.swing.JLabel nacionalidadLabel;
    private javax.swing.JTextField nombresInput;
    private javax.swing.JLabel nombresLabel;
    private javax.swing.JTextField numeroDocInput;
    private javax.swing.JLabel numeroDocLabel;
    private javax.swing.JLabel registroLabel;
    private javax.swing.JTextField seguridadInput;
    private javax.swing.JLabel seguridadLabel;
    private javax.swing.JComboBox<String> sexoComboBox;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JTextField telefonoInput;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JLabel tipoDocLabel;
    private javax.swing.JComboBox<String> tipoDocumentoComboBox;
    private javax.swing.JComboBox<String> tipoTransporteComboBox;
    private javax.swing.JLabel tipoTransporteLabel;
    // End of variables declaration//GEN-END:variables
}
