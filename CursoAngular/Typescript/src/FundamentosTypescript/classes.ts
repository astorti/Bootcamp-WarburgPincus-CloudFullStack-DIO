// Classes
// Data Modifiers: public, private, protected
class Character {
    private name?: string;
    public strength: number;
    protected skill: number;

    constructor(name: string, strength: number, skill: number) {
        this.name = name
        this.strength = strength;
        this.skill = skill;
    }

    attack(): void {
        console.log(`Attack with ${this.strength} points`)
    }
}

const p1 = new Character("Ryu", 10, 98);
console.log(p1);
p1.attack();

// Herança
class Magician extends Character{
    magicPoints: number;
    constructor(
        name: string,
        strength: number,
        skill: number,
        magicPoints: number
    ) {
        super(name, strength, skill)
        this.magicPoints = magicPoints;
    }
}

const p2 = new Magician("Mago", 9, 30, 100);
console.log(p2);