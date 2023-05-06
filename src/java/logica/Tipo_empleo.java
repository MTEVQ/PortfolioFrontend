
package logica;

public class Tipo_empleo {
    
    private Integer idTE;
    private String nombre_tipo;

    public Tipo_empleo() {
    }

    public Tipo_empleo(Integer idTE, String nombre_tipo) {
        this.idTE = idTE;
        this.nombre_tipo = nombre_tipo;
    }

      

    public Integer getIdTE() {
        return idTE;
    }

    public void setIdTE(Integer idTE) {
        this.idTE = idTE;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }

    
    @Override
    public String toString() {
        return "Tipo_empleo{" + "idTE=" + idTE +
                ", nombre_tipo=" + nombre_tipo + '}';
    }
   
          
   public void mostrar(){
       System.out.println("Mostrando");
   }
   public void editar(){
       System.out.println("Editado");
   }
   public void agregar(){
       System.out.println("Agregado");
   }
   public void eliminar(){
       System.out.println("Eliminado");
   }
}
