/*
2) O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. 

Formula do IMC:
IMC = peso / (altura * altura)

Elabore um algoritmo que dado o peso e a altura de um adulto mostre sua condição de acordo com a tabela abaixo.

IMC em adultos Condição:
- Abaixo de 18.5 Abaixo do peso;
- Entre 18.5 e 25 Peso normal;
- Entre 25 e 30 Acima do peso;
- Entre 30 e 40 Obeso;
- Acima de 40 Obsesidade Grave;
*/

let peso = 73
let altura = 1.67
let calculoImc = peso / (altura * altura);
let imc = ''

if (calculoImc < 18.5) {
    imc = 'Abaixo do peso'
} else if (calculoImc < 25) {
    imc = 'Peso normal'
} else if (calculoImc < 30) {
    imc = 'Acima do peso'
} else if (calculoImc < 40) {
    imc = 'Obeso'
} else {
    imc = 'Obersidade grave'
}
 console.log('IMC = ' + calculoImc.toFixed(1) + ' - ' + imc)