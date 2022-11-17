/*
1) Crie uma classe para representar carros. 
Os carros possuem uma marca, uma cor e um gasto médio de combustível por Kilômetro rodado.
Crie um método que dado a quantidade de quilómetros e o preço do combustível nos dê o valor 
gasto em reais para realizar este percurso.
*/

class Carro {
    marca;
    cor;
    gastoMedio;

    constructor(marca, cor, gastoMedio) {
        this.marca = marca;
        this.cor = cor;
        this.gastoMedio = gastoMedio;
    }

    custoPercurso(quilometros, precoCombustivel) {
        return quilometros * this.gastoMedio * precoCombustivel;
    }

    imprimeCusto(custo) {
        return console.log(`O valor para realizar o percurso é de R$ ${custo.toFixed(2)}`);
    }
}

const carro = new Carro('Fiat', 'Azul', 1/12);
const custo = carro.custoPercurso(70, 5);
carro.imprimeCusto(custo)
console.log(carro)
