
/*
Faça um programa para calcular o valor de uma viagem.

Você terá 3 variáveis. Sendo elas:
    1 - Preço do combustível;
    2 - Gasto médio de combustível do carro por KM;
    3 - Distância em KM da viagem;

Imprima no console o valor que será gasto para realizar esta viagem.
*/

let preco = 4.50;
const consumoMedioGasolina = 15;
let distanciaPercorrida = 100;

let valor = (distanciaPercorrida / consumoMedioGasolina) * preco;
console.log("Valor = R$ " + valor.toFixed(2));