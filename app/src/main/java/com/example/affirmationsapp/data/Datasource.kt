package com.example.affirmationsapp.data

import com.example.affirmationsapp.R
import com.example.affirmationsapp.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.pain, R.drawable.pain ),
            Affirmation(R.string.madara, R.drawable.uchiha),
            Affirmation(R.string.sasuke, R.drawable.sasuke),
            Affirmation(R.string.luffy, R.drawable.naruto),
            Affirmation(R.string.pain, R.drawable.itachi ),
            Affirmation(R.string.pain, R.drawable.pain )
        )
    }
}