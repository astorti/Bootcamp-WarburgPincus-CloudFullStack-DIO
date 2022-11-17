/*
    3) Faça um programa que receba a quantidade de números e seus respectivos valores.
    Imprima todos os números pares.
        Exemplo:
            Entrada:
                5
                1
                3
                9
                10
                12

            Saída:
                Números Pares: 10, 12
*/

const { gets, print } = require('./Exercicio03');

valor = gets();

for (let i = 0; i < valor.length; i++) {
    const resto = valor[i] % 2;
    if (resto === 0) {
        print(valor[i]);
    }   
}