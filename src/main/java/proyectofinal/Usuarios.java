package proyectofinal;

public class Usuarios{
    
   private Integer idusuario;
   private String correoU;
   private String contrasena;

    public Usuarios() {
    }

    public Usuarios(Integer idusuario, String correoU, String contrasena) {
        this.idusuario = idusuario;
        this.correoU = correoU;
        this.contrasena = contrasena;
    }
    

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getCorreoU() {
        return correoU;
    }

    public void setCorreoU(String correoU) {
        this.correoU = correoU;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    @Override
    public String toString() {
        return "Usuarios{" + "idusuario=" + idusuario +
                ", correoU=" + correoU +
                ", contrasena=" + contrasena + '}';
    }
   
         
   public void crear(){
       System.out.println("Creando");
   }
   public void editar(){
       System.out.println("Editado");
   }
      public void eliminar(){
       System.out.println("Eliminado");
   }
}
