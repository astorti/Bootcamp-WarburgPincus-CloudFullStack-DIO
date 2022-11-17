// 4) Faça um programa que preencha uma lista com todos os números pares contidos no intervalo de 10 a 50;

const inicio = 10;
const fim = 50;

const pares = [];

for (let i = inicio; i <= fim; i++){
    if (i % 2 === 0) {
        pares.push(i);
    }
}

console.log(pares);