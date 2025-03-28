import { Routes } from '@angular/router';
import { JurisdictionTableComponent } from './jurisdiction/jurisdiction-table/jurisdiction-table.component';

export const routes: Routes = [
    { path: 'jurisdictions', component: JurisdictionTableComponent },
    { path: '', redirectTo: '/jurisdictions', pathMatch: 'full' }
];