import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AcercaDeApiComponent } from './acerca-de-api.component';

describe('AcercaDeApiComponent', () => {
  let component: AcercaDeApiComponent;
  let fixture: ComponentFixture<AcercaDeApiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AcercaDeApiComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AcercaDeApiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
