package logica;

import java.util.ArrayList;
import logica.Paciente;
import logica.Personal;

public class Hospital {

    private String nombreHospital;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Personal> personal;
    private ArrayList<Paciente> pacientes;

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Hospital(String nombreHospital, String direccion) {
        this.nombreHospital = nombreHospital;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        this.personal = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    // gestionar habitaciones
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    // gestionar personal
    public void registrarPersonal(Personal p) {
        personal.add(p);
    }

    public ArrayList<Personal> getPersonal() {
        return personal;
    }

    // gestionar pacientes
    public void registrarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    //mostrar Detalles
    public void mostrarDetalles() {
        System.out.println("=== Información del Hospital ===");
        System.out.println("Nombre: " + nombreHospital);
        System.out.println("Dirección: " + direccion);
        System.out.println("--- Habitaciones ---");
        for (Habitacion h : habitaciones) {
            System.out.println(h.toString());
        }
        System.out.println("--- Personal ---");
        for (Personal p : personal) {
            System.out.println(p.toString());
        }
        System.out.println("--- Pacientes ---");
        for (Paciente p : pacientes) {
            System.out.println(p.toString());
        }
    }

    @Override
    public String toString() {
        return "Hospital: " + nombreHospital + "\nDirección: " + direccion + "\nHabitaciones: " + habitaciones.size() + "\nPersonal: " + personal.size() + "\nPacientes: " + pacientes.size();
    }

    //buscarPacientes
    public Paciente buscarPaciente(String nombre) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Paciente encontrado: " + paciente.toString());
                return paciente;
            }
        }
        System.out.println("Paciente no encontrado: " + nombre);
        return null;
    }

}
