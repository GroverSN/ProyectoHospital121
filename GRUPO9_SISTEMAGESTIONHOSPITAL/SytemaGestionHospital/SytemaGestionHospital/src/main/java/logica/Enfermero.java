package logica;

import logica.Personal;

public class Enfermero extends Personal {

    private int habitacionAsignada;

    public Enfermero(String nombre, int edad, String genero, String turno, String cargo, double sueldo) {
        super(nombre, edad, genero, turno, cargo, sueldo);
        this.habitacionAsignada = habitacionAsignada;
    }

    public int getHabitacionAsignada() {
        return habitacionAsignada;
    }

    public void setHabitacionAsignada(int habitacionAsignada) {
        this.habitacionAsignada = habitacionAsignada;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitación Asignada: " + habitacionAsignada;
    }

    //cambiarTurno
    public void cambiarTurno(String nuevoTurno) {
        System.out.println("El turno del enfermero " + this.getNombre() + " ha sido cambiado a: " + nuevoTurno);
        this.setTurno(nuevoTurno);
    }
    public void realizarActividad() {
    System.out.println("El enfermero habla con un paciente");
    }

}
