package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearPersona(Persona per){
        controlPersis.crearPersona(per);
    }
    
    public void mostrarPersona(Integer id){
        controlPersis.mostrarPersona(id);
    }
    
    public void editarPersona(Persona pers){
        controlPersis.editarPersona(pers);
    }
    
    public void eliminarPersona(Integer id){
        controlPersis.eliminarPersona(id);
    }
    
    public void eliminarPersona(Persona pers){
        controlPersis.eliminarPersona(pers);
    }
    
    public List<Persona> traerPersona(){
        return controlPersis.traerPersonas();
    }
}
