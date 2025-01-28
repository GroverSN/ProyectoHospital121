package logica;

public class Medicamento {
    private String nombre;
    private String tipo;
    private int cantidad;
    private double costo;

    public Medicamento(String nombre, String tipo, int cantidad, double costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Medicamento [Nombre: " + nombre + ", Tipo: " + tipo + ", Cantidad: " + cantidad + ", Costo: Bs." + costo + "]";
    }
}

