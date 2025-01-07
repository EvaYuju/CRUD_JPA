package eva.developez.crud_jpa.logic;

/**
 *
 * @author aquas
 */
public class Duenio {
    
    // atributos
    private int id_duenio;
    private String nombreDuenio;
    private String telefono;

    // constructor vacio
    public Duenio() {
    }
    
    // constructor con parametros
    public Duenio(int id_duenio, String nombreDuenio, String telefono) {
        this.id_duenio = id_duenio;
        this.nombreDuenio = nombreDuenio;
        this.telefono = telefono;
    }
    
    // getters y setters

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
