package ca.tanle.pokedex.pokemondetail

import android.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import ca.tanle.pokedex.data.remote.response.Pokemon

@Composable
fun PokemonDetailScreen(
    dominantColor: Color,
    pokemonName: String,
    navController: NavController,
    topPadding: Dp = 20.dp,
    pokemonImageSize: Dp = 20.dp,
    viewModel: PokemonDetailViewModel = hiltViewModel()
    ) {

}