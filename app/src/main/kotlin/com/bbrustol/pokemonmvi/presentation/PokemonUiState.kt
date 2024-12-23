package com.bbrustol.pokemonmvi.presentation

internal sealed interface HomeUiState {
    data class HomeState(val user: GoogleUserModel) : HomeUiState
    data object Loading : HomeUiState
}

internal sealed interface HomeEvent

internal sealed interface HomeSideEffect {
    data class showError(val message: String) : HomeSideEffect
}

internal class LoginPresenter