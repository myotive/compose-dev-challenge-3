package com.example.androiddevchallenge.screens.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Composable
fun Graph() =
    Image(
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        contentScale = ContentScale.FillBounds,
        painter = painterResource(id = R.drawable.ic_home_illos),
        contentDescription = "Illos graphic"
    )