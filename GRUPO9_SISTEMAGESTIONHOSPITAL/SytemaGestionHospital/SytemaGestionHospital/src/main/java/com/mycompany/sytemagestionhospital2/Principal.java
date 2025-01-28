package com.mycompany.sytemagestionhospital2;

import igu.Pantalla;
import persistencia.HabitacionDAO;
import persistencia.HospitalDAO;
import persistencia.MedicamentoDAO;
import persistencia.PacienteDAO;
import persistencia.PersonalDAO;

public class Principal {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
        
         HospitalDAO hospitalDAO = new HospitalDAO();
        PacienteDAO pacienteDAO = new PacienteDAO();
        HabitacionDAO habitacionDAO = new HabitacionDAO();
        PersonalDAO personalDAO = new PersonalDAO();
        MedicamentoDAO medicamentoDAO = new MedicamentoDAO();
    }
}