package Modelo;

public class Eleccion implements Reporte {

    private String fecha;
    private String tipo;
    private MesaElectoral[] mesas;
    private int totalMesas;

    public Eleccion() {
        fecha = "";
        tipo = "";
        mesas = new MesaElectoral[20];
        totalMesas = 0;
    }

    public Eleccion(String fecha, String tipo) {
        this.fecha = fecha;
        this.tipo = tipo;
        mesas = new MesaElectoral[20];
        totalMesas = 0;
    }

    public void agregarMesa(MesaElectoral m) {
        if (totalMesas < mesas.length) {
            mesas[totalMesas] = m;
            totalMesas++;
        }
    }

    @Override
    public void generarReporte() {

        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo: " + tipo);

        int totalGeneral = 0;
        int totalBlancos = 0;
        int totalNulos = 0;

        for (int i = 0; i < totalMesas; i++) {

            ActaElectoral acta = mesas[i].getActa();

            if (acta != null) {
                totalGeneral += acta.getTotalVotantes();
                totalBlancos += acta.getVotosBlancos();
                totalNulos += acta.getVotosNulos();
            }
        }

        System.out.println("Total Votantes: " + totalGeneral);
        System.out.println("Total Blancos: " + totalBlancos);
        System.out.println("Total Nulos: " + totalNulos);
    }
}
