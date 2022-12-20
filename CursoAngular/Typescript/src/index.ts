type hero = {
    name: string;
    nickname: string;
    city: string;
};

function printObject(people: hero) {
    console.log(people);
}

printObject({
    name: "Bruce Wayne",
    nickname: "Batman",
    city: "Gothan",
});