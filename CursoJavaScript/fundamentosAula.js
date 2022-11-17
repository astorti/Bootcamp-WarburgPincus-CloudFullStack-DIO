// AULA: VARIAVEIS E OPERADORES

let variavel = 10;
console.log(variavel);

variavel = 20;
console.log(variavel);

console.log("SOMA");
variavel = 20 + 10;
console.log(variavel);
console.log("SUBTRAÇÃO");
variavel = 20 - 10;
console.log(variavel);
console.log("MULTIPLICAÇÃO");
variavel = 20 * 10;
console.log(variavel);
console.log("DIVISÃO");
variavel = 20 / 10;
console.log(variavel);

// AULA: ESTRUTURAS CONDICIONAIS

const numero = 20;
const numeroPar = numero % 2 === 0;

if (numeroPar) {
    console.log('Par');
} else {
    console.log('Impar');
}

const numeroDivisivelPorCinco = numero % 5 === 0;

if (numero === 0) {
    console.log("O numero é invalido.")
} else if (numeroDivisivelPorCinco) {
    console.log('Sim');
} else {
    console.log('Não');
}

// AULA: O PODER DAS FUNÇÕES NA QUALIDADE DO SEU CODIGO
console.log('----------------')
console.log('FUNÇÕES');

function teste() {
    console.log('teste');
}

function sayMyName(name) {
    console.log('Your name is: ' + name);
}

function quadrado(valor) {
    return valor * valor;
}

function incrementarJuros(valor, percentualJuros) {
    const valorDeAcrescimo = (percentualJuros / 100) * valor;
    return valor + valorDeAcrescimo;
}

(function () {
    teste();
    sayMyName('André');
    const quadradeDeDez = quadrado(10) + quadrado(10);
    console.log(quadradeDeDez)
    console.log(incrementarJuros(100, 10));
})();


// AULA: CRIANDO OBJETOS E CLASSES EM JAVASCRIPT
console.log('----------------')
console.log('OBJETOS E CLASSES');

const autor = {
    nome: 'Alexandre',
    sobrenome: 'Dumas',

    descrever: function () {
        console.log(`Meu nome é ${this.nome} ${this.sobrenome}`)
    }
};

autor.descrever();

const atributo = 'nome';
console.log(autor[atributo])
console.log(autor['sobrenome'])


class Pessoa {
    nome;
    idade;
    anoDeNascimento;

    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
        this.anoDeNascimento = 2022 - idade
    }
    
    descrever() {
        console.log(`Meu nome é ${this.nome} e minha idade é ${this.idade}`)
    }
}

const asimov = new Pessoa('Isaac Asimov', 70);
console.log(asimov)
asimov.descrever()
console.log(asimov.anoDeNascimento)

console.log('------');
function compararPessoas(p1, p2) {
    if (p1.idade > p2.idade) {
        console.log(`${p1.nome} é mais velho que ${p2.nome}`);
    } else if (p2.idade > p1.idade) {
        console.log(`${p2.nome} é mais velho que ${p1.nome}`);
    } else {
        console.log(`${p1.nome} e ${p2.nome} tem a mesma idade`)
    }
}

const pessoa1 = new Pessoa('André', 40);
const pessoa2 = new Pessoa('João', 44);
compararPessoas(pessoa1, pessoa2)

//AULA: ARRAYS E ESTRUTURAS DE REPETIÇÃO EM JAVASCRIPT
console.log('----------------')
console.log('ARRAYS');

const alunos = ['João', 'Vitor', 'Marina'];
console.log(alunos)
console.log(alunos[0]);
console.log(alunos[1]);
console.log(alunos[2]);

alunos.push('André');
console.log(alunos[3]);
console.log(alunos)

alunos[4] = 'Vinicius';
console.log(alunos);

console.log(alunos.pop());
console.log(alunos.shift());
console.log(alunos);

console.log('---');

const notas = [];
notas.push(5);
notas.push(5);
notas.push(10);
notas.push(5);
notas.push(5);
console.log(notas);
console.log(notas.length);

let soma = 0
for (let i = 0; i < notas.length; i++) {
    soma += notas[i];
}
let media = soma / notas.length;
console.log(`Média notas: ${media}`);

const nome = 'Alexandre Dumas'
for (let i = 0; i < nome.length; i++) {
    console.log(nome[i]);
}


//AULA: IMPORTAÇÃO E EXPORTAÇÃO COM JAVASCRIPT
console.log('---------------------------------------')
console.log('IMPORTAÇÃO E EXPORTAÇÃO COM JAVASCRIPT');

function gets() {
    return 10;
}

function print(texto) {
    console.log(texto)
}

module.exports = { gets, print };