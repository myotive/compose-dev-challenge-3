package com.example.androiddevchallenge.screens.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.onBackground66

@Composable
fun HeaderRow() = Row(
    modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .height(50.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceAround
) {
    Text(
        text = "ACCOUNT",
        color = MaterialTheme.colors.onBackground,
        style = MaterialTheme.typography.button,
        textAlign = TextAlign.Center,
        modifier = Modifier.clickable {

        }
    )

    Text(
        text = "WATCHLIST",
        color = onBackground66,
        style = MaterialTheme.typography.button,
        textAlign = TextAlign.Center,
        modifier = Modifier.clickable {

        }
    )

    Text(
        text = "PROFILE",
        color = onBackground66,
        style = MaterialTheme.typography.button,
        textAlign = TextAlign.Center,
        modifier = Modifier.clickable {

        }
    )
}

@Composable
@Preview
fun HeaderRowPreview() = HeaderRow()