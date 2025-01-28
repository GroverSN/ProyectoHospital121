package logica;

import logica.Persona;

public class Paciente extends Persona {

    private String diagnostico;
    private String fechaIngreso;
    private String estadoClinico;
    private int nroHabitacion;
    private int nroCamilla;

    public Paciente(String nombre, int edad, String genero, String diagnostico, String fechaIngreso, String estadoClinico, int nroHabitacion, int nroCamilla) {
        super(nombre, edad, genero);
        this.diagnostico = diagnostico;
        this.fechaIngreso = fechaIngreso;
        this.estadoClinico = estadoClinico;
        this.nroHabitacion = nroHabitacion;
        this.nroCamilla = nroCamilla;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstadoClinico() {
        return estadoClinico;
    }

    public void setEstadoClinico(String estadoClinico) {
        this.estadoClinico = estadoClinico;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public int getNroCamilla() {
        return nroCamilla;
    }

    public void setNroCamilla(int nroCamilla) {
        this.nroCamilla = nroCamilla;
    }

    @Override
    public String toString() {
        return super.toString() + ", Diagnóstico: " + diagnostico + ", Fecha de Ingreso: " + fechaIngreso + ", Estado Clínico: " + estadoClinico + ", Habitación: " + nroHabitacion + ", Camilla: " + nroCamilla;
    }

    //actualizar Estado
    public void actualizarEstadoClinico(String nuevoEstado) {
        System.out.println("El estado clínico del paciente " + this.getNombre() + " ha cambiado a: " + nuevoEstado);
        this.estadoClinico = nuevoEstado;
    }
    public void realizarActividad() {
    System.out.println("El paciente indica susu sintomas.");
    }
}

