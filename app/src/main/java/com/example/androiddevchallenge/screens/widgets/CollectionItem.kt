package com.example.androiddevchallenge.screens.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R


@Composable
fun CollectionItem(text: String,
                   image: Painter,
                   backgroundColor: Color,
                   contentDescription: String = "") =
    Row(
        modifier = Modifier
            .background(color = backgroundColor)
            .height(100.dp)
            .width(300.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = image,
            modifier = Modifier.fillMaxHeight(),
            contentDescription = contentDescription
        )

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = text,
                textAlign = TextAlign.Center
            )
        }
    }


@Preview
@Composable
fun CollectionItemPreview() =
    CollectionItem(text = "Sample",
        backgroundColor = MaterialTheme.colors.primary,
        image = painterResource(id = R.drawable.ic_launcher_foreground)
    )