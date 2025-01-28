package logica;

public class SalaUrgencias extends Habitacion {

    private int tiempoRespuesta;

    public SalaUrgencias(int idHabitacion, String tipo, int capacidad, boolean equipoEspecializado, int idHospital, int tiempoRespuesta) {
        super(idHabitacion, tipo, capacidad, equipoEspecializado, idHospital);
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(int tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tiempo de Respuesta: " + tiempoRespuesta + " minutos";
    }

    //reducirTiempo
    public void reducirTiempoRespuesta(int minutos) {
        if (minutos > 0 && tiempoRespuesta - minutos >= 0) {
            tiempoRespuesta -= minutos;
            System.out.println("El tiempo de respuesta de la sala de urgencias ha sido reducido a: " + tiempoRespuesta + " minutos");
        } else {
            System.out.println("El tiempo de respuesta no puede ser reducido más allá de 0.");
        }
    }

}

