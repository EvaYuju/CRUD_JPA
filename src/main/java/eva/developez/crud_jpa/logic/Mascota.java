package eva.developez.crud_jpa.logic;

/**
 *
 * @author aquas
 */
public class Mascota {
    
    // Atributos
    private int num_cliente;
    private String nombreMascota;
    private String raza;
    private  String color;
    private String observaciones;
    private String alergico;
    private String atencion_especial;
    
    // Objeto dueño para relacion 1n1
    private Duenio unDuenio;
        
    // Constructores
       public Mascota() {
    }
       
        public Mascota(int num_cliente, String nombreMascota, String raza, String color, String observaciones, String alergico, String atencion_especial, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.color = color;
        this.observaciones = observaciones;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.unDuenio = unDuenio;
    }

    // Getter y setter
    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
    
}
