package com.example.premierleague.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Team(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val nickName: Int,
    val since: Int,
    @StringRes val ground: Int
)
