package proyectofinal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProyectoFinal {

    public static void main(String[] args) {
      
     Persona p1 = new Persona();
     p1.setId(1);
     p1.setNombre("Tatiana");
     p1.setApellido("Velasquez");
     p1.setProfesion("Estudiante Universitaria");
     p1.setCorreo("tative23992@gmail.com");
     p1.setTelefono("3875283494");
     p1.setUrl_foto("https://mtevq.github.io/Codigo-Fuente-del-Proyecto-Final-Frontend-est-tico/images/perfil.png");
     p1.setFehcaNac(new Date("19/02/2023"));
     p1.setAcerca_De("Estudiante, modelo y animadora de fiestas");
     
     List<Domicilio> listDomicilio = new ArrayList<Domicilio>();
     Domicilio d1 = new Domicilio(1, "Junin", 756, "", "", "Salta", "Salta", "Argentina", 4400);
     Domicilio d2 = new Domicilio(2, "Ibazeta", 8364, "4", "D", "Metan", "Salta", "Argentina", 4400);
     listDomicilio.add(d1);
     listDomicilio.add(d2);
     p1.setListDomicilio(listDomicilio);
     
     List<Educacion> listEducacion = new ArrayList<Educacion>();
     Educacion e1 = new Educacion(1, "UNSa","Licenciatura en Administracion de Empresas", new Date("20/02/2017"), new Date("28/03/2023"), "https://mtevq.github.io/Codigo-Fuente-del-Proyecto-Final-Frontend-est-tico/images/UNSa.png");
     Educacion e2 = new Educacion(2, "Catolica", "Tecnicatura en Recursos Humanos", new Date("18/03/2019"),new Date("08/12/2021"),"data:image/png;base64,i");
     listEducacion.add(e1);
     listEducacion.add(e2);
     p1.setListEducacion(listEducacion);
     
     List<Experiencia_laboral> listExperiencia_laboral = new ArrayList<Experiencia_laboral>();
     Experiencia_laboral el1 = new Experiencia_laboral(1, "Tutora", "Python", "Jornada Parcial", false, new Date("17/08/2022"), new Date("30/12/2022"), "Salta y departamentos de la provincia - Argentina", "https://mtevq.github.io/Codigo-Fuente-del-Proyecto-Final-Frontend-est-tico/images/milProgPython.png", 1, "Monotributista");
     listExperiencia_laboral.add(el1);
     p1.setListExperiencia_laboral(listExperiencia_laboral);
     
     Usuarios u1 = new Usuarios(1, "tative23992@gmail.com", "asdfqwer12");
     p1.setUsuarios(u1);
     
     List<Proyectos> listProyectos = new ArrayList<Proyectos>();
     Proyectos pr1 = new Proyectos(1, "Cinemar", "Desarrollo de un proyecto con las bases introductorias de Java");
     listProyectos.add(pr1);
     p1.setListProyectos(listProyectos);
    
     List<Habilidades> listHabilidades = new ArrayList<Habilidades>();
     Habilidades h1 = new Habilidades(1, "Resolución de problemas", 95);
     listHabilidades.add(h1);
     p1.setListHabilidades(listHabilidades);
     
    System.out.println(p1.getApellido()+ " es " + p1.getProfesion() + " y nacio en: " + p1.getFehcaNac());

    System.out.println("---------------");
    
    System.out.println("La persona : " + p1.getApellido() + ", " + p1.getNombre() + ". Reside en la calle " + p1.getListDomicilio().toString());
    
    System.out.println("---------------");

    System.out.println("La persona : " + p1.getApellido() + ", " + p1.getNombre() + ". Estudia la carrera de: " + p1.getListEducacion().toString());
    
    System.out.println("---------------");
    
     Persona p2 = new Persona();
     p2.setId(1);
     p2.setNombre("Jorge");
     p2.setApellido("Ruiz");
     p2.setProfesion("Ingeniero");
     p2.setCorreo("jorge@gmail.com");
     p2.setTelefono("175638954");
     p2.setUrl_foto("https://img.freepik.com/fotos-premium/chico-adolescente-atractivo-parque_58409-13244.jpg?w=360");
     p2.setFehcaNac(new Date("1995/10/05"));
     p2.setAcerca_De("Ingeniero recien recibido con honores");
   
 
    Persona vector[] = new Persona [2];
      vector[0] = p1;
      vector[1] = p2;
      
    for(int i=0; i<2; i++) {
        System.out.println("Registro N° " + i + " " + vector[i].getApellido());
    }
    
    System.out.println("---------------");        

    System.out.println(p2.getApellido() + " cuyo correo es: " + p2.getCorreo() + " posee buenas aptitudes.");

    System.out.println("---------------");        

    System.out.println(p1.toString());

    System.out.println("----------------");

    System.out.println("El valor del id es: " + p1.getId());

    System.out.println("--------------");

    p1.setId(0);

    System.out.println("El nuevo valor del id es: " + p1.getId());    
      
    }
}
