import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu.component';
import { ButtonComponent } from './button.component';
import { EntryDataComponent } from './entry-data.component';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    ButtonComponent,
    EntryDataComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
