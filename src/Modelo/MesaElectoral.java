package Modelo;
public class MesaElectoral {
    //Atributos
    private String codigo;
    private MiembroDeMesa[] miembros;
    private int totalMiembros;
    //Constructor

    public MesaElectoral(String codigo) {
        this.codigo = codigo;
        miembros = new MiembroDeMesa[3];
        totalMiembros = 0;
    }
    //Metodo
    public void agregarMiembro(MiembroDeMesa m) {
        if (totalMiembros < miembros.length) {
        miembros[totalMiembros] = m;
        totalMiembros++;
        }
    }
    //Getters

    public String getCodigo() {
        return codigo;
    }

    public MiembroDeMesa[] getMiembros() {
        return miembros;
    }

    public int getTotalMiembros() {
        return totalMiembros;
    }
    
    
    
}
