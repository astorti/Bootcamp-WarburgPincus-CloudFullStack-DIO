// Fazer uma função que verifique idade

function verificarIdade(idade) {
    if (idade >= 18) {
        return 'Maior de idade'
    } else {
        return 'Menor de idade'
    }
}

(function () {
    console.log(verificarIdade(18))
})()