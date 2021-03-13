package com.example.androiddevchallenge.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.screens.widgets.CollectionItem

@Composable
fun HomeScreen() {

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {

        item {
            Text(text = "Some Collection")

            LazyRow(modifier = Modifier.height(400.dp)) {
                items(20) {
                    Column() {
                        CollectionItem(
                            text = "Sample",
                            backgroundColor = MaterialTheme.colors.primary,
                            image = painterResource(id = R.drawable.ic_launcher_foreground)
                        )

                        CollectionItem(
                            text = "Sample",
                            backgroundColor = MaterialTheme.colors.primary,
                            image = painterResource(id = R.drawable.ic_launcher_foreground)
                        )
                    }
                }
            }
        }

    }
}


@Composable
@Preview
fun HomeScreenPreview() = HomeScreen()