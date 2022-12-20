// Generics
function concatArray<T>(...itens: T[]): T[] {
    return new Array().concat(...itens);
}

const numArray = concatArray<number[]>([1, 5], [3]);
const stgArray = concatArray<string[]>(["robot", "alien"], ["sci-fi"]);

numArray.push([9]);
stgArray.push(["hello"]);
console.log(numArray);
console.log(stgArray)