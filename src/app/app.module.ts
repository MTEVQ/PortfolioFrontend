import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EncabezadoComponent } from './componentes/encabezado/encabezado.component';
import { CabeceraComponent } from './componentes/cabecera/cabecera.component';
import { AcercaDeComponent } from './componentes/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import { HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AptitudesComponent } from './componentes/aptitudes/aptitudes.component';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';
import { EducacionApiComponent } from './componentes/educacion-api/educacion-api.component';
import { EncabezadoApiComponent } from './componentes/encabezado-api/encabezado-api.component';
import { AcercaDeApiComponent } from './componentes/acerca-de-api/acerca-de-api.component';
import { ExperienciaApiComponent } from './componentes/experiencia-api/experiencia-api.component';
import { AptitudesApiComponent } from './componentes/aptitudes-api/aptitudes-api.component';
import { ProyectosApiComponent } from './componentes/proyectos-api/proyectos-api.component';

@NgModule({
  declarations: [
    AppComponent,
    EncabezadoComponent,
    CabeceraComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent,
    AptitudesComponent,
    ProyectosComponent,
    EducacionApiComponent,
    EncabezadoApiComponent,
    AcercaDeApiComponent,
    ExperienciaApiComponent,
    AptitudesApiComponent,
    ProyectosApiComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
