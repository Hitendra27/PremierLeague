package com.example.premierleague

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.premierleague.ui.theme.PremierLeagueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PremierLeagueTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun TeamIcon() {
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
        Text(text = stringResource(R.string.stadium, teamGround))
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PremierLeagueTheme {

    }
}
