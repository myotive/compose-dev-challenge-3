/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
