package ca.tanle.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white") val black_white: BlackWhite
)