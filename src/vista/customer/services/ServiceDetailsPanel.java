/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.customer.services;

import modelo.Servicio;
import utils.Subject;
import vista.customer.Customer;

/**
 *
 * @author dsola
 */
public class ServiceDetailsPanel extends javax.swing.JPanel {
    
    public Subject subject = new Subject();

    private Servicio servicio;
    /**
     * Creates new form serviceDetailsPanel
     */
    public ServiceDetailsPanel(Servicio servicio) {
        this.servicio = servicio;
        System.out.println(servicio.getIdServicio());
        Customer customer = Customer.getInstance();
        subject.agregarObservador(customer);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        serviceDate14 = new javax.swing.JLabel();
        serviceDate12 = new javax.swing.JLabel();
        serviceName17 = new java.awt.Label();
        serviceName18 = new java.awt.Label();
        serviceDate11 = new javax.swing.JLabel();
        serviceName7 = new java.awt.Label();
        serviceName2 = new java.awt.Label();
        serviceName3 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        serviceName = new java.awt.Label();
        serviceDate = new javax.swing.JLabel();
        serviceName5 = new java.awt.Label();
        serviceName14 = new java.awt.Label();
        serviceDate9 = new javax.swing.JLabel();
        cancelServiceButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        serviceName1 = new java.awt.Label();
        serviceDate1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        serviceName8 = new java.awt.Label();
        serviceName9 = new java.awt.Label();
        serviceDate4 = new javax.swing.JLabel();
        serviceName10 = new java.awt.Label();
        serviceDate6 = new javax.swing.JLabel();
        serviceName11 = new java.awt.Label();
        serviceDate7 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(1440, 950));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1145, 807));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 950));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/customer/services/arrow-back.png"))); // NOI18N
        jLabel1.setText("Atras");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(233, 233, 233), 2, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(340, 246));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serviceDate14.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceDate14.setForeground(new java.awt.Color(141, 141, 141));
        serviceDate14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        serviceDate14.setText("<html>Descripcion</html>");
        serviceDate14.setToolTipText("");
        serviceDate14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(serviceDate14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 180, 80));

        serviceDate12.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceDate12.setForeground(new java.awt.Color(141, 141, 141));
        serviceDate12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        serviceDate12.setText("<html>Descripcion</html>");
        serviceDate12.setToolTipText("");
        serviceDate12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(serviceDate12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 80));

        serviceName17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName17.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceName17.setForeground(new java.awt.Color(52, 53, 61));
        serviceName17.setText("Descripcion");
        jPanel6.add(serviceName17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        serviceName18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName18.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceName18.setForeground(new java.awt.Color(52, 53, 61));
        serviceName18.setText("Descripcion del lugar");
        jPanel6.add(serviceName18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 20));

        serviceDate11.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceDate11.setForeground(new java.awt.Color(141, 141, 141));
        serviceDate11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        serviceDate11.setText("Carrera xd");
        jPanel6.add(serviceDate11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 210, 20));

        serviceName7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceName7.setForeground(new java.awt.Color(52, 53, 61));
        serviceName7.setText("Direccion");
        jPanel6.add(serviceName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        serviceName2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        serviceName2.setForeground(new java.awt.Color(52, 53, 61));
        serviceName2.setText("Actividad #1");
        jPanel6.add(serviceName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 180));

        serviceName3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 16)); // NOI18N
        serviceName3.setForeground(new java.awt.Color(52, 53, 61));
        serviceName3.setText("Direcciones");
        jPanel3.add(serviceName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 440, 290));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(233, 233, 233), 2, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 246));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serviceName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 16)); // NOI18N
        serviceName.setForeground(new java.awt.Color(52, 53, 61));
        serviceName.setText("Detalles del servicio");
        jPanel2.add(serviceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        serviceDate.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceDate.setForeground(new java.awt.Color(141, 141, 141));
        serviceDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        serviceDate.setText("Moto");
        serviceDate.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(serviceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 170, 20));

        serviceName5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceName5.setForeground(new java.awt.Color(52, 53, 61));
        serviceName5.setText("Medio de transporte ayudante");
        jPanel2.add(serviceName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        serviceName14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName14.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceName14.setForeground(new java.awt.Color(52, 53, 61));
        serviceName14.setText("Ayudante asignado");
        jPanel2.add(serviceName14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        serviceDate9.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceDate9.setForeground(new java.awt.Color(141, 141, 141));
        serviceDate9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        serviceDate9.setText("Julano perez");
        serviceDate9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(serviceDate9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 170, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 440, 140));

        cancelServiceButton.setBackground(new java.awt.Color(242, 46, 62));
        cancelServiceButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        cancelServiceButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/customer/services/close.png"))); // NOI18N
        jLabel3.setText("Cancelar");
        cancelServiceButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel1.add(cancelServiceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 720, 220, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(233, 233, 233), 2, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(340, 246));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serviceName1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 16)); // NOI18N
        serviceName1.setForeground(new java.awt.Color(52, 53, 61));
        serviceName1.setText("Nombre servicio");
        jPanel4.add(serviceName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        serviceDate1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceDate1.setForeground(new java.awt.Color(141, 141, 141));
        serviceDate1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        serviceDate1.setText("20:40");
        serviceDate1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel4.add(serviceDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 260, 200, 20));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/customer/services/document.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 170));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 170));

        serviceName8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName8.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceName8.setForeground(new java.awt.Color(52, 53, 61));
        serviceName8.setText("Tiempo transcurrido");
        jPanel4.add(serviceName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 20));

        serviceName9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName9.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceName9.setForeground(new java.awt.Color(52, 53, 61));
        serviceName9.setText("Hora solicitud");
        jPanel4.add(serviceName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));

        serviceDate4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceDate4.setForeground(new java.awt.Color(141, 141, 141));
        serviceDate4.setText("1 hora y 24 minutos");
        jPanel4.add(serviceDate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, 20));

        serviceName10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName10.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceName10.setForeground(new java.awt.Color(52, 53, 61));
        serviceName10.setText("Pedido por");
        jPanel4.add(serviceName10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        serviceDate6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceDate6.setForeground(new java.awt.Color(141, 141, 141));
        serviceDate6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        serviceDate6.setText("Pepito perez");
        jPanel4.add(serviceDate6, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 290, 200, 20));

        serviceName11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceName11.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceName11.setForeground(new java.awt.Color(52, 53, 61));
        serviceName11.setText("Medio de pago");
        jPanel4.add(serviceName11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 20));

        serviceDate7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        serviceDate7.setForeground(new java.awt.Color(141, 141, 141));
        serviceDate7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        serviceDate7.setText("Efectivo");
        jPanel4.add(serviceDate7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 180, 20));

        jCheckBox2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(52, 53, 61));
        jCheckBox2.setText("Retorno");
        jCheckBox2.setEnabled(false);
        jPanel4.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 340, 400));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 950));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        subject.notificarObservadores(null);
    }//GEN-LAST:event_jLabel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancelServiceButton;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel serviceDate;
    private javax.swing.JLabel serviceDate1;
    private javax.swing.JLabel serviceDate11;
    private javax.swing.JLabel serviceDate12;
    private javax.swing.JLabel serviceDate14;
    private javax.swing.JLabel serviceDate4;
    private javax.swing.JLabel serviceDate6;
    private javax.swing.JLabel serviceDate7;
    private javax.swing.JLabel serviceDate9;
    private java.awt.Label serviceName;
    private java.awt.Label serviceName1;
    private java.awt.Label serviceName10;
    private java.awt.Label serviceName11;
    private java.awt.Label serviceName14;
    private java.awt.Label serviceName17;
    private java.awt.Label serviceName18;
    private java.awt.Label serviceName2;
    private java.awt.Label serviceName3;
    private java.awt.Label serviceName5;
    private java.awt.Label serviceName7;
    private java.awt.Label serviceName8;
    private java.awt.Label serviceName9;
    // End of variables declaration//GEN-END:variables
}
