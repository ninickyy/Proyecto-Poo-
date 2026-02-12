package Modelo;
public class MiembroDeMesa {
    //Atributos
    private String nombres;
    private String apellidos;
    private String tipo;
    
    //Constructor
    public MiembroDeMesa(String nombres, String apellidos, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipo = tipo;
    }
    //Getters

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTipo() {
        return tipo;
    }
}
