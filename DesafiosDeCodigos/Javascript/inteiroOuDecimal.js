let tipoNumerico = ''
let valor = 0

//TODO: Descubra se o valor é inteiro ou decimal

function gets() {
    valor = (Math.round(Math.random() * 100) / 10)
    print(valor)
}

function print(informacao) {
    console.log(informacao)
}

gets()

if ((valor * 10) % 10 === 0) {
    tipoNumerico = "Inteiro"
}else{
    tipoNumerico = "Decimal"
}

print(tipoNumerico)