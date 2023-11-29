    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.customer;


import java.security.Provider.Service;
import javax.swing.JPanel;
import modelo.Mensajero;
import modelo.Servicio;
import utils.Observer;
import utils.Constants;
import vista.customer.services.ServiceDetailsPanel;
import vista.customer.services.ServicesListPanel;

/**
 *
 * @author dsola
 */
public final class Customer extends javax.swing.JFrame implements Observer {

    private static Customer instance;
    private static int clienteIdInstance;
    
    private ServicesListPanel servicesList;
    
    public Customer(int clienteId) {
        initComponents();
        clienteIdInstance = clienteId;
        
        servicesList = new ServicesListPanel(clienteId);
        servicesList.subject.agregarObservador(this);
        displayPanel(servicesList);
    }
    
    public static Customer getInstance() {
        return instance;
    }
    
    public void displayPanel(JPanel panel) {
        panel.setSize(Constants.getContentXSize(), Constants.getContentYSize());
        panel.setLocation(0, 0);
        
        content.removeAll();
        content.add(panel);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        navBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        options = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navBar.setBackground(new java.awt.Color(255, 255, 255));
        navBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        navBar.setForeground(new java.awt.Color(211, 211, 211));
        navBar.setPreferredSize(new java.awt.Dimension(1440, 90));
        navBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        jLabel1.setLabelFor(this);
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 60));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 60));
        jLabel1.setPreferredSize(new java.awt.Dimension(301, 60));
        navBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 252, -1));

        options.setBackground(new java.awt.Color(255, 255, 255));
        options.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(52, 53, 61));
        label1.setText("Solicitar servicios");
        options.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(211, 211, 211));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        options.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 0, -1, 57));

        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(52, 53, 61));
        label2.setText("Mis solicitudes");
        options.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 14, -1, -1));

        label3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(52, 53, 61));
        label3.setText("Historial");
        label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label3MousePressed(evt);
            }
        });
        options.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 14, -1, 30));

        jPanel7.setBackground(new java.awt.Color(224, 227, 253));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.setMaximumSize(new java.awt.Dimension(38, 38));
        jPanel7.setPreferredSize(new java.awt.Dimension(38, 38));
        jPanel7.setVerifyInputWhenFocusTarget(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/customer/menu/user-icon.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(38, 38));
        jLabel4.setMinimumSize(new java.awt.Dimension(38, 38));
        jLabel4.setPreferredSize(new java.awt.Dimension(38, 38));
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        options.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 10, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setPreferredSize(new java.awt.Dimension(45, 45));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(102, 119, 247));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 8)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  0"); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel3.setIconTextGap(0);
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(15, 15));
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 20, 20));

        jPanel4.setBackground(new java.awt.Color(224, 227, 253));
        jPanel4.setMaximumSize(new java.awt.Dimension(38, 38));
        jPanel4.setPreferredSize(new java.awt.Dimension(38, 38));
        jPanel4.setVerifyInputWhenFocusTarget(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/customer/menu/bag-icon.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(38, 38));
        jLabel2.setMinimumSize(new java.awt.Dimension(38, 38));
        jLabel2.setPreferredSize(new java.awt.Dimension(38, 38));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 20, 20));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        options.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 1, 53, 50));

        navBar.add(options, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 11, -1, -1));

        jPanel1.add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 80));
        navBar.getAccessibleContext().setAccessibleName("navBar");

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMinimumSize(new java.awt.Dimension(1440, 950));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1440, 950));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label3MousePressed
        displayPanel(servicesList);
    }//GEN-LAST:event_label3MousePressed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer(clienteIdInstance).setVisible(true);
            }
        });
    }

    @Override
    public void actualizar(Servicio servicio, Mensajero mensajero) {
        if(servicio == null){
            displayPanel(servicesList);
        } else {
            ServiceDetailsPanel serviceDetailsPanel = new ServiceDetailsPanel(servicio, mensajero);
            serviceDetailsPanel.subject.agregarObservador(this);
            displayPanel(serviceDetailsPanel);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JPanel navBar;
    private javax.swing.JPanel options;
    // End of variables declaration//GEN-END:variables
}
