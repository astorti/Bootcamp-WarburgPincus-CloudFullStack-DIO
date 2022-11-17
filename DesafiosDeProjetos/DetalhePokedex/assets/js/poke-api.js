
const pokeApi = {}

function convertPokemonApiDetailToPokemon(pokeDetail) {
    const pokemon = new Pokemon()
    pokemon.number = pokeDetail.id
    pokemon.name = pokeDetail.name
    
    const types = pokeDetail.types.map((typeSlot) => typeSlot.type.name)
    const [type] = types

    pokemon.types = types
    pokemon.type = type

    pokemon.photo = pokeDetail.sprites.other.dream_world.front_default

    pokemon.species = pokeDetail.species
    pokemon.height = pokeDetail.height
    pokemon.weight = pokeDetail.weight

    const abilities = pokeDetail.abilities.map((typeAbilities) => typeAbilities.ability)
    const [ability] = abilities
    pokemon.abilities = abilities
    pokemon.ability = ability

    pokemon.base_experience = pokeDetail.base_experience
    pokemon.order = pokeDetail.order

    return pokemon
}

pokeApi.getPokemonDetail = (pokemon) => {
    return fetch(pokemon.url)
        .then((response) => response.json())
        .then(convertPokemonApiDetailToPokemon)
}

pokeApi.getPokemons = (offset = 0, limit = 10) => {
    const url = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`
    return fetch(url)
        .then((response) => response.json())
        .then((jsonBody) => jsonBody.results)
        .then((pokemons) => pokemons.map(pokeApi.getPokemonDetail))
        .then((detailRequest) => Promise.all(detailRequest))
        .then((pokemonsDetails) => pokemonsDetails)
}

pokeApi.getOnePokemon = (pokemon) => {
    const url = `https://pokeapi.co/api/v2/pokemon/${pokemon}/`
    return fetch(url)
        .then((response) => response.json())
        .then(convertPokemonApiDetailToPokemon)
}