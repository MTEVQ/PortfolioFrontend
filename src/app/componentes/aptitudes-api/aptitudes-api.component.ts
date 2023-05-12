import { Component, OnInit } from '@angular/core';
import { PorfolioService } from 'src/app/servicios/porfolio.service';

@Component({
  selector: 'app-aptitudes-api',
  templateUrl: './aptitudes-api.component.html',
  styleUrls: ['./aptitudes-api.component.css']
})
export class AptitudesApiComponent implements OnInit {

  aptitudesList:any;
  constructor(private datosPorfolio:PorfolioService) { }

  ngOnInit(): void {
    this.datosPorfolio.listarAptiApi().subscribe(data =>{
      this.aptitudesList=data;
    })
  
  }
}
