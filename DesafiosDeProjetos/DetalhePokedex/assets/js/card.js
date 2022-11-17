const body = document.getElementById('body-card')

function loadPokemonCard(id) {
    let cardSelected = id
    pokeApi.getOnePokemon(cardSelected).then((pokemon) => {
        const newCard = 
            `
            <link rel="stylesheet" href="./assets/css/global.css">
            <link rel="stylesheet" href="./assets/css/card.css">
    
            <section>
            <div class="main">
            <div id="loadCard" class="${pokemon.type}">
                <div class="card"">
                    <div class="button-card">
                        <img onclick="window.location.reload()" src="./assets/img/backArrow.png" alt="Return Page">
                        <img onclick="favoritos()" src="./assets/img/heart.png" alt="Favorite">
                    </div>
                    <div class="card-info">
                        <div class="card-info-name">
                            <h2 class="capitalize">${pokemon.name}</h2>
                            <div class="type-info">
                                ${pokemon.types.map((type) => `<li class="${type}">${type}</li>`).join('')}
                            </div>
                        </div>
                        <div>
                            <span>${pokemon.number}</span>
                        </div>
                    </div>
                    <div class="detail">
                        <img src="${pokemon.photo}" alt="${pokemon.name}">
                    </div>

                    <div class="pokeInfo">
                        <div class="menu-info">
                            <button>About</button>
                        </div>

                        <div class="datas">
                            <div class="row-align"><span>Species</span><h5>${pokemon.species.name}</h5></div>
                            <div class="row-align"><span>Height</span><h5>${pokemon.height}</h5></div>
                            <div class="row-align"><span>Weight</span><h5>${pokemon.weight}</h5></div>
                            <div class="row-align"><span>Abilities</span>
                                <h5>
                                    ${pokemon.abilities.map((abilities) => `<li class="abilities">${abilities.name}</li>`).join('')}
                                </h5>
                            </div>
                        </div>

                        <div class="division">
                            <span>-------</span>
                        </div>

                        <div class="datas">
                            <div class="row-align"><span>Base Exp</span><h5>${pokemon.base_experience}</h5></div>
                            <div class="row-align"><span>Order</span><h5>${pokemon.order}</h5></div>
                        </div>
                    </div>

                </div>
                    
            </div>
            </section>

        `
        document.body.innerHTML = newCard
        console.log(pokemon)
    })  
}

function favoritos() {
    alert("Função não disponivel")
}