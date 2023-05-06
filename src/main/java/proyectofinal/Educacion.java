package proyectofinal;

import java.util.Date;

public class Educacion{
    
    private Integer idEducacion;
    private String nombreInstitucion;
    private String titulo;
    private Date fechaInicio;
    private Date fechaFin;
    private String urlIcono;

    public Educacion() {
    }

    public Educacion(Integer idEducacion, String nombreInstitucion, String titulo, Date fechaInicio, Date fechaFin, String urlIcono) {
        this.idEducacion = idEducacion;
        this.nombreInstitucion = nombreInstitucion;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.urlIcono = urlIcono;
    }
    
    

    public Integer getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Integer idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getUrlIcono() {
        return urlIcono;
    }

    public void setUrlIcono(String urlIcono) {
        this.urlIcono = urlIcono;
    }

    
    @Override
    public String toString() {
        return "Educacion{" + "idEducacion=" + idEducacion + ", nombreInstitucion=" + nombreInstitucion +
                ", titulo=" + titulo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin +
                ", urlIcono=" + urlIcono + '}';
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
