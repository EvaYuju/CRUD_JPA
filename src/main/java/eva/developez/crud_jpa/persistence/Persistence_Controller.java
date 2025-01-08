package eva.developez.crud_jpa.persistence;

import eva.developez.crud_jpa.logic.Duenio;
import eva.developez.crud_jpa.logic.Mascota;

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
    
}
