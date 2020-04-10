import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http';


import { FormOneComponent } from './form-one/form-one.component';
import { FormTwoComponent } from './form-two/form-two.component';

@NgModule({
  declarations: [
    AppComponent,
    FormOneComponent,
    FormTwoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
