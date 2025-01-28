package logica;

import java.util.ArrayList;

public class Farmacia<T> {

    private ArrayList<T> medicamentos;

    public Farmacia() {
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(T medicamento) {
        medicamentos.add(medicamento);
    }

    public void eliminarMedicamento(T medicamento) {
        medicamentos.remove(medicamento);
    }

    public ArrayList<T> getMedicamentos() {
        return medicamentos;
    }

    public int contarMedicamentos() {
        return medicamentos.size();
    }

    @Override
    public String toString() {
        return "Farmacia [Medicamentos almacenados: " + medicamentos.size() + "]";
    }

    //buscarMedicamento
    public T buscarMedicamento(String nombreMedicamento) {
        for (T medicamento : medicamentos) {
            if (medicamento.toString().contains(nombreMedicamento)) {
                System.out.println("Medicamento encontrado: " + medicamento.toString());
                return medicamento;
            }
        }
        System.out.println("Medicamento no encontrado: " + nombreMedicamento);
        return null;
    }

}

