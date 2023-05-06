package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    PersonaJpaController persJPA = new PersonaJpaController();
    
    //declarar metodos
    
    public void crearPersona(Persona per){
        persJPA.create(per);
    }
    
    public Persona mostrarPersona(Integer id) {
      Persona mpers = persJPA.findPersona(id);
      return mpers;
    }
    
    public void editarPersona(Persona pers){
        try {
            persJPA.edit(pers);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPersona(Integer id){
        try {
            persJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPersona( Persona pers){
        try {
            persJPA.destroy(pers.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Persona> traerPersonas () {
    
       return persJPA.findPersonaEntities();
    
    }
    
}
