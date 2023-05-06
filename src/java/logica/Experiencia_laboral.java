package logica;

import java.util.Date;

public class Experiencia_laboral extends Tipo_empleo{
    
   private Integer idEL;
   private String cargo;
   private String nombreEmpresa;
   private String jornada;
   private Boolean esTrabajoActual;
   private Date fechaInicioEL;
   private Date fechaFinEL;
   private String ubicacion;
   private String urlIconoEL;

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(Integer idEL, String cargo, String nombreEmpresa, String jornada, Boolean esTrabajoActual, Date fechaInicioEL, Date fechaFinEL, String ubicacion, String urlIconoEL, Integer idTE, String nombre_tipo) {
        super(idTE, nombre_tipo);
        this.idEL = idEL;
        this.cargo = cargo;
        this.nombreEmpresa = nombreEmpresa;
        this.jornada = jornada;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicioEL = fechaInicioEL;
        this.fechaFinEL = fechaFinEL;
        this.ubicacion = ubicacion;
        this.urlIconoEL = urlIconoEL;
    }
    
    

    
    
    public Integer getIdEL() {
        return idEL;
    }

    public void setIdEL(Integer idEL) {
        this.idEL = idEL;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Boolean getEsTrabajoActual() {
        return esTrabajoActual;
    }

    public void setEsTrabajoActual(Boolean esTrabajoActual) {
        this.esTrabajoActual = esTrabajoActual;
    }

    public Date getFechaInicioEL() {
        return fechaInicioEL;
    }

    public void setFechaInicioEL(Date fechaInicioEL) {
        this.fechaInicioEL = fechaInicioEL;
    }

    public Date getFechaFinEL() {
        return fechaFinEL;
    }

    public void setFechaFinEL(Date fechaFinEL) {
        this.fechaFinEL = fechaFinEL;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUrlIconoEL() {
        return urlIconoEL;
    }

    public void setUrlIconoEL(String urlIconoEL) {
        this.urlIconoEL = urlIconoEL;
    }

    @Override
    public String toString() {
        return "Experiencia_laboral{" + "idEL=" + idEL + ", cargo=" + cargo +
                ", nombreEmpresa=" + nombreEmpresa + ", jornada=" + jornada +
                ", esTrabajoActual=" + esTrabajoActual + ", fechaInicioEL=" + fechaInicioEL +
                ", fechaFinEL=" + fechaFinEL + ", ubicacion=" + ubicacion +
                ", urlIconoEL=" + urlIconoEL + '}';
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
