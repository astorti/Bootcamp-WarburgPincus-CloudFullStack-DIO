let str = "Estamos no mes de novembro"
let strSplit = str.split('')
let espaco = 0
let vogal = 0
let vogais = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']

function print() {
    console.log(`Espacos em branco: ${espaco} Vogais: ${vogal}`)
}

for (let i in strSplit){
    if (strSplit[i] === ' '){
        espaco++
    }
    for (let j in vogais) {
        if (strSplit[i] === vogais[j]) {
            vogal++
        }
    }   
}

print()