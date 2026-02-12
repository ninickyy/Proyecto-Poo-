package Pruebas;
import Modelo.Eleccion;
import Modelo.MesaElectoral;
import Modelo.MiembroDeMesa;
import Metodos.MetodosEleccion;
import Metodos.MetodosMesaElectoral;
public class PruebaDeModelo {
    
    public static void main(String[] args) {
        //Miembros
        MiembroDeMesa presidente = new MiembroDeMesa("Samir", "Mohana", "Presidente");
        MiembroDeMesa secretario  = new MiembroDeMesa("Axl", "Albites", "Secretario");
        MiembroDeMesa vocal       = new MiembroDeMesa("Mateo", "Reategui", "Vocal");
        
        //Crear mesa y elegir mimebros
        MesaElectoral mesa1 = new MesaElectoral("1");
        mesa1.agregarMiembro(presidente);
        mesa1.agregarMiembro(secretario);
        mesa1.agregarMiembro(vocal);
        
        //Crear eleccion y elegir mesa
        Eleccion eleccion = new Eleccion("12/04/2026", "Municipal");
        eleccion.agregarMesa(mesa1);
        
        //Mostrar resultados
        System.out.println("Fecha: " + eleccion.getFecha());
        System.out.println("Tipo : " + eleccion.getTipo());
        System.out.println("Total Mesas: " + eleccion.getTotalMesas());

        //Mostrar datos de la primera mesa
        MesaElectoral mesaMostrada = eleccion.getMesas()[0];
        System.out.println("Mesa: " + mesaMostrada.getCodigo());
        System.out.println("Total Miembros en Mesa: " + mesaMostrada.getTotalMiembros());

        //Mostrar miembros de esa mesa
        for (int i = 0; i < mesaMostrada.getTotalMiembros(); i++) {
            MiembroDeMesa mm = mesaMostrada.getMiembros()[i];
            System.out.println(" - " + mm.getTipo() + ": " + mm.getNombres() + " " + mm.getApellidos());
    }
    MetodosEleccion me = new MetodosEleccion();
    MetodosMesaElectoral mm = new MetodosMesaElectoral();

    mm.registrarMesa("Mesa 10");

    me.registrarEleccion("20/05/2026", "Nacional");
    me.asignarMesa(0, mm.listarMesas()[0]);

    System.out.println("Elecciones registradas: " + me.getTotal());
    System.out.println("Mesas en eleccion: " + me.listarElecciones()[0].getTotalMesas());

    
}
}