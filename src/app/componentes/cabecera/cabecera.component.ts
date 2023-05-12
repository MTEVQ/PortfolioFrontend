import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cabecera',
  templateUrl: './cabecera.component.html',
  styleUrls: ['./cabecera.component.css']
})
export class CabeceraComponent implements OnInit {
  //declaro una variable string con el valor Tatiana Velasquez
  usuario: string = 'Tatiana Velasquez';

  usuarioValido: boolean = true;

  constructor(){ }

  ngOnInit(): void {
    
 }

}
