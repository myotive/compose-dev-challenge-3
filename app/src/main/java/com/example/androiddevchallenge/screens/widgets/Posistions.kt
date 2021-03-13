package com.example.androiddevchallenge.screens.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.FinancialPosition
import com.example.androiddevchallenge.ui.theme.red

@Composable
fun Positions() = Column {

    Box(
        modifier = Modifier
            .height(64.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colors.surface)
    ) {
        Text(
            "Positions",
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.subtitle1,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.Center),
        )
    }

    Column(
        modifier = Modifier.background(color = MaterialTheme.colors.surface),
        content = {

            Divider()

            FinancialPosition::class.sealedSubclasses.mapNotNull { it.objectInstance }.forEach {
                fp ->
                Row(
                    modifier = Modifier
                        .height(56.dp)
                        .fillMaxWidth()
                        .padding(8.dp)
                        .background(color = MaterialTheme.colors.surface),
                    verticalAlignment = Alignment.Top
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = fp.amount,
                            color = MaterialTheme.colors.onSurface,
                            style = MaterialTheme.typography.body1
                        )
                        Text(
                            text = fp.percent,
                            color = fp.color,
                            style = MaterialTheme.typography.body1
                        )
                    }
                    Column(modifier = Modifier.weight(2f)) {
                        Text(
                            text = fp.symbol,
                            color = MaterialTheme.colors.onSurface,
                            style = MaterialTheme.typography.h3
                        )
                        Text(
                            text = fp.name,
                            color = MaterialTheme.colors.onSurface,
                            style = MaterialTheme.typography.body1
                        )
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        Image(
                            painter = painterResource(id = fp.graph),
                            contentDescription = fp.symbol
                        )
                    }
                }
            }

//        repeat((0..10).count()) {
//            Row(
//                modifier = Modifier
//                    .height(56.dp)
//                    .fillMaxWidth()
//                    .padding(8.dp)
//                    .background(color = MaterialTheme.colors.surface),
//                verticalAlignment = Alignment.Top
//            ) {
//                Column(modifier = Modifier.weight(1f)) {
//                    Text(
//                        text = "$7,918",
//                        color = MaterialTheme.colors.onSurface,
//                        style = MaterialTheme.typography.body1
//                    )
//                    Text(
//                        text = "-0.54%", color = red,
//                        style = MaterialTheme.typography.body1
//                    )
//                }
//                Column(modifier = Modifier.weight(2f)) {
//                    Text(
//                        text = "ALK",
//                        color = MaterialTheme.colors.onSurface,
//                        style = MaterialTheme.typography.h3
//                    )
//                    Text(
//                        text = "Alaska Air Group, Inc.",
//                        color = MaterialTheme.colors.onSurface,
//                        style = MaterialTheme.typography.body1
//                    )
//                }
//                Box(modifier = Modifier.weight(1f)) {
//                    Image(
//                        painter = painterResource(id = R.drawable.ic_home_alk),
//                        contentDescription = "ALK"
//                    )
//                }
//            }

            Divider()
        })
}

@Preview
@Composable
fun PositionsPreview() = Positions()