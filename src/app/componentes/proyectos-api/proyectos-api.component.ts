import { Component, OnInit } from '@angular/core';
import { PorfolioService } from 'src/app/servicios/porfolio.service';

@Component({
  selector: 'app-proyectos-api',
  templateUrl: './proyectos-api.component.html',
  styleUrls: ['./proyectos-api.component.css']
})
export class ProyectosApiComponent implements OnInit{
  proyectosList:any;
  constructor(private datosPorfolio:PorfolioService) { }

  ngOnInit(): void {
    this.datosPorfolio.listarProyApi().subscribe(data =>{
      this.proyectosList=data;
    })
  
  }


}
