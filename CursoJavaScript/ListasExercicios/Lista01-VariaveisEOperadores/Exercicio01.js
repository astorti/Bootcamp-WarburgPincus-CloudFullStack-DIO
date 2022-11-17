/*
1) Faça um algorítimo que dado as 3 notas tiradas por um aluno em um semestre da faculdade calcule e imprima a sua média e a sua classificação conforme a tabela abaixo.

Média = (nota 1 + nota 2 + nota 3) / 3;

Classificação:
- Média menor que 5, reprovação;
- Média entre 5 e 7, recuperação;
- Média acima de 7, passou de semestre;
*/

let nota1 = 9;
let nota2 = 7;
let nota3 = 6;

let media = (nota1 + nota2 + nota3) / 3;
let situacaoEscolar = ''
if (media < 5) {
    situacaoEscolar = 'Reprovado'  
} else if (media < 7) {
    situacaoEscolar = 'Recuperação'
} else {
    situacaoEscolar = 'Passou de semestre'
}

console.log('Média: ' + media.toFixed(2) + ' - ' + situacaoEscolar)
