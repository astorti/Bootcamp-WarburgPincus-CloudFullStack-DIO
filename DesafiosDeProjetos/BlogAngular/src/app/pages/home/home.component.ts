import { Component, OnInit } from '@angular/core';
import { dataFake } from 'src/app/Data/dataFake';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: [
    './home.component.css',
    './home.responsive.component.css'
  ]
})
export class HomeComponent implements OnInit {
  photoCover1: string = ""
  contentTitle1: string = ""
  cardDescrition1: string | undefined = ""
  private id1: string | null = "1"

  photoCover2: string = ""
  contentTitle2: string = ""
  private id2: string | null = "2"

  photoCover3: string = ""
  contentTitle3: string = ""
  private id3: string | null = "3"

  photoCover4: string = ""
  contentTitle4: string = ""
  private id4: string | null = "4"


  constructor() { }

  ngOnInit(): void {
    this.setValuesComponents(this.id1, this.id2, this.id3, this.id4)
    }

  setValuesComponents(id1: string | null, id2: string | null, id3: string | null, id4: string | null) {
    const result1 = dataFake.filter(article => article.id == id1)[0]
    const result2 = dataFake.filter(article => article.id == id2)[0]
    const result3 = dataFake.filter(article => article.id == id3)[0]
    const result4 = dataFake.filter(article => article.id == id4)[0]
    
    this.photoCover1 = result1.photo
    this.contentTitle1 = result1.title
    this.cardDescrition1 = result1.cardDescription

    this.photoCover2 = result2.photo
    this.contentTitle2 = result2.title

    this.photoCover3 = result3.photo
    this.contentTitle3 = result3.title

    this.photoCover4 = result4.photo
    this.contentTitle4 = result4.title
  }
}
