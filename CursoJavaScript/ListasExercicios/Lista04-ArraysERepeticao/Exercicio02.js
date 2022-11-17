// 2) Crie um programa que seja capaz de percorrer uma lista de números e imprima cada número Par encontrado.

const numeros = [2, 5, 53, 47, 74, 82, 66, 34, 23, 27];

for (let i = 0; i <= numeros.length; i++) {
    if (numeros[i] % 2 == 0) {
        console.log(numeros[i])
    }
}