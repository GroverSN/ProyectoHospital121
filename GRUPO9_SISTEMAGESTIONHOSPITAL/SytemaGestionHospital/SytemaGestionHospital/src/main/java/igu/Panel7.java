package igu;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.Paciente;
import persistencia.PacienteDAO;

public class Panel7 extends javax.swing.JPanel {

    public Panel7() {
        initComponents();
        cargarPacientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "diagnostico", "fechaIngreso", "estadoClinico", "nroHabitacion", "nroCamilla", "nombre", "edad", "genero"
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
cargarPacientes();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargarPacientes() {
    try {
        PacienteDAO pacienteDAO = new PacienteDAO();
        List<Paciente> pacientes = pacienteDAO.listarPacientes();

        if (pacientes == null || pacientes.isEmpty()) {
            System.out.println("No hay pacientes disponibles.");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevas filas
        modelo.setColumnIdentifiers(new String[]{
            "Nombre", "Edad", "Género", "Diagnóstico", "Fecha de Ingreso", "Estado Clínico", "Nro Habitación", "Nro Camilla"
        });

        for (Paciente paciente : pacientes) {
            modelo.addRow(new Object[]{
                paciente.getNombre(),
                paciente.getEdad(),
                paciente.getGenero(),
                paciente.getDiagnostico(),
                paciente.getFechaIngreso(),
                paciente.getEstadoClinico(),
                paciente.getNroHabitacion(),
                paciente.getNroCamilla()
            });
        }
    } catch (Exception e) {
        System.err.println("Error al cargar pacientes: " + e.getMessage());
    }
}

    
}
