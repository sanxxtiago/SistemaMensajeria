/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Santiago
 */
public class ClienteMain extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public ClienteMain() {
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

        quickfavLogo = new javax.swing.JLabel();
        buscarLabel = new javax.swing.JLabel();
        solicitarButton = new javax.swing.JButton();
        solicitudesButton = new javax.swing.JButton();
        historialButton = new javax.swing.JButton();
        buscarInput = new javax.swing.JTextField();
        lineLabel = new javax.swing.JLabel();
        serviciosLabel = new javax.swing.JLabel();
        solicitarServiciosPanel = new javax.swing.JPanel();
        serviciosContainer = new javax.swing.JLabel();
        container = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quickfavLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/img/quickfavlogo.png"))); // NOI18N
        getContentPane().add(quickfavLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        buscarLabel.setText("Buscar");
        getContentPane().add(buscarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        solicitarButton.setText("Solicitar servicios");
        getContentPane().add(solicitarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        solicitudesButton.setText("Mis solicitudes");
        getContentPane().add(solicitudesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        historialButton.setText("Historial");
        getContentPane().add(historialButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));
        getContentPane().add(buscarInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 80, -1));

        lineLabel.setForeground(new java.awt.Color(204, 204, 204));
        lineLabel.setText("_____________________________________________________________________________________________________________________________________________\n");
        getContentPane().add(lineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 720, -1));

        serviciosLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        serviciosLabel.setText("Servicios");
        getContentPane().add(serviciosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 82, -1, -1));

        solicitarServiciosPanel.setLayout(new java.awt.GridLayout());
        getContentPane().add(solicitarServiciosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 570, 390));

        serviciosContainer.setBackground(new java.awt.Color(204, 204, 204));
        serviciosContainer.setOpaque(true);
        getContentPane().add(serviciosContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 510, 320));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/img/panel.png"))); // NOI18N
        container.setMaximumSize(new java.awt.Dimension(464, 412));
        container.setMinimumSize(new java.awt.Dimension(464, 412));
        container.setOpaque(true);
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ClienteMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarInput;
    private javax.swing.JLabel buscarLabel;
    private javax.swing.JLabel container;
    private javax.swing.JButton historialButton;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JLabel quickfavLogo;
    private javax.swing.JLabel serviciosContainer;
    private javax.swing.JLabel serviciosLabel;
    private javax.swing.JButton solicitarButton;
    private javax.swing.JPanel solicitarServiciosPanel;
    private javax.swing.JButton solicitudesButton;
    // End of variables declaration//GEN-END:variables
}
