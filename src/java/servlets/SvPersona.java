package servlets;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.Persona;

@WebServlet(name = "SvPersona", urlPatterns = {"/SvPersona"})
public class SvPersona extends HttpServlet {
    
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        }
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
       String nombre = request.getParameter("nombre");
       String apellido = request.getParameter("apellido");
       String profesion = request.getParameter("profesion");
       String correo = request.getParameter("correo");
       String telefono = request.getParameter("telefono");
       String foto = request.getParameter("foto");
       String fechaNac = request.getParameter("fechaNac");
       String acerca_De = request.getParameter("acerca_De");

       Persona pers = new Persona (0, nombre, apellido, profesion, correo, telefono, foto, new Date(fechaNac),
               acerca_De);     
       
       control.crearPersona(pers);
       
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
