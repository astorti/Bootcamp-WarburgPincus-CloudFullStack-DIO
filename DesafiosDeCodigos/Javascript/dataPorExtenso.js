// TODO: faça um programa que retorne a data da entrada com o mês por extenso;

let data = '17/11/2022'
let dataSplit = data.split('/')
let mes = ''
let mesNumerico = 0
let meses = {
    1: 'Janeiro',
    2: 'Fevereiro',
    3: 'Março',
    4: 'Abril',
    5: 'Maio',
    6: 'Junho',
    7: 'Julho',
    8: 'Agosto',
    9: 'Setembro',
    10: 'Outubro',
    11: 'Novembro',
    12: 'Dezembro'
}

function print() {
    console.log(`${dataSplit[0]} de ${mes} de ${dataSplit[2]}`)
}

for (let i in meses) {
    if (i < 10) {
        mesNumerico = '0' + i
    } else {
        mesNumerico = i
    }
    
    if (mesNumerico === dataSplit[1]) {
        mes = meses[i]
    }
}

print()