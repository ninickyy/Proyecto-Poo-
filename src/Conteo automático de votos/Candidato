package Modelo;

public class Candidato extends Persona {

    private String dni;
    private int votos;
    private int votosPreferenciales;

    public Candidato() {
        super();
        dni = "";
        votos = 0;
        votosPreferenciales = 0;
    }

    public Candidato(String nombres, String apellidos, String dni) {
        super(nombres, apellidos);
        this.dni = dni;
        votos = 0;
        votosPreferenciales = 0;
    }

    public void sumarVoto() {
        votos++;
    }

    public void sumarVotoPreferencial() {
        votosPreferenciales++;
    }

    public int getVotos() {
        return votos;
    }

    public int getVotosPreferenciales() {
        return votosPreferenciales;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("DNI: " + dni);
        System.out.println("Votos: " + votos);
        System.out.println("Votos Preferenciales: " + votosPreferenciales);
    }
}

