import { Component, OnInit } from '@angular/core';
import quizz_questions from "../../../assets/data/quizz_questions.json";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  currentTheme: string = "dark"
  currentQuizzQuestion: string = "quizz__container__dark"
  currentThemeMode: string = "light"
  currentButtonName: string = "Light"
  currentBackgroundColor: string = "dark"
  currentTitle: string = "assets/imgs/logo.png"
  backgroundColorBody: string = "dark" 

  currentQuestion: string = ""

  questions: any
  currentQuestionSelected: any
  answers: string[] = []
  //answerSelected: string = ""
  questionIndex: number = 0
  questionMaxIndex: number = 0
  finished: boolean = false
  
  currentButtonOptionTheme: string = "btn-option_dark"

  currentQuizzResultTheme: string = "quizz_results_dark"

  
  constructor() { }

  ngOnInit(): void {
    if (quizz_questions) {
      this.finished = false
      this.currentQuestion = quizz_questions.title
      
      this.questions = quizz_questions.questions
      this.currentQuestionSelected = this.questions[this.questionIndex]

      this.questionIndex = 0
      this.questionMaxIndex = this.questions.length
    }
  }
  
  changeBackgroundBody() {
    if (this.backgroundColorBody === "dark") {
      this.backgroundColorBody = "light"
      this.currentBackgroundColor = "light"
      this.currentButtonName = "Dark"
      this.currentThemeMode = "dark"
      this.currentTitle = "assets/imgs/logoDark.png"
      this.currentTheme = "light"
      this.currentQuizzQuestion = "quizz__container__light"
      this.currentButtonOptionTheme = "btn-option_light"
      this.currentQuizzResultTheme = "quizz_results_light"

    } else {
      this.backgroundColorBody = "dark"
      this.currentBackgroundColor = "dark"
      this.currentButtonName = "Light"
      this.currentThemeMode = "light"
      this.currentTitle = "assets/imgs/logo.png"
      this.currentTheme = "dark"
      this.currentQuizzQuestion = "quizz__container__dark"
      this.currentButtonOptionTheme = "btn-option_dark"
      this.currentQuizzResultTheme = "quizz_results_dark"
    }
  }

}
