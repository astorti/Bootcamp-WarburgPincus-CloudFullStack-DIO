let vetor = []
let pares = []
let impares = []
let numero = 0
let maximo = 100

//TODO: Implemente uma condição para o armazenamento dos números PARES e ÍMPARES:
for (let i = 0; i < 5; i++) {
    get()
}

for (let i = 0; i < 5; i++){
    if (vetor[i] % 2 === 0){
    pares.push(vetor[i])
    }
    else{
    impares.push(vetor[i])
    }
}

function get() {
    numero = Math.floor(Math.random() * maximo)
    vetor.push(numero)
}

function print(vetor) {
    console.log(vetor)
}

//TODO: Imprima os valores dos três vetores um em cada linha:
print(`Vetor: ${vetor}`)
print(`Par(es): ${pares}`)
print(`Impar(es): ${impares}`)
