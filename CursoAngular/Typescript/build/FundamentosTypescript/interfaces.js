"use strict";
const bot = {
    id: 1,
    name: "Megaman",
};
const bot2 = {
    id: 2,
    name: "Ninja Gaiden",
    sayHello: function () {
        throw new Error("Function not implemented.");
    }
};
console.log(bot, bot2);
console.log(bot2.name = "Pacman");
class Pessoa {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    sayHello() {
        return "Hello";
    }
}
const p = new Pessoa(1, "Asimov");
console.log(p.sayHello());
