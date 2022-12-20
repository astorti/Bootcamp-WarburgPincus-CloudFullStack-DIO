// Objeto 
let produto: object = {
    name: "Andre",
    city: "SP",
    age: 40,
}

// Maneira ideal de criar um objeto
type ProdutoLoja = {
    nome: string;
    preco: number;
    unidades: number;
}

let meuProduto: ProdutoLoja = {
    nome: "Tênis",
    preco: 199.99,
    unidades: 5,
}