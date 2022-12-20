"use strict";
// Generics
function concatArray(...itens) {
    return new Array().concat(...itens);
}
const numArray = concatArray([1, 5], [3]);
const stgArray = concatArray(["robot", "alien"], ["sci-fi"]);
numArray.push([9]);
stgArray.push(["hello"]);
console.log(numArray);
console.log(stgArray);
