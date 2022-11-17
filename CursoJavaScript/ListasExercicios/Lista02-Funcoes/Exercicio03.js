/*
3) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.

Código Condição de pagamento:
- À vista Débito, recebe 10% de desconto;
- À vista no Dinheiro ou PIX, recebe 15% de desconto;
- Em duas vezes (2x), preço normal de etiqueta sem juros;
- Acima de duas vezes, preço normal de etiqueta mais juros de 10%;
*/

let tipoPagamento = 'Debito'
let valorEtiqueta = 100
let valorAPagar = 0

function formaPagamento(tipo) {
    if (tipo === 'Debito') {
        return valorEtiqueta * 0.10
    } else if (tipo === 'Dinheiro' || tipo === 'PIX') {
        return valorEtiqueta * 0.15
    } else if (tipo === '2x') {
        return 0
    } else {
        return -valorEtiqueta * 0.10
    }
}

(function () {
    let desconto = formaPagamento(tipoPagamento)
    valorAPagar = valorEtiqueta - desconto
    console.log(valorAPagar)
})()


