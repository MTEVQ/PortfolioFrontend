import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExperienciaApiComponent } from './experiencia-api.component';

describe('ExperienciaApiComponent', () => {
  let component: ExperienciaApiComponent;
  let fixture: ComponentFixture<ExperienciaApiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExperienciaApiComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExperienciaApiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
