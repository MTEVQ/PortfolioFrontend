package proyectofinal;

import java.util.Date;
import java.util.List;

public class Persona {
    
//declarando atributos
   private Integer id;
   private String nombre;
   private String apellido;
   private String profesion;
   private String correo;
   private String telefono;
   private String url_foto;
   private Date fehcaNac;
   private String acerca_De;
   private List<Domicilio> listDomicilio;
   private List<Educacion> listEducacion;
   private List<Experiencia_laboral> listExperiencia_laboral;
   private Usuarios Usuarios;
   private List<Proyectos> listProyectos;
   private List<Habilidades> listHabilidades;
   
   
  //constructor
    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellido, String profesion, String correo, String telefono, String url_foto, Date fehcaNac, String acerca_De, List<Domicilio> listDomicilio, List<Educacion> listEducacion, List<Experiencia_laboral> listExperiencia_laboral, Usuarios Usuarios, List<Proyectos> listProyectos, List<Habilidades> listHabilidades) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.correo = correo;
        this.telefono = telefono;
        this.url_foto = url_foto;
        this.fehcaNac = fehcaNac;
        this.acerca_De = acerca_De;
        this.listDomicilio = listDomicilio;
        this.listEducacion = listEducacion;
        this.listExperiencia_laboral = listExperiencia_laboral;
        this.Usuarios = Usuarios;
        this.listProyectos = listProyectos;
        this.listHabilidades = listHabilidades;
    }

      
    //getters y setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }

    public Date getFehcaNac() {
        return fehcaNac;
    }

    public void setFehcaNac(Date fehcaNac) {
        this.fehcaNac = fehcaNac;
    }

    public String getAcerca_De() {
        return acerca_De;
    }

    public void setAcerca_De(String acerca_De) {
        this.acerca_De = acerca_De;
    }

    public List<Domicilio> getListDomicilio() {
        return listDomicilio;
    }

    public void setListDomicilio(List<Domicilio> listDomicilio) {
        this.listDomicilio = listDomicilio;
    }

    public List<Educacion> getListEducacion() {
        return listEducacion;
    }

    public void setListEducacion(List<Educacion> listEducacion) {
        this.listEducacion = listEducacion;
    }

    public List<Experiencia_laboral> getListExperiencia_laboral() {
        return listExperiencia_laboral;
    }

    public void setListExperiencia_laboral(List<Experiencia_laboral> listExperiencia_laboral) {
        this.listExperiencia_laboral = listExperiencia_laboral;
    }

    public Usuarios getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(Usuarios Usuarios) {
        this.Usuarios = Usuarios;
    }

    public List<Proyectos> getListProyectos() {
        return listProyectos;
    }

    public void setListProyectos(List<Proyectos> listProyectos) {
        this.listProyectos = listProyectos;
    }

    public List<Habilidades> getListHabilidades() {
        return listHabilidades;
    }

    public void setListHabilidades(List<Habilidades> listHabilidades) {
        this.listHabilidades = listHabilidades;
    }
        
        
    // toString

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre +
                ", apellido=" + apellido + ", profesion=" + profesion +
                ", correo=" + correo + ", telefono=" + telefono +
                ", url_foto=" + url_foto + ", fehcaNac=" + fehcaNac +
                ", acerca_De=" + acerca_De + ", listDomicilio=" + listDomicilio +
                ", listEducacion=" + listEducacion + ", listExperiencia_laboral=" + listExperiencia_laboral +
                ", Usuarios=" + Usuarios + ", listProyectos=" + listProyectos +
                ", listHabilidades=" + listHabilidades + '}';
    }
    
    
    //declarar metodos
    public void mostrar() {
        System.out.println("Mostrando");
    }
    public void editar(){
        System.out.println("Editado");
    }
    public void eliminar(){
        System.out.println("Eliminado");
    }

    
}
    

