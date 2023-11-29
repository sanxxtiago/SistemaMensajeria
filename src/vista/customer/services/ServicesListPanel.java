/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.customer.services;

import java.util.List;
import modelo.Servicio;
import negocio.Controlador;
import utils.Constants;
import vista.customer.Customer;

/**
 *
 * @author dsola
 */
public class ServicesListPanel extends javax.swing.JPanel {

    Controlador controlador = new Controlador();
    /**
     * Creates new form ServicesListPanel
     */
    public ServicesListPanel() {
        initComponents();
        displayServices();
    }
    
    
    
    public int[] getServicePanelCords (int index) {
        int espacioEntreComponentes = 50;
        int componentesPorFila = 2;

        int fila = index / componentesPorFila;
        int columna = index % componentesPorFila;

        int x = columna * (Constants.getItemXSize() + espacioEntreComponentes);
        int y = fila * (Constants.getItemYSize() + espacioEntreComponentes);

        return new int[]{x, y};
    }
    
    public ServiceItemDetailsPanel[] getServicesPanels () {
        try{
            List<Servicio> services = controlador.consultarServiciosPorIdCliente(456789123);
            ServiceItemDetailsPanel servicesPanels[] = new ServiceItemDetailsPanel[services.size()];
        
            Customer indexClass = Customer.getInstance();

            for(var index = 0; index < services.size() ; index++) {
                int[] coords = getServicePanelCords(index);
                
                servicesPanels[index] = new ServiceItemDetailsPanel(services.get(index));
                servicesPanels[index].setSize(Constants.getItemXSize(), Constants.getItemYSize());
                servicesPanels[index].setLocation(coords[0], coords[1]);
                serviceListContainer.add(servicesPanels[index]);

                servicesPanels[index].subject.agregarObservador(indexClass);
            }

            return servicesPanels;
        }catch(Exception e) {
            System.out.println(e);
        }
        
        return null;
    }
    
    public void displayServices() {
        serviceListContainer.removeAll();
        getServicesPanels();
        serviceListContainer.revalidate();
        serviceListContainer.repaint();
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
        serviceListContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1440, 950));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 950));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 26)); // NOI18N
        jLabel1.setText("Mis solicitudes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 81, -1, -1));

        serviceListContainer.setBackground(new java.awt.Color(255, 255, 255));
        serviceListContainer.setAutoscrolls(true);

        javax.swing.GroupLayout serviceListContainerLayout = new javax.swing.GroupLayout(serviceListContainer);
        serviceListContainer.setLayout(serviceListContainerLayout);
        serviceListContainerLayout.setHorizontalGroup(
            serviceListContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        serviceListContainerLayout.setVerticalGroup(
            serviceListContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jPanel1.add(serviceListContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 147, 850, 660));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 950));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel serviceListContainer;
    // End of variables declaration//GEN-END:variables
}
