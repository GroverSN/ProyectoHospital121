package logica;

public class Habitacion {
   
    private int idHabitacion;
    private String tipo; 
    private int capacidad;
    private boolean equipoEspecializado;
    private int idHospital;

    public Habitacion(int idHabitacion,String tipo, int capacidad, boolean equipoEspecializado, int idHospital) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.equipoEspecializado = equipoEspecializado;
        this.idHospital = idHospital;
    }

    public int getIdSala() {
        return idHabitacion;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdSala(int idSala) {
        this.idHabitacion = idSala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEquipoEspecializado() {
        return equipoEspecializado;
    }

    public void setEquipoEspecializado(boolean equipoEspecializado) {
        this.equipoEspecializado = equipoEspecializado;
    }

    @Override
    public String toString() {
        return "Habitacion [ID Sala: " + idHabitacion + ", Capacidad: " + capacidad + ", Equipo Especializado: " + (equipoEspecializado ? "Sí" : "No") + "]";
    }
}
