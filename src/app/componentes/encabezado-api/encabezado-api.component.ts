import { Component, OnInit } from '@angular/core';
import { PorfolioService } from 'src/app/servicios/porfolio.service';

@Component({
  selector: 'app-encabezado-api',
  templateUrl: './encabezado-api.component.html',
  styleUrls: ['./encabezado-api.component.css']
})
export class EncabezadoApiComponent implements OnInit{
    miPorfolio:any;
    constructor(private datosPorfolio:PorfolioService) { } 
  
    ngOnInit(): void {
      this.datosPorfolio.obtenerPersonaApi().subscribe(data =>{
       // console.log(data);
        this.miPorfolio=data;
      });
    }
}