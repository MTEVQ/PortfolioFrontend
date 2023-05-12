import { Component, OnInit } from '@angular/core';
import { PorfolioService } from 'src/app/servicios/porfolio.service';

@Component({
  selector: 'app-acerca-de-api',
  templateUrl: './acerca-de-api.component.html',
  styleUrls: ['./acerca-de-api.component.css']
})
export class AcercaDeApiComponent implements OnInit{

  miPorfolio:any;
    constructor(private datosPorfolio:PorfolioService) { } 
  
    ngOnInit(): void {
      this.datosPorfolio.obtenerPersonaApi().subscribe(data =>{
       // console.log(data);
        this.miPorfolio=data;
      });
    }
  

  //acercaDe:string ='Estudiante, modelo y animadora de fiestas';
 

}
