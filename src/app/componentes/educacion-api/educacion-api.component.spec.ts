import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EducacionApiComponent } from './educacion-api.component';

describe('EducacionApiComponent', () => {
  let component: EducacionApiComponent;
  let fixture: ComponentFixture<EducacionApiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EducacionApiComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EducacionApiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
