// Funções
function addNumber(x: number, y: number): number {
    return x + y;
}

function addToHello(name: string) {
    return `Hello ${name}`;
}

let soma: number = addNumber(4, 7);
console.log(soma);
console.log(addToHello("André"));

// Funçoes Multtypes
function CallToPhone(phone: number | string): number | string {
    return phone;
}

console.log(CallToPhone(91111111));
console.log(CallToPhone("9111-1111"));

// Funções Assincronas
async function getDatabase(id: string | number): Promise<string | number> {
    return id
}

let informacao = getDatabase("Resultado função assincrona " + 10);
console.log(informacao);