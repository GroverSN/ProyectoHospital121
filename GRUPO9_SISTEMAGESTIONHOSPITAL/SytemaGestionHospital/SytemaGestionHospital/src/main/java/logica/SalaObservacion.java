package logica;

public class SalaObservacion extends Habitacion {

    private int duracionMaxEstadia;

    public SalaObservacion(int idHabitacion, String tipo, int capacidad, boolean equipoEspecializado, int idHospital) {
        super(idHabitacion ,tipo, capacidad ,equipoEspecializado ,idHospital);
        this.duracionMaxEstadia = 0;
    }

    public SalaObservacion(int idHabitacion, String tipo, int capacidad, boolean equipoEspecializado, int idHospital, int duracionMaxEstadia) {
        super(idHabitacion, tipo ,capacidad, equipoEspecializado, idHospital);
        this.duracionMaxEstadia = duracionMaxEstadia;
    }

    public int getDuracionMaxEstadia() {
        return duracionMaxEstadia;
    }

    public void setDuracionMaxEstadia(int duracionMaxEstadia) {
        this.duracionMaxEstadia = duracionMaxEstadia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duración Máxima de Estadía: " + duracionMaxEstadia + " días";
    }
    
    public void extenderDuracionMaxEstadia(int diasExtras) {
        if (diasExtras > 0) {
            duracionMaxEstadia += diasExtras;
            System.out.println("La duración máxima de estadía ha sido extendida a: " + duracionMaxEstadia + " días.");
        } else {
            System.out.println("Los días extras deben ser positivos.");
        }
    }

}

