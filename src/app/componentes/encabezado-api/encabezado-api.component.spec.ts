import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EncabezadoApiComponent } from './encabezado-api.component';

describe('EncabezadoApiComponent', () => {
  let component: EncabezadoApiComponent;
  let fixture: ComponentFixture<EncabezadoApiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EncabezadoApiComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EncabezadoApiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
