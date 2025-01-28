package logica;

public abstract class Personal extends Persona {
    protected String turno;
    protected String cargo;
    protected double sueldo;

    public Personal(String nombre, int edad, String genero, String turno, String cargo, double sueldo) {
        super(nombre, edad, genero);
        this.turno = turno;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Turno: " + turno + ", Cargo: " + cargo + ", Sueldo: Bs." + sueldo;
    }
}

