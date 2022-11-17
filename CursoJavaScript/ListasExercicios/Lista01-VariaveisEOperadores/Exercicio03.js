/*
3) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.

Código Condição de pagamento:
- À vista Débito, recebe 10% de desconto;
- À vista no Dinheiro ou PIX, recebe 15% de desconto;
- Em duas vezes (2x), preço normal de etiqueta sem juros;
- Acima de duas vezes, preço normal de etiqueta mais juros de 10%;
*/

let tipoPagamento = '2x'
let valorEtiqueta = 10
let valorAPagar = 0

if (tipoPagamento === 'Debito') {
    valorAPagar = valorEtiqueta - (valorEtiqueta * 0.10)
} else if (tipoPagamento === 'Dinheiro' || tipoPagamento === 'PIX') {
    valorAPagar = valorEtiqueta - (valorEtiqueta * 0.15)
} else if (tipoPagamento === '2x') {
    valorAPagar = valorEtiqueta
} else {
    valorAPagar = valorEtiqueta + (valorEtiqueta * 0.10)
}
console.log('Tipo pagamento: ' + tipoPagamento + ' - Valor: R$ ' + valorAPagar.toFixed(2))

