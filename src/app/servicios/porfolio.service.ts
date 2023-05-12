import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PorfolioService {

  constructor(private http:HttpClient ) { }

  obtenerDatos():Observable<any>{
    return this.http.get('./assets/data/data.json');
  }

  obtenerPersonaApi():Observable<any>{

   let datos= this.http.get("http://localhost:8080/getPersona/2")
   //console.log(datos)
  return datos;
 }

  listarEduApi():Observable<any>{

    let datos= this.http.get("http://localhost:8080/listarEducacion")
    console.log(datos)
  return datos;
  }

  listarAptiApi():Observable<any>{

    let datos= this.http.get("http://localhost:8080/listarHabilidades")
    //console.log(datos)
   return datos;
  }

  listarExpApi():Observable<any>{

    let datos= this.http.get("http://localhost:8080/listarExperiencia_laboral")
    //console.log(datos)
   return datos;
  }

  listarProyApi():Observable<any>{

    let datos= this.http.get("http://localhost:8080/listarProyectos")
    //console.log(datos)
   return datos;
  }
}
