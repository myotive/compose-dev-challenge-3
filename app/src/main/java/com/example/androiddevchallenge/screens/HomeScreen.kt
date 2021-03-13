package com.example.androiddevchallenge.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.screens.widgets.CurrentBalance
import com.example.androiddevchallenge.screens.widgets.Filters
import com.example.androiddevchallenge.screens.widgets.Graph
import com.example.androiddevchallenge.screens.widgets.HeaderRow
import com.example.androiddevchallenge.screens.widgets.Positions

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background),
    ) {
        item {
            HeaderRow()
        }

        item {
            CurrentBalance()
        }

        item {
            Filters()
        }

        item {
            Graph()
        }

        item {
            Positions()
        }
    }
}


@Composable
@Preview
fun HomeScreenPreview() = HomeScreen()