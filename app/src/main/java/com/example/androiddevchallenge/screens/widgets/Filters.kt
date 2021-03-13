package com.example.androiddevchallenge.screens.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Composable
fun Filters() = LazyRow(
    modifier = Modifier
        .fillMaxWidth()
        .offset(x = 10.dp)
        .height(40.dp),
    horizontalArrangement = Arrangement.SpaceEvenly,
    content = {
        item {
            OutlinedButton(
                shape = RoundedCornerShape(18.dp),
                modifier = Modifier
                    .height(40.dp)
                    .padding(start = 8.dp),
                border = BorderStroke(1.dp, MaterialTheme.colors.onBackground),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = MaterialTheme.colors.onBackground,
                    backgroundColor = Color.Transparent,
                ),
                onClick = { /*TODO*/ }) {
                Text(
                    text = "Week",
                )

                Image(
                    painter = painterResource(id = R.drawable.ic_expand),
                    contentDescription = "Expand"
                )
            }
        }
        items(10) {
            OutlinedButton(
                shape = RoundedCornerShape(18.dp),
                modifier = Modifier
                    .height(40.dp)
                    .padding(start = 8.dp),
                border = BorderStroke(1.dp, MaterialTheme.colors.onBackground),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = MaterialTheme.colors.onBackground,
                    backgroundColor = Color.Transparent,
                ),
                onClick = { /*TODO*/ }) {
                Text(
                    text = "EFTs",
                )
            }
        }
    })


@Preview
@Composable
fun FiltersPreview() = Filters()