package proyectofinal;

public class Habilidades {
  private Integer idhabilidades;
  private String nombrehabilidad;
  private Integer porcentajehabilidad;

    public Habilidades() {
    }

    public Habilidades(Integer idhabilidades, String nombrehabilidad, Integer porcentajehabilidad) {
        this.idhabilidades = idhabilidades;
        this.nombrehabilidad = nombrehabilidad;
        this.porcentajehabilidad = porcentajehabilidad;
    }

    
    
    public Integer getIdhabilidades() {
        return idhabilidades;
    }

    public void setIdhabilidades(Integer idhabilidades) {
        this.idhabilidades = idhabilidades;
    }

    public String getNombrehabilidad() {
        return nombrehabilidad;
    }

    public void setNombrehabilidad(String nombrehabilidad) {
        this.nombrehabilidad = nombrehabilidad;
    }

    public Integer getPorcentajehabilidad() {
        return porcentajehabilidad;
    }

    public void setPorcentajehabilidad(Integer porcentajehabilidad) {
        this.porcentajehabilidad = porcentajehabilidad;
    }

    
    @Override
    public String toString() {
        return "Habilidades{" + "idhabilidades=" + idhabilidades +
                ", nombrehabilidad=" + nombrehabilidad +
                ", porcentajehabilidad=" + porcentajehabilidad + '}';
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
