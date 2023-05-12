import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProyectosApiComponent } from './proyectos-api.component';

describe('ProyectosApiComponent', () => {
  let component: ProyectosApiComponent;
  let fixture: ComponentFixture<ProyectosApiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProyectosApiComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProyectosApiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
