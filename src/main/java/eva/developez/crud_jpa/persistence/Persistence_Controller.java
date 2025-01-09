package eva.developez.crud_jpa.persistence;

import eva.developez.crud_jpa.logic.Duenio;
import eva.developez.crud_jpa.logic.Mascota;
import eva.developez.crud_jpa.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aquas
 */
public class Persistence_Controller {
    
    //Instancias a los JPA Controllers
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    DuenioJpaController duenioJpa = new DuenioJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {

        //Uso de metodos prederminados desde jpa controller
        // Crear en la BD el Dueño
        duenioJpa.create(duenio);
        
        // Crear en la BD la mascota
        mascotaJpa.create(mascota);
        
    }

    public List<Mascota> cargarDatos() {

        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {

        try {
            mascotaJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Persistence_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Mascota traerMascota(int num_cliente) {

        return mascotaJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota mascota) {

        try {
            mascotaJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(Persistence_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {

        return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {

        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(Persistence_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
