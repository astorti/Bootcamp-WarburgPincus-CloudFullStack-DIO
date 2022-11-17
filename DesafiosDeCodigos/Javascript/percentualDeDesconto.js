let M, S

M = parseInt(gets())
S = parseInt(gets())

//TODO: Retorne o percentual de desconto que foi aplicado no produto

function gets() {
    return Math.floor(Math.random() * 1000)
}

function print() {
    console.log(M, S)
    console.log(parseInt(desconto) + '%')
}

while (S >= M) {
    S = parseInt(gets())
}

let desconto = 100 - ((S * 100) / M)
print()
