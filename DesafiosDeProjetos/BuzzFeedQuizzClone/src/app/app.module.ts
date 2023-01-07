import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ThemeSelectionComponent } from './component/theme-selection/theme-selection.component';
import { LogoComponent } from './component/logo/logo.component';
import { QuestionsComponent } from './component/questions/questions.component';
import { HomeComponent } from './pages/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    ThemeSelectionComponent,
    LogoComponent,
    QuestionsComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
