package logica;

public class Proyectos {
     
   private Integer idproyectos;
   private String nombreProyectos;
   private String descripcionProyecto;

    public Proyectos() {
    }

    public Proyectos(Integer idproyectos, String nombreProyectos, String descripcionProyecto) {
        this.idproyectos = idproyectos;
        this.nombreProyectos = nombreProyectos;
        this.descripcionProyecto = descripcionProyecto;
    }

   
    public Integer getIdproyectos() {
        return idproyectos;
    }

    public void setIdproyectos(Integer idproyectos) {
        this.idproyectos = idproyectos;
    }

    public String getNombreProyectos() {
        return nombreProyectos;
    }

    public void setNombreProyectos(String nombreProyectos) {
        this.nombreProyectos = nombreProyectos;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    
    @Override
    public String toString() {
        return "Proyectos{" + "idproyectos=" + idproyectos +
                ", nombreProyectos=" + nombreProyectos +
                ", descripcionProyecto=" + descripcionProyecto + '}';
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
