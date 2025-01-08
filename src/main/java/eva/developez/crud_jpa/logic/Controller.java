package eva.developez.crud_jpa.logic;

import eva.developez.crud_jpa.persistence.Persistence_Controller;
import java.util.List;

/**
 *
 * @author aquas
 */
public class Controller {
    
    // Logica llama a la persistencia
    Persistence_Controller controlPersis = new Persistence_Controller();

    // Recibe de IGU los datos
    public void guardar(String nomMascota, String raza, String color, String alergico, String atEsp, String nomDuenio, String tlf, String observ) {

        // Creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombreDuenio(nomDuenio);
        duenio.setTelefono(tlf);
        
        // Creamos la mascota y asignamos sus valores
        Mascota mascota = new Mascota();
        mascota.setNombreMascota(nomMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atEsp);
        mascota.setObservaciones(observ);
        //mascota.setNum_cliente(0); // automatica
        
        mascota.setUnDuenio(duenio);
        
        // Llamamos a la persistencia desde la logica de crear objetos en la BD
        controlPersis.guardar(duenio,mascota);
    }

    // Cargar datos BD en tabla
    public List<Mascota> cargarDatosTabla() {

        return controlPersis.cargarDatos();
        
    }

    public void borrarMascota(int num_cliente) {

        controlPersis.borrarMascota(num_cliente);
    }

    public void editarMascota(int num_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
    
    
}
