import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatTableModule } from '@angular/material/table';
import { MatMenuModule } from '@angular/material/menu';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { Jurisdiction, JurisdictionService } from '../jurisdiction.service';

@Component({
  selector: 'app-jurisdiction-table',
  standalone: true,
  imports: [
    CommonModule,
    MatTableModule,
    MatMenuModule,
    MatButtonModule,
    MatIconModule,
    MatToolbarModule
  ],
  templateUrl: './jurisdiction-table.component.html',
  styleUrls: ['./jurisdiction-table.component.css']
})
export class JurisdictionTableComponent implements OnInit {
  jurisdictions: Jurisdiction[] = [];
  displayedColumns: string[] = ['prefix', 'description', 'actions'];

  constructor(private jurisdictionService: JurisdictionService) { }

  ngOnInit(): void {
    this.jurisdictionService.getAll().subscribe(data => {
      this.jurisdictions = data;
    });
  }
}