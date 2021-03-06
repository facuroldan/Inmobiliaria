/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.Vistas;

import inmobiliaria.DTOs.DTOTransaccion;
import inmobiliaria.GestorBD.TransaccionesBD;
import inmobiliaria.Modelos.Transaccion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facut
 */
public class Listado extends javax.swing.JFrame {

        TransaccionesBD trandb = new TransaccionesBD();
        ArrayList<DTOTransaccion> lista = trandb.ObtenerTransacciones();
    public Listado() {
        initComponents();
        Calculos();
        InicializarTablas("General");
        btnVolverMayor.setVisible(false);
        btnVolverOficina.setVisible(false);
    }
    
    public void Calculos(){
        txtAlquileres.setEnabled(false);
       int total = lista.size();
       int alquiler = 0;
       int entro = 0;
        float porc;
        for(DTOTransaccion dt : lista){
            if(dt.getOperacion().getOperacion().equals("Alquiler")){
                alquiler++;
            }
        }
        porc = (100 * alquiler)/total;
        txtAlquileres.setText(String.valueOf(porc));
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
        tblTransacciones = new javax.swing.JTable();
        btnMayor = new javax.swing.JButton();
        lblPorcentaje = new javax.swing.JLabel();
        txtAlquileres = new javax.swing.JTextField();
        btnVolverMayor = new javax.swing.JButton();
        btnVolverOficina = new javax.swing.JButton();
        btnMayor1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblTransacciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTransacciones);

        btnMayor.setText("Mayor Monto");
        btnMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayorActionPerformed(evt);
            }
        });

        lblPorcentaje.setText("Porcentaje de Alquileres: ");

        txtAlquileres.setBackground(new java.awt.Color(0, 0, 0));
        txtAlquileres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAlquileres.setForeground(new java.awt.Color(255, 0, 51));

        btnVolverMayor.setText("Volver");
        btnVolverMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMayorActionPerformed(evt);
            }
        });

        btnVolverOficina.setText("Volver");
        btnVolverOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverOficinaActionPerformed(evt);
            }
        });

        btnMayor1.setText("Transacciones Oficina");
        btnMayor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayor1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnMayor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPorcentaje)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlquileres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolverMayor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMayor1)
                        .addGap(43, 43, 43)
                        .addComponent(btnVolverOficina)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMayor1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVolverOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVolverMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPorcentaje)
                    .addComponent(txtAlquileres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayorActionPerformed
        InicializarTablas("Mayor");
        btnVolverMayor.setVisible(true);
        btnVolverOficina.setVisible(false);
    }//GEN-LAST:event_btnMayorActionPerformed

    private void btnVolverMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMayorActionPerformed
        InicializarTablas("General");
        btnVolverMayor.setVisible(false);
    }//GEN-LAST:event_btnVolverMayorActionPerformed

    private void btnVolverOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverOficinaActionPerformed
        InicializarTablas("General");
        btnVolverOficina.setVisible(false);
    }//GEN-LAST:event_btnVolverOficinaActionPerformed

    private void btnMayor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayor1ActionPerformed
        InicializarTablas("Oficina");
        btnVolverOficina.setVisible(true);
        btnVolverMayor.setVisible(false);
    }//GEN-LAST:event_btnMayor1ActionPerformed

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
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMayor;
    private javax.swing.JButton btnMayor1;
    private javax.swing.JButton btnVolverMayor;
    private javax.swing.JButton btnVolverOficina;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPorcentaje;
    private javax.swing.JTable tblTransacciones;
    private javax.swing.JTextField txtAlquileres;
    // End of variables declaration//GEN-END:variables
    public void InicializarTablas(String Tipo){
        switch (Tipo) {
                case "General":
                    DefaultTableModel modeloGeneral = new DefaultTableModel();
                    modeloGeneral.setColumnIdentifiers(new Object[]{ "ID", "FECHA", "OPERACION", "INMUEBLE", "MONTO", "VENDEDOR"});
                    for (DTOTransaccion dt : lista){
                        modeloGeneral.addRow(new Object[]{
                            dt.getIdTransaccion(),
                            dt.getFecha(),
                            dt.getOperacion().getOperacion(),
                            dt.getInmueble().getInmueble(),
                            dt.getMonto(),
                            dt.getVendedor().getNombreCompleto()
                        });
                    }       tblTransacciones.setModel(modeloGeneral);
                    break;
                case "Mayor":
                    ArrayList<DTOTransaccion> lista = trandb.ObtenerMayorMontoDeVenta();
                    DefaultTableModel modeloMayorMonto = new DefaultTableModel();
                    modeloMayorMonto.setColumnIdentifiers(new Object[]{ "ID", "FECHA", "OPERACION", "INMUEBLE", "MONTO", "VENDEDOR"});
                    for (DTOTransaccion dt : lista){
                        modeloMayorMonto.addRow(new Object[]{
                            dt.getIdTransaccion(),
                            dt.getFecha(),
                            dt.getOperacion().getOperacion(),
                            dt.getInmueble().getInmueble(),
                            dt.getMonto(),
                            dt.getVendedor().getNombreCompleto()
                        });
                    }
                    tblTransacciones.setModel(modeloMayorMonto);
                    break;
                case "Oficina":
                    ArrayList<DTOTransaccion> listaOficina = trandb.ObtenerTransaccionesDeOficina();
                    DefaultTableModel modeloOficina = new DefaultTableModel();
                    modeloOficina.setColumnIdentifiers(new Object[]{ "ID", "FECHA", "OPERACION", "INMUEBLE", "MONTO", "VENDEDOR"});
                    for (DTOTransaccion dt : listaOficina){
                        modeloOficina.addRow(new Object[]{
                            dt.getIdTransaccion(),
                            dt.getFecha(),
                            dt.getOperacion().getOperacion(),
                            dt.getInmueble().getInmueble(),
                            dt.getMonto(),
                            dt.getVendedor().getNombreCompleto()
                        });
                    }
                    tblTransacciones.setModel(modeloOficina);
                    break;
                default:
                    break;
            }
    }
}
