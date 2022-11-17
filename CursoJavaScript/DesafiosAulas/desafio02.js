/*

Faça um programa para calcular o valor de uma viagem.

Você terá 5 variáveis. Sendo elas:
    1 - Preço do etanol;
    2 - Preço do gasolina;
    3 - O tipo de combustível que está no seu carro;
    4 - Gasto médio de combustível do carro por KM;
    5 - Distância em KM da viagem;

Imprima no console o valor que será gasto para realizar esta viagem.
*/

let precoEtanol = 3.60;
let precoGasolina = 4.50;
let tipoCombustivel = 'Gasolina';
const consumoMedioGasolina = 15;
let distanciaPercorrida = 100;

let valor = 0;
if (tipoCombustivel === 'Etanol') {
    valor = (distanciaPercorrida / consumoMedioGasolina) * precoEtanol;
} else if (tipoCombustivel === 'Gasolina') {
    valor = (distanciaPercorrida / consumoMedioGasolina) * precoGasolina;
} else {
    console.log("Tipo de combustível inválido")
}

console.log("Valor = R$ " + valor.toFixed(2) + ' - Combustível: ' + tipoCombustivel);