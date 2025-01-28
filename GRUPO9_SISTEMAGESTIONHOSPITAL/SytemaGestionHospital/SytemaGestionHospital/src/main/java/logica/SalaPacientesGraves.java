package logica;

public class SalaPacientesGraves extends Habitacion {
    private boolean soporteVital;

    public SalaPacientesGraves(int idHabitacion, String tipo, int capacidad, boolean equipoEspecializado, int idHospital) {
        super(idHabitacion,tipo,capacidad, equipoEspecializado,idHospital);
        this.soporteVital = true;
    }

    public boolean isSoporteVital() {
        return soporteVital;
    }

    public void setSoporteVital(boolean soporteVital) {
        this.soporteVital = soporteVital;
    }

    @Override
    public String toString() {
        return super.toString() + ", Soporte Vital: " + (soporteVital ? "Sí" : "No");
    }
}

