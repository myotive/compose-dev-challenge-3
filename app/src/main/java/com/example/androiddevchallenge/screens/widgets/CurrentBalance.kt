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

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.androiddevchallenge.ui.theme.green

@Composable
fun CurrentBalance() = Column(
    modifier = Modifier
        .fillMaxWidth()
        .padding(start = 16.dp, end = 16.dp)
        .height(250.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceEvenly
) {

    Text(
        text = "Balance",
        color = MaterialTheme.colors.onBackground,
        style = MaterialTheme.typography.subtitle1,
    )
    Text(
        text = "$73,589.01",
        color = MaterialTheme.colors.onBackground,
        style = MaterialTheme.typography.h1,
        letterSpacing = 0.0.em
    )
    Text(
        text = "+412.35 today",
        color = green,
        style = MaterialTheme.typography.subtitle1,
    )

    Spacer(modifier = Modifier.height(8.dp))

    Button(
        shape = RoundedCornerShape(18.dp),
        modifier = Modifier.fillMaxWidth().height(48.dp),
        onClick = {}
    ) {
        Text(
            text = "TRANSACT",
        )
    }
}

@Preview
@Composable
fun CurrentBalancePreview() = CurrentBalance()
