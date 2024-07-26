package ca.tanle.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import ca.tanle.pokedex.data.remote.response.Pokemon
import ca.tanle.pokedex.repository.PokemonRepository
import ca.tanle.pokedex.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) :ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }
}