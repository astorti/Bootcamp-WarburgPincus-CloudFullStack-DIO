// 3) Faça um programa que dado uma lista de nomes imprima os nomes que começem com a letra "V".

const nomes = ['Vinicius', 'André', 'Violeta', 'Valdir', 'Thais']
const nomeComecaComV = []

for (let i = 0; i < nomes.length; i++){
    let nome = nomes[i]
    for (let j = 0; j < 1; j++){
        if (nome[0] == 'V') {
            nomeComecaComV.push(nome)
        }
    }
}
console.log(nomeComecaComV)