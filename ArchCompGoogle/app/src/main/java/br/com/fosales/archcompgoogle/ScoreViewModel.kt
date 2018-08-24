package br.com.fosales.archcompgoogle

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ScoreViewModel(
        val scoreTeamA: MutableLiveData<Int> = MutableLiveData<Int>().apply { value = 0 },
        val scoreTemaB: MutableLiveData<Int> = MutableLiveData<Int>().apply { value = 0 }) : ViewModel() {


    fun updateTeamA() = update(scoreTeamA)

    fun updateTeamB() = update(scoreTemaB)

    fun reset() {
        scoreTeamA.value = 0
        scoreTemaB.value = 0
    }

    private fun update(score: MutableLiveData<Int>) {
        val value = score.value ?: 0
        score.value = value + 1
    }

}

