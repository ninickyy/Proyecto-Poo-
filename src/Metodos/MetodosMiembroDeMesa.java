package Metodos;
import Modelo.MiembroDeMesa;
public class MetodosMiembroDeMesa {
    
    private MiembroDeMesa[] miembros;
    private int total;
    
    public MetodosMiembroDeMesa() {
        miembros = new MiembroDeMesa[20];
        total = 0;
}
    //Registro de miembro
    public void registrarMiembro(String nombres, String apellidos, String tipo){
        MiembroDeMesa m = new MiembroDeMesa(nombres, apellidos, tipo);
        miembros[total] = m;
        total++;
  }  
    //Eliminar Miembro
    public void eliminarMiembro(int el){
        for (int i = el; i < 10; i++) {
        miembros[i] = miembros[i + 1];
        }
        total--;
    }
    //Listar Miembros
    public MiembroDeMesa[] listarMiembros() {
        return miembros;
    }
    public int getTtoal() {
        return total;
    }
}

