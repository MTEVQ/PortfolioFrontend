<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos de la Persona</h1>
        <form action="SvPersona" method="POST">
          
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Apellido: </label> <input type="text" name= "apellido"></p>
            <p><label>Profesion: </label> <input type="text" name= "profesion"></p>    
            <p><label>Correo: </label> <input type="text" name="correo"></p>
            <p><label>Telefono: </label> <input type="text" name="telefono"></p>
            <p><label>Foto: </label> <input type="text" name= "foto"></p>
            <p><label>Fecha de nacimiento: </label> <input type="text" name= "fechaNac"></p>
            <p><label>Acerca de mi: </label> <input type="text" name= "acerca_De"></p><button type="submit" >Enviar</button>
        </form>

        <h1>Ver lista de Personas</h1>
        <p>Si desea ver todas las personas haga click en el botón mostrar personas</p>
        <fors action=" " method="">
            <button type="submit" >Mostrar Personas</button>
        </form>
        
         <h1> Eliminar Personas</h1>
         <p>Ingrese el Correo de la persona a eliminar</p>
         <form action=" " method=" ">
             <p><label>Correo: </label> <input type="text" name="correo elim"></p>
            <button type="submit">Eliminar</button>
         </form>

    </body>
</html>
