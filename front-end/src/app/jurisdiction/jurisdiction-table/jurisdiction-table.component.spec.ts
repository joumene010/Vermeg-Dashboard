import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JurisdictionTableComponent } from './jurisdiction-table.component';

describe('JurisdictionTableComponent', () => {
  let component: JurisdictionTableComponent;
  let fixture: ComponentFixture<JurisdictionTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [JurisdictionTableComponent]
    })
      .compileComponents();

    fixture = TestBed.createComponent(JurisdictionTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
