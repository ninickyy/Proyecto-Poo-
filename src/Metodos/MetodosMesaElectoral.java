package Metodos;
import Modelo.MesaElectoral;
import Modelo.MiembroDeMesa;

public class MetodosMesaElectoral {

    private MesaElectoral[] mesas;
    private int total;

    public MetodosMesaElectoral() {
        mesas = new MesaElectoral[20];
        total = 0;
    }

    //Registrar mesa
    public void registrarMesa(String codigo) {
        MesaElectoral m = new MesaElectoral(codigo);
        mesas[total] = m;
        total++;
    }

    //Eliminar mesa
    public void eliminarMesa(int pos) {
        for (int i = pos; i < total - 1; i++) {
            mesas[i] = mesas[i + 1];
        }
        total--;
    }

    //Elegir miembro a una mesa
    public void asignarMiembro(int posMesa, MiembroDeMesa miembro) {
        mesas[posMesa].agregarMiembro(miembro);
    }

    // Listar mesas
    public MesaElectoral[] listarMesas() {
        return mesas;
    }
    public int getTotal() {
        return total;
    }
}

