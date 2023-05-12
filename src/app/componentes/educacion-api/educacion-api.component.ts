import { Component, OnInit } from '@angular/core';
import { PorfolioService } from '../../servicios/porfolio.service';

@Component({
  selector: 'app-educacion-api',
  templateUrl: './educacion-api.component.html',
  styleUrls: ['./educacion-api.component.css']
})
export class EducacionApiComponent implements OnInit{

  educacionList:any;
  constructor(private datosPorfolio:PorfolioService) { }

  ngOnInit(): void {
    this.datosPorfolio.listarEduApi().subscribe(data =>{
      this.educacionList=data;
    })
  
  }

}