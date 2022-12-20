import { Component, Input } from '@angular/core'

@Component({
  selector: 'my-menu',
  template: `<h2>Menu</h2>`,
  styles: [`h2 {color: blue;}`]
})

export class MenuComponent {
  @Input()
  name: 'string' = "string"
}