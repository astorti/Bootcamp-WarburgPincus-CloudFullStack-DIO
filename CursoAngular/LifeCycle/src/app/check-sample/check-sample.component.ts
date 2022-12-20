import {
  Component,
  OnInit,
  DoCheck,
  AfterContentChecked,
  AfterContentInit,
  AfterViewChecked,
  AfterViewInit, 
  OnDestroy
} from '@angular/core';

@Component({
  selector: 'app-check-sample',
  templateUrl: './check-sample.component.html',
  styleUrls: ['./check-sample.component.css']
})
export class CheckSampleComponent implements
  OnInit,
  DoCheck,
  AfterContentChecked,
  AfterContentInit,
  AfterViewChecked,
  AfterViewInit,
  OnDestroy
{

  quantidade: number = 0

  
  adicionar() {
    this.quantidade += 1
  }
  
  decrementar() {
    this.quantidade -= 1
  }
  
  // ORDEM DOS EVENTOS:
  // checked --> content --> view
  
  // Depois da inicialização da view
  ngAfterViewInit(): void {
    console.log('ngAfterViewInit');
  }

  // Após alguma alteração, verifica a view
  ngAfterViewChecked(): void {
    console.log('ngAfterViewChecked');
  }

  // Quando o primeiro evento é iniciado
  ngAfterContentInit(): void {
    console.log('ngAfterContentInit');
  }
  
  // Após alguma alteração, verifica o conteudo
  ngAfterContentChecked(): void {
    console.log('ngAfterContentChecked');
  }
  ngDoCheck(): void {
    console.log('ngDoCheck');
  }
  
  ngOnInit(): void {
    console.log("-------------------");
    console.log('ngOnInit');
  }
  
  constructor() { }
  ngOnDestroy(): void {
    console.log('Goodbye');
  }
}
