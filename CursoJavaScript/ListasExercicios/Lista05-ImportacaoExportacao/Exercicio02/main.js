/*
    2) Faça um programa que receba a quantidade de números e seus respectivos valores. 
    Imprima o maior e o menor número deste conjunto.

    Exemplo:
        Entrada:
            4
            100
            150
            90
            200

        Saída:
            Maior número: 200
            Menor número: 90
*/

const { gets, print } = require('./Exercicio02');

const quantidadeListaNumeros = gets();
let maior = 0;
let menor = 99999999999;
for (let i = 0; i < quantidadeListaNumeros.length; i++) {
    const numeroLista = quantidadeListaNumeros[i];
    if (numeroLista > maior) {
        maior = numeroLista;
    }
    if (numeroLista < menor) {
        menor = numeroLista;
    }
}

print('Maior: ' + maior);
print('Menor: ' + menor)

