// Interfaces (type X interface)
type robot = {
    readonly id: number | string;
    name: string;
};

interface robot2 {
    readonly id: number | string;
    name: string;
    sayHello(): string;
}

const bot: robot = {
    id: 1,
    name: "Megaman",
}

const bot2: robot2 = {
    id: 2,
    name: "Ninja Gaiden",
    sayHello: function (): string {
        throw new Error("Function not implemented.");
    }
}

console.log(bot, bot2);
console.log(bot2.name = "Pacman");

class Pessoa implements robot2{
    id: string | number;
    name: string;

    constructor(id: string | number, name: string) {
        this.id = id
        this.name = name
    }
    sayHello(): string {
        return "Hello";
    }
}

const p = new Pessoa(1, "Asimov");
console.log(p.sayHello());

