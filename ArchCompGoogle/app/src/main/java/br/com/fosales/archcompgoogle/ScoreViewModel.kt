package br.com.fosales.archcompgoogle

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ScoreViewModel(val team: MutableLiveData<Team> = MutableLiveData<Team>().apply {
    value = Team()
}) : ViewModel() {

    fun updateTeamA() {
        team.value = Team(incrementa(team.value?.scoreA!!), team.value?.scoreB)
    }

    fun updateTeamB() {
        team.value = Team(team.value?.scoreA, incrementa(team.value?.scoreB!!))
    }

    fun reset() {
        team.value = Team()
    }

    private fun incrementa(valor: Int): Int = valor.plus(1)
}

data class Team(var scoreA: Int? = 0, var scoreB: Int? = 0)

