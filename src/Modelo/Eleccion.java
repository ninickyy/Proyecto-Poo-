package Modelo;
public class Eleccion {
    //Atributos
    private String fecha;
    private String tipo;
    private MesaElectoral[] mesas;
    private int totalMesas;
    
    //Constructor

    public Eleccion(String fecha, String tipo) {
        this.fecha = fecha;
        this.tipo = tipo;
        mesas = new MesaElectoral[20];
        totalMesas = 0;
    }
    //Metodo
    public void agregarMesa(MesaElectoral m) {
        mesas[totalMesas] = m;
        totalMesas++;
    }
    //Getters

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public MesaElectoral[] getMesas() {
        return mesas;
    }

    public int getTotalMesas() {
        return totalMesas;
    }
   
    
}
