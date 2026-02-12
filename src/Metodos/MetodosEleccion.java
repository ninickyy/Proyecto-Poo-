package Metodos;
import Modelo.Eleccion;
import Modelo.MesaElectoral;
import java.util.Scanner;

public class MetodosEleccion {
    private Eleccion[] elecciones;
    private int total;
    public MetodosEleccion() {
        elecciones = new Eleccion[10];
        total = 0;
    }
    //Registrar eleccion
    public void registrarEleccion(String fecha, String tipo) {
        Eleccion e = new Eleccion(fecha, tipo);
        elecciones[total] = e;
        total++;
    }
    //Modificacion de eleccion
    public void modificarEleccion(int pos, String nuevaFecha, String nuevoTipo) {
        elecciones[pos] = new Eleccion(nuevaFecha, nuevoTipo);
    }
    //Eliminar eleccion
    public void eliminarEleccion(int pos) {
        for (int i = pos; i < total - 1; i++) {
            elecciones[i] = elecciones[i + 1];
        }
        total--;
    }
    //Elegir mesa a eleccion
    public void asignarMesa(int posEleccion, MesaElectoral mesa) {
        elecciones[posEleccion].agregarMesa(mesa);
    }
    // Listar elecciones
    public Eleccion[] listarElecciones() {
        return elecciones;
    }
    public int getTotal() {
        return total;
    }
}
