import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AptitudesApiComponent } from './aptitudes-api.component';

describe('AptitudesApiComponent', () => {
  let component: AptitudesApiComponent;
  let fixture: ComponentFixture<AptitudesApiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AptitudesApiComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AptitudesApiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
