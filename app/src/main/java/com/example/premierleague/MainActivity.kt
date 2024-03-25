package com.example.premierleague

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.premierleague.data.Team
import com.example.premierleague.data.teams
import com.example.premierleague.ui.theme.PremierLeagueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PremierLeagueTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    PremierLeageApp()
                }
            }
        }
    }
}

/**
 * Composable that displays an app and a list of teams.
 *
 */
@Composable
fun PremierLeageApp() {
    Scaffold { it ->
        LazyColumn(contentPadding = it) {
            items(teams) {
                TeamItem(
                    team = it,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small)))
            }
        }
    }
}

/**
 * Composable that displays a list item containing a team icon and their information.
 *
 * @param team contains the data that populates the list item
 * @param modifier modifiers to set to this composable
 */
@Composable
fun TeamItem(
    team: Team,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            TeamIcon(team.imageResourceId)
            TeamInformation(team.name, team.ground)
        }
    }
}

/**
 * Composable that displays a photo of a team.
 *
 * @param teamIcon is the resource ID for the image of the team
 * @param modifier modifiers to set to this composable
 */
@Composable
fun TeamIcon(
    @DrawableRes teamIcon: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .size(dimensionResource(R.dimen.image_size))
            .padding(dimensionResource(R.dimen.padding_small)),
        painter = painterResource(teamIcon),
        contentDescription = null)
}

/**
 * Composable that displays a team's name and ground.
 *
 * @param teamName is the resource ID for the string of the team's name
 * @param teamGround is the Int that represents the team's home ground
 * @param modifier modifiers to set to this composable
 */
@Composable
fun TeamInformation(
    @StringRes teamName: Int,
    @StringRes teamGround: Int,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Text(
            text = stringResource(teamName),
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
        )
        Text(text = stringResource(teamGround))
    }
}
@Preview(showBackground = true)
@Composable
fun PremierLeagueThemePreview() {
    PremierLeagueTheme() {
        PremierLeageApp()

    }
}

@Preview
@Composable
fun PremierLeagueDarkThemePreview() {
    PremierLeagueTheme(useDarkTheme = true) {
        PremierLeageApp()
    }
}
