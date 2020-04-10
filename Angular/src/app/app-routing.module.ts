import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { FormOneComponent } from './form-one/form-one.component';
import { FormTwoComponent } from './form-two/form-two.component';


const routes: Routes = [
  { path:'', component:FormOneComponent},
  { path:'two', component:FormTwoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
