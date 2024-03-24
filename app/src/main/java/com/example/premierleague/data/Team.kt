package com.example.premierleague.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.premierleague.R

data class Team(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val nickName: Int,
    val since: Int,
    @StringRes val ground: Int
)

val teams = listOf(
    Team(R.drawable.arsenal_fc_svg, R.string.team_1, R.string.team_1_nickname, 2005, R.string.team_1_ground),
    Team(R.drawable.liverpool_fc_svg, R.string.team_2, R.string.team_2_nickname, 2005, R.string.team_2_ground),
    Team(R.drawable.manchester_city_fc_badge_svg, R.string.team_3, R.string.team_3_nickname, 2005, R.string.team_3_ground),
    Team(R.drawable.aston_villa_logo_svg, R.string.team_4, R.string.team_4_nickname, 2005, R.string.team_4_ground),
    Team(R.drawable.tottenham_hotspur_svg, R.string.team_5, R.string.team_5_nickname, 2005, R.string.team_5_ground),
    Team(R.drawable.manchester_united_fc_crest_svg, R.string.team_6, R.string.team_6_nickname, 2005, R.string.team_6_ground),
    Team(R.drawable.west_ham_united_fc_logo_svg, R.string.team_7, R.string.team_7_nickname, 2005, R.string.team_7_ground),
    Team(R.drawable.brighton___hove_albion_logo_svg, R.string.team_8, R.string.team_8_nickname, 2005, R.string.team_8_ground),
    Team(R.drawable.wolverhampton_wanderers_svg, R.string.team_9, R.string.team_9_nickname, 2005, R.string.team_9_ground),
    Team(R.drawable.newcastle_united_logo_svg, R.string.team_10, R.string.team_10_nickname, 2005, R.string.team_10_ground),
    Team(R.drawable.chelsea_fc_svg, R.string.team_11, R.string.team_11_nickname, 2005, R.string.team_11_ground),
    Team(R.drawable.fulham_fc__shield__svg, R.string.team_12, R.string.team_12_nickname, 2005, R.string.team_12_ground),
    Team(R.drawable.afc_bournemouth__2013__svg, R.string.team_13, R.string.team_13_nickname, 2005, R.string.team_13_ground),
    Team(R.drawable.crystal_palace_fc_logo__2022__svg, R.string.team_14, R.string.team_14_nickname, 2005, R.string.team_14_ground),
    Team(R.drawable.brentford_fc_crest_svg, R.string.team_15, R.string.team_15_nickname, 2005, R.string.team_15_ground),
    Team(R.drawable.everton_fc_logo_svg, R.string.team_16, R.string.team_16_nickname, 2005, R.string.team_16_ground),
    Team(R.drawable.nottingham_forest_f_c__logo_svg, R.string.team_17, R.string.team_17_nickname, 2005, R.string.team_17_ground),
    Team(R.drawable.luton_town_logo_svg, R.string.team_18, R.string.team_18_nickname, 2005, R.string.team_18_ground),
    Team(R.drawable.burnley_fc_logo_svg, R.string.team_19, R.string.team_19_nickname, 2005, R.string.team_19_ground),
    Team(R.drawable.sheffield_united_fc_logo_svg, R.string.team_20, R.string.team_20_nickname, 2005, R.string.team_20_ground)
)