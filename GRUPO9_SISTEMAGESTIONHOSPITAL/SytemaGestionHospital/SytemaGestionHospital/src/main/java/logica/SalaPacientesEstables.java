package logica;

public class SalaPacientesEstables extends Habitacion {
    private boolean areaRecreativa;

    public SalaPacientesEstables(int idHabitacion, String tipo, int capacidad, boolean equipoEspecializado, int idHospital) {
        super(idHabitacion,tipo,capacidad,equipoEspecializado,idHospital);
        this.areaRecreativa = false; 
    }

    public boolean isAreaRecreativa() {
        return areaRecreativa;
    }

    public void setAreaRecreativa(boolean areaRecreativa) {
        this.areaRecreativa = areaRecreativa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Area Recreativa: " + (areaRecreativa ? "Sí" : "No");
    }
}

