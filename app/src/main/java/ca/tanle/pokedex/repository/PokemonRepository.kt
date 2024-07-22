package ca.tanle.pokedex.repository

import ca.tanle.pokedex.data.remote.PokeApi
import ca.tanle.pokedex.data.remote.response.Pokemon
import ca.tanle.pokedex.data.remote.response.PokemonList
import ca.tanle.pokedex.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository
@Inject constructor(
    private val api: PokeApi
)
{
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        }catch (e: Exception){
            return Resource.Error("An unknown error occurred!")
        }

        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        }catch (e: Exception){
            return Resource.Error("An unknown error occurred!")
        }

        return Resource.Success(response)
    }
}