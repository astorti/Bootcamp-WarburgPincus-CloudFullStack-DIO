import { Component, Input, OnInit } from '@angular/core';
import quizz_questions from "../../../assets/data/quizz_questions.json";

@Component({
  selector: 'app-questions',
  templateUrl: './questions.component.html',
  styleUrls: ['./questions.component.css']
})
export class QuestionsComponent implements OnInit {

  @Input()
  quizzQuestion: string = "dark"
  @Input()
  theme: string = "dark"
  @Input()
  question: string = quizz_questions.title

  @Input()
  questions: any
  @Input()
  questionSelected: any = ""
  @Input()
  answers: string[] = []
  answerSelected: string = ""
  @Input()
  questionIndex: number = 0
  @Input()
  questionMaxIndex: number = 0
  finished: boolean = false

  @Input()
  buttonOptionsTheme: string = "btn-option_dark"

  @Input()
  quizzResultTheme: string = "quizz_results_dark"

  constructor() { }

  ngOnInit(): void {
  }

  playerChoice(value: string) {
    this.answers.push(value)
    this.nextStep()
  }

  async nextStep() {
    this.questionIndex += 1

    if (this.questionMaxIndex > this.questionIndex) {
      this.questionSelected = this.questions[this.questionIndex]
    } else {
      const finalAnswer:string = await this.checkResult(this.answers)
      this.finished = true
      this.answerSelected = quizz_questions.results[finalAnswer as keyof
      typeof quizz_questions.results]
    }
  }

  async checkResult(answers: string[]) {
    const result = answers.reduce((previous, current, i, arr) => {
      if (
        arr.filter(item => item === previous).length > 
        arr.filter(item => item === current).length
      ) {
        return previous
      } else {
        return current
      }
    })
    console.log(result)
    return result
  }

  newGame() {
    window.location.reload()
  }

}