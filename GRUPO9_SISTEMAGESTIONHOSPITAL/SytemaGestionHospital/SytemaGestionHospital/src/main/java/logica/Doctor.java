package logica;

public class Doctor extends Personal {
    private String especialidad;
    private int nroPacientes;

    // Constructor correcto, con parámetros esperados
    public Doctor(String nombre, int edad, String genero, String cargo, String especialidad, double sueldo) {
        super(nombre, edad, genero,cargo, "Doctor", sueldo);
        this.especialidad = especialidad;
        this.nroPacientes = nroPacientes;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNroPacientes() {
        return nroPacientes;
    }

    public void setNroPacientes(int nroPacientes) {
        this.nroPacientes = nroPacientes;
    }

    public void atenderPaciente(String nombrePaciente) {
        System.out.println("El doctor " + this.getNombre() + " está atendiendo al paciente: " + nombrePaciente);
        this.nroPacientes++;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidad: " + especialidad + ", Número de Pacientes: " + nroPacientes;
    }

    @Override
    public void realizarActividad() {
        System.out.println("El doctor realiza un diagnóstico.");
    }
}
