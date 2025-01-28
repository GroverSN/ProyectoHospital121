package igu;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.Medicamento;
import persistencia.MedicamentoDAO;

public class Panel10 extends javax.swing.JPanel {

    public Panel10() {
        initComponents();
        cargarMedicamentos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "nombre", "tipo", "cantidad", "costo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
cargarMedicamentos();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
    private void cargarMedicamentos() {
        try {
            MedicamentoDAO medicamentoDAO = new MedicamentoDAO();
            List<Medicamento> medicamentos = medicamentoDAO.listarMedicamentos();

            if (medicamentos == null || medicamentos.isEmpty()) {
                System.out.println("No hay medicamentos disponibles.");
                return;
            }

            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevas filas
            modelo.setColumnIdentifiers(new String[]{
                "Nombre", "Tipo", "Cantidad", "Costo"
            });

            for (Medicamento medicamento : medicamentos) {
                    modelo.addRow(new Object[]{
                    medicamento.getNombre(),
                    medicamento.getTipo(),
                    medicamento.getCantidad(),
                    String.format("%.2f", medicamento.getCosto()) // Mostrar el costo con 2 decimales
                });
            }
        } catch (Exception e) {
            System.err.println("Error al cargar medicamentos: " + e.getMessage());
        }
    }

    
}
