import { Component, OnInit } from '@angular/core';
import { PorfolioService } from 'src/app/servicios/porfolio.service';

@Component({
  selector: 'app-experiencia-api',
  templateUrl: './experiencia-api.component.html',
  styleUrls: ['./experiencia-api.component.css']
})
export class ExperienciaApiComponent implements OnInit{
  
  experienciaList:any;
  constructor(private datosPorfolio:PorfolioService) { }

  ngOnInit(): void {
    this.datosPorfolio.listarExpApi().subscribe(data =>{
      this.experienciaList=data;
    })
  
  }

}
