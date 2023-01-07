import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-theme-selection',
  templateUrl: './theme-selection.component.html',
  styleUrls: ['./theme-selection.component.css']
})
export class ThemeSelectionComponent implements OnInit {

  @Input()
  themeMode: string = "light"

  @Input()
  buttonName: string = "Light"

  @Input()
  backgroundColor: string = "dark"

  constructor() { }

  ngOnInit(): void {
  }

  buttonStyle(backgroundColor:string) {
    if (this.backgroundColor === backgroundColor) {
      this.themeMode = "light"
      this.buttonName = "Light"
      this.backgroundColor = "light"
    } else {
      this.themeMode = "dark"
      this.buttonName = "Dark"
      this.backgroundColor = "dark"
    }
    console.log(this.backgroundColor)
    console.log(this.themeMode)
    
  }

}
